package com.wangjt.calendar.util;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import com.wangjt.calendar.mysql.dao.model.CalendarEvent;
import com.wangjt.calendar.mysql.dao.model.CalendarEventReminder;
import com.wangjt.calendar.service.CalendarEventReminderService;
import com.wangjt.calendar.service.CalendarEventService;
import com.wangjt.util.SendEMail;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class RefreshMailCacheJob implements Job {

	public static Logger logger = Logger.getLogger(RefreshMailCacheJob.class);

	/**
	 * 可以优化到视图数据库中
	 */
	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {

		CalendarEventService calendarEventService = (CalendarEventService) ToolSpring.getBean("calendarEventService");
		CalendarEventReminderService calendarEventReminderService = (CalendarEventReminderService) ToolSpring.getBean("calendarEventReminderService");

		List<CalendarEvent> simpleMailEvent = calendarEventService.loadSimpleMailEvent();
		List<CalendarEvent> repeatMailEvent = calendarEventService.loadRepeatMailEvent();

//		当前日期
		Date currentTime = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String dateString = formatter.format(currentTime);
		
//		查找重复事件且选择邮件提醒的
//		经检验今天发送邮件的，发送邮件并修改提醒状态
//		修改提醒状态，后续不再重复发送邮件
		for(int i=0;i<repeatMailEvent.size();i++) {
			CalendarEvent c = repeatMailEvent.get(i);

			if(check(c)) {
//				提醒时间匹配
				if("yes".equals(RepeatType.getRepeatTypeEvent(c, dateString))) {
//					提醒规则匹配-重复
					System.out.println("解析结果 " + ": yes ");
//					查询提醒处理结果，并发出提醒
//					日程的起始时间需要修改，时间修改需要考虑跨天
					remind(calendarEventReminderService, c, dateString);
				}
			}
		}

		for(int i=0;i<simpleMailEvent.size();i++) {
			CalendarEvent c = simpleMailEvent.get(i);
			if(check(c)) {
//				提醒时间匹配
//				查询提醒处理结果，并发出提醒
				remind(calendarEventReminderService, c, dateString);
			}
		}
		
		System.err.println("刷新工作台日志结束。"); 
	}

	private void remind(CalendarEventReminderService calendarEventReminderService, CalendarEvent c, String dateString) {
		List<CalendarEventReminder>  list = calendarEventReminderService.loadCalendarEventReminder(c.getId());
		for(CalendarEventReminder calendarEventReminder : list){
			if("false".equals(calendarEventReminder.getAlerted())&&"email".equals(calendarEventReminder.getType())
					&&!dateString.equals(calendarEventReminder.getAlertDate())) {
				send(calendarEventReminderService, c, calendarEventReminder);
			}
		}
	}

	private boolean check(CalendarEvent c) {
		Date currentTime = new Date();
		Calendar calendar = Calendar.getInstance();  
		calendar.setTime(currentTime);

		JSONArray rts = JSONArray.fromObject(c.getAlertFlag());
		JSONObject rt = (JSONObject) rts.get(0);

//			[{"type":"email","early":20,"unit":"minute"}]
		int v = rt.getInt("early");
		if("minute".equals(rt.get("unit"))) {
			calendar.add(Calendar.MINUTE, v);   
		} else if("hour".equals(rt.get("unit"))) {
			calendar.add(Calendar.HOUR, v);   
		} else if("day".equals(rt.get("unit"))) {
			calendar.add(Calendar.DATE, v);   
		} else if("wek".equals(rt.get("unit"))) {
			calendar.add(Calendar.DATE, v*7);   
		}

//        ['minute', '分钟'],
//        ['hour', '小时'],
//        ['day', '天'],
//        ['wek', '周']
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String f = formatter.format(calendar.getTime());
//			当前时间加上提醒预留时间小于事情起始时间则应该提醒
//			反之尚未到需要提醒的时间
		boolean flag = f.compareToIgnoreCase(c.getStartTime())>=0;
		return flag;
	}

	private void send(CalendarEventReminderService calendarEventReminderService, CalendarEvent c, CalendarEventReminder calendarEventReminder) {
//						发送邮件并修改数据库状态
		String id = SendEMail.mailLog(c.getId(),calendarEventReminder.getId(),"init");
		List<String> tos = new ArrayList<String>();
		tos.add("wangjiangtao@freedomsoft.com.cn");
//						测试直接嵌入IFRAME 不行
		String title = SendEMail.getTitle(c.getSubject(),c.getStartDay() +" "+ c.getStartTime());
//		String title,String userName,String endTime,String startTime,String content,String viewLink,String model
		SendEMail.sendMessage(title, 
				SendEMail.getContent(
						title,
						c.getUserId(),//TODO:userName
						c.getStartDay() +" "+ c.getStartTime(),
						c.getEndDay() +" "+ c.getEndTime(),
						c.getDescription(),
						getViewLink(c.getId()),
						"email.htm"
						), tos,id);
		
		calendarEventReminder.setAlerted("true");
		calendarEventReminder.setAlertDate(c.getStartDay());
		calendarEventReminderService.updateByPrimaryKey(calendarEventReminder);
	}

	private String getViewLink(String id) {
		return "http://localhost/calendar/viewCalendar.html?eventId=" + id;
	}
}
