package com.wangjt.calendar.web;


import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wangjt.calendar.mysql.dao.model.CalendarPwd;
import com.wangjt.calendar.mysql.dao.model.CalendarUser;
import com.wangjt.calendar.service.CalendarPwdService;
import com.wangjt.calendar.service.CalendarUserService;
import com.wangjt.calendar.util.SysUtile;
import com.wangjt.util.JsonHelper;

import elven.CryptoJS.SecurityInfo;
import elven.CryptoJS.SecurityUtil;
import elven.encryption.MD5Util;

@Controller
public class IndexController {

	@Autowired
	private CalendarPwdService calendarPwdService;
	@Autowired
	private CalendarUserService calendarUserService;
	
	/**
	 * 手机验证码？
	 * @param calendarPwd
	 * @return
	 */
	@RequestMapping(value = "/initKey.html")
	@ResponseBody
	public String initKey() {
		try {
			int r = new Random().nextInt(4);
			return r+"";
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	    return "";
	}
	public int initRandom() {
		try {
			int r = new Random().nextInt(4);
			return r;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	    return 0;
	}
	
	@RequestMapping(value = "/locallogin.html")
	@ResponseBody
	public String login(CalendarPwd calendarPwd,HttpSession session) {
		String r = "0"; 
		try {
	        System.out.println(calendarPwd.getUserPwd() + " ----> plaintext = " + decrypt(calendarPwd.getUserPwd()));
			CalendarPwd cpwd = calendarPwdService.getCalendarPwdMapperById(calendarPwd.getUserId());
			if(null!=cpwd&&StringUtils.isNotEmpty(cpwd.getUserId())) {
//				用户存在
				calendarPwd.setRnum(cpwd.getRnum());
				if(check(calendarPwd, cpwd)){
//					用户登录成功
					CalendarUser user = calendarUserService.getCalendarUserMapperById(cpwd.getUserId());
					session.setAttribute("user", user);
					r=JsonHelper.ToJson(user);
				} else {
//					密码错误
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	    return r;
	}

	/**
	 * 注册新用户
	 * 
	 * @param calendarPwd
	 * @return
	 */
	@RequestMapping(value = "/localregist.html")
	@ResponseBody
	public String regist(CalendarPwd calendarPwd,HttpSession session) {
		String r = "0"; 
		try {
	        System.out.println(calendarPwd.getUserPwd() + " ----> plaintext = " + decrypt(calendarPwd.getUserPwd()));
			CalendarPwd cpwd = calendarPwdService.getCalendarPwdMapperById(calendarPwd.getUserId());
			if(null!=cpwd&&StringUtils.isNotEmpty(cpwd.getUserId())) {
//				用户存在
			} else{
				if(null==calendarPwd.getRnum()||0==calendarPwd.getRnum()){
//					页面没有输入,后台随机
					calendarPwd.setRnum(initRandom());
				}
				String p = getppwd(calendarPwd);
				calendarPwd.setUserPwd(p);
				calendarPwdService.createCalendarPwd(calendarPwd);
				CalendarUser user = calendarUserService.getCalendarUserMapperById(cpwd.getUserId());
				session.setAttribute("user", user);
				r=JsonHelper.ToJson(user);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	    return r;
	}
	@RequestMapping(value = "/localchangePWD.html")
	@ResponseBody
	public String update(CalendarPwd calendarPwd,HttpServletRequest request) {
		String r = "0"; 
		try {
	        System.out.println(calendarPwd.getUserPwd() + " ----> plaintext = " + decrypt(calendarPwd.getUserPwd()));
			CalendarPwd cpwd = calendarPwdService.getCalendarPwdMapperById(calendarPwd.getUserId());
			
			if(null!=cpwd&&StringUtils.isNotEmpty(cpwd.getUserId())) {
//				用户存在
				calendarPwd.setRnum(cpwd.getRnum());
				if(check(calendarPwd, cpwd)){
//					原始密码正确
					String ruserPwd=request.getParameter("ruserPwd");
//					用户名匹配
					if(cpwd.getUserId().equals(SysUtile.getUserId(request))){
						if(null==calendarPwd.getRnum()||0==calendarPwd.getRnum()){
//							页面没有输入,后台随机
							calendarPwd.setRnum(initRandom());
						}
//						修改密码
						calendarPwd.setUserPwd(ruserPwd);
						String p = getppwd(calendarPwd);
						calendarPwd.setUserPwd(p);
						calendarPwdService.updateByPrimaryKeySelective(calendarPwd);
						 r = "1"; 
					}
				} else {
//					密码错误
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	    return r;
	}

	private static final String DL = "__bcdef567kop48__";
//	private static final String KEY = "101";
//    private static final String ALGORITHMSTR = "AES/ECB/PKCS5Padding";

//    public static void main(String[] args) throws Exception {
//        String content = "encryption";  
//
//        String j = SymmetricEncoder.AESEncode(KEY, content);
//        System.out.println("加密后：" + j);
//        String j2 = SymmetricEncoder.AESDncode(KEY, j);
//        System.out.println("解密后：" + j2);
//        
//    }

	private String decrypt( String input ) {
        String[] values = input.split( DL );
        String indices = values[values.length - 1];
        SecurityInfo securityInfo = new SecurityInfo( values, indices );
        SecurityUtil aesUtil = new SecurityUtil( securityInfo.getKeySize(), securityInfo.getIterationCount() );
        return aesUtil.decrypt( securityInfo.getSalt(), securityInfo.getIv(), securityInfo.getPassPhrase(), securityInfo.getCipherText() );

    }
//	检查用户输入的密码是否与数据库一致
	private boolean check(CalendarPwd calendarPwd, CalendarPwd cpwd) {
		String p = getppwd(calendarPwd);
		return p.equals(cpwd.getUserPwd());
	}

//	获取用于持久化的密码
	private String getppwd(CalendarPwd calendarPwd) {
		return MD5Util.MD5Encode(decrypt(calendarPwd.getUserPwd()) + "_" + calendarPwd.getRnum());
	}


//    public static void main(String[] args) {
//        String dl = "__bcdef567kop48__";
//        // for string "test"
//        String s = "%63%38%61%38%33%37%62%33%31%64%2E%32%61%63%38__bcdef567kop48__1000__bcdef567kop48__4b30f6838362407954cb0cb0155f588f__bcdef567kop48__iCQ05Rkus2o/1i/2IaCooQ==__bcdef567kop48__4026c9cffa3567db126b3aaa70d0ea50__bcdef567kop48__128__bcdef567kop48__d,e,1,0,c,5";
//        System.out.println("----dl = " + dl+"----s = " + s);
//        System.out.println("s = " + decrypt(s));
//    }
}