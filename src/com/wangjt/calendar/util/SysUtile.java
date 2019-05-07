package com.wangjt.calendar.util;

import javax.servlet.http.HttpServletRequest;

import com.wangjt.calendar.mysql.dao.model.CalendarUser;

public class SysUtile {

	public static String getUserId(HttpServletRequest request) {
		return getUser(request).getUserId();
	}

	public static CalendarUser getUser(HttpServletRequest request) {
		return (CalendarUser)request.getSession().getAttribute("user");
	}
}