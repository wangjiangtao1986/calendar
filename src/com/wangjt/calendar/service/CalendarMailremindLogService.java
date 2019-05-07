package com.wangjt.calendar.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wangjt.calendar.mysql.dao.mapper.CalendarMailremindLogMapper;
import com.wangjt.calendar.mysql.dao.model.CalendarMailremindLog;

@Service
public class CalendarMailremindLogService {

	@Autowired
	private CalendarMailremindLogMapper calendarMailremindLogMapper;
	
	public static Logger logger = Logger.getLogger(CalendarMailremindLogService.class);


	public int createCalendarMailremindLog(CalendarMailremindLog record) {
		return calendarMailremindLogMapper.insert(record);
	}

	public int updateByPrimaryKeySelective(CalendarMailremindLog record) {
		return calendarMailremindLogMapper.updateByPrimaryKeySelective(record);
	}

	public CalendarMailremindLog getCalendarMailremindLogById(String userId) {
		return calendarMailremindLogMapper.selectByPrimaryKey(userId);
	}
}
