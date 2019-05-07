package com.wangjt.calendar.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wangjt.calendar.mysql.dao.mapper.CalendarPwdMapper;
import com.wangjt.calendar.mysql.dao.model.CalendarPwd;

@Service
public class CalendarPwdService {

	@Autowired
	private CalendarPwdMapper calendarUserMapper;
	
	public static Logger logger = Logger.getLogger(CalendarPwdService.class);


	public int createCalendarPwd(CalendarPwd record) {
		return calendarUserMapper.insert(record);
	}

	public int updateByPrimaryKeySelective(CalendarPwd record) {
		return calendarUserMapper.updateByPrimaryKeySelective(record);
	}

	public CalendarPwd getCalendarPwdMapperById(String userId) {
		return calendarUserMapper.selectByPrimaryKey(userId);
	}
}
