package com.wangjt.calendar.mysql.dao.model;

public class CalendarEvent {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column calendar_event.ID
     *
     * @mbggenerated Tue Apr 10 16:52:46 CST 2018
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column calendar_event.USER_ID
     *
     * @mbggenerated Tue Apr 10 16:52:46 CST 2018
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column calendar_event.CALENDAR_ID
     *
     * @mbggenerated Tue Apr 10 16:52:46 CST 2018
     */
    private String calendarId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column calendar_event.REPEAT_TYPE
     *
     * @mbggenerated Tue Apr 10 16:52:46 CST 2018
     */
    private String repeatType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column calendar_event.START_TIME
     *
     * @mbggenerated Tue Apr 10 16:52:46 CST 2018
     */
    private String startTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column calendar_event.END_DAY
     *
     * @mbggenerated Tue Apr 10 16:52:46 CST 2018
     */
    private String endDay;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column calendar_event.END_TIME
     *
     * @mbggenerated Tue Apr 10 16:52:46 CST 2018
     */
    private String endTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column calendar_event.CREATE_DATE
     *
     * @mbggenerated Tue Apr 10 16:52:46 CST 2018
     */
    private String createDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column calendar_event.DESCRIPTION
     *
     * @mbggenerated Tue Apr 10 16:52:46 CST 2018
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column calendar_event.SUBJECT
     *
     * @mbggenerated Tue Apr 10 16:52:46 CST 2018
     */
    private String subject;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column calendar_event.UPDATE_DATE
     *
     * @mbggenerated Tue Apr 10 16:52:46 CST 2018
     */
    private String updateDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column calendar_event.LOCKED1
     *
     * @mbggenerated Tue Apr 10 16:52:46 CST 2018
     */
    private String locked1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column calendar_event.LOCKED
     *
     * @mbggenerated Tue Apr 10 16:52:46 CST 2018
     */
    private String locked;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column calendar_event.SUB_EVENTID
     *
     * @mbggenerated Tue Apr 10 16:52:46 CST 2018
     */
    private String subEventid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column calendar_event.YAOQINGEVENTID
     *
     * @mbggenerated Tue Apr 10 16:52:46 CST 2018
     */
    private String yaoqingeventid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column calendar_event.YAOQINGORDER
     *
     * @mbggenerated Tue Apr 10 16:52:46 CST 2018
     */
    private String yaoqingorder;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column calendar_event.ISMANAGER
     *
     * @mbggenerated Tue Apr 10 16:52:46 CST 2018
     */
    private String ismanager;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column calendar_event.LOCKEDF
     *
     * @mbggenerated Tue Apr 10 16:52:46 CST 2018
     */
    private String lockedf;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column calendar_event.YAOQING
     *
     * @mbggenerated Tue Apr 10 16:52:46 CST 2018
     */
    private String yaoqing;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column calendar_event.DBFLAG
     *
     * @mbggenerated Tue Apr 10 16:52:46 CST 2018
     */
    private String dbflag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column calendar_event.ALERT_FLAG
     *
     * @mbggenerated Tue Apr 10 16:52:46 CST 2018
     */
    private String alertFlag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column calendar_event.START_DAY
     *
     * @mbggenerated Tue Apr 10 16:52:46 CST 2018
     */
    private String startDay;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column calendar_event.ID
     *
     * @return the value of calendar_event.ID
     *
     * @mbggenerated Tue Apr 10 16:52:46 CST 2018
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column calendar_event.ID
     *
     * @param id the value for calendar_event.ID
     *
     * @mbggenerated Tue Apr 10 16:52:46 CST 2018
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column calendar_event.USER_ID
     *
     * @return the value of calendar_event.USER_ID
     *
     * @mbggenerated Tue Apr 10 16:52:46 CST 2018
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column calendar_event.USER_ID
     *
     * @param userId the value for calendar_event.USER_ID
     *
     * @mbggenerated Tue Apr 10 16:52:46 CST 2018
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column calendar_event.CALENDAR_ID
     *
     * @return the value of calendar_event.CALENDAR_ID
     *
     * @mbggenerated Tue Apr 10 16:52:46 CST 2018
     */
    public String getCalendarId() {
        return calendarId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column calendar_event.CALENDAR_ID
     *
     * @param calendarId the value for calendar_event.CALENDAR_ID
     *
     * @mbggenerated Tue Apr 10 16:52:46 CST 2018
     */
    public void setCalendarId(String calendarId) {
        this.calendarId = calendarId == null ? null : calendarId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column calendar_event.REPEAT_TYPE
     *
     * @return the value of calendar_event.REPEAT_TYPE
     *
     * @mbggenerated Tue Apr 10 16:52:46 CST 2018
     */
    public String getRepeatType() {
        return repeatType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column calendar_event.REPEAT_TYPE
     *
     * @param repeatType the value for calendar_event.REPEAT_TYPE
     *
     * @mbggenerated Tue Apr 10 16:52:46 CST 2018
     */
    public void setRepeatType(String repeatType) {
        this.repeatType = repeatType == null ? null : repeatType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column calendar_event.START_TIME
     *
     * @return the value of calendar_event.START_TIME
     *
     * @mbggenerated Tue Apr 10 16:52:46 CST 2018
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column calendar_event.START_TIME
     *
     * @param startTime the value for calendar_event.START_TIME
     *
     * @mbggenerated Tue Apr 10 16:52:46 CST 2018
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime == null ? null : startTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column calendar_event.END_DAY
     *
     * @return the value of calendar_event.END_DAY
     *
     * @mbggenerated Tue Apr 10 16:52:46 CST 2018
     */
    public String getEndDay() {
        return endDay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column calendar_event.END_DAY
     *
     * @param endDay the value for calendar_event.END_DAY
     *
     * @mbggenerated Tue Apr 10 16:52:46 CST 2018
     */
    public void setEndDay(String endDay) {
        this.endDay = endDay == null ? null : endDay.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column calendar_event.END_TIME
     *
     * @return the value of calendar_event.END_TIME
     *
     * @mbggenerated Tue Apr 10 16:52:46 CST 2018
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column calendar_event.END_TIME
     *
     * @param endTime the value for calendar_event.END_TIME
     *
     * @mbggenerated Tue Apr 10 16:52:46 CST 2018
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime == null ? null : endTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column calendar_event.CREATE_DATE
     *
     * @return the value of calendar_event.CREATE_DATE
     *
     * @mbggenerated Tue Apr 10 16:52:46 CST 2018
     */
    public String getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column calendar_event.CREATE_DATE
     *
     * @param createDate the value for calendar_event.CREATE_DATE
     *
     * @mbggenerated Tue Apr 10 16:52:46 CST 2018
     */
    public void setCreateDate(String createDate) {
        this.createDate = createDate == null ? null : createDate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column calendar_event.DESCRIPTION
     *
     * @return the value of calendar_event.DESCRIPTION
     *
     * @mbggenerated Tue Apr 10 16:52:46 CST 2018
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column calendar_event.DESCRIPTION
     *
     * @param description the value for calendar_event.DESCRIPTION
     *
     * @mbggenerated Tue Apr 10 16:52:46 CST 2018
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column calendar_event.SUBJECT
     *
     * @return the value of calendar_event.SUBJECT
     *
     * @mbggenerated Tue Apr 10 16:52:46 CST 2018
     */
    public String getSubject() {
        return subject;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column calendar_event.SUBJECT
     *
     * @param subject the value for calendar_event.SUBJECT
     *
     * @mbggenerated Tue Apr 10 16:52:46 CST 2018
     */
    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column calendar_event.UPDATE_DATE
     *
     * @return the value of calendar_event.UPDATE_DATE
     *
     * @mbggenerated Tue Apr 10 16:52:46 CST 2018
     */
    public String getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column calendar_event.UPDATE_DATE
     *
     * @param updateDate the value for calendar_event.UPDATE_DATE
     *
     * @mbggenerated Tue Apr 10 16:52:46 CST 2018
     */
    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate == null ? null : updateDate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column calendar_event.LOCKED1
     *
     * @return the value of calendar_event.LOCKED1
     *
     * @mbggenerated Tue Apr 10 16:52:46 CST 2018
     */
    public String getLocked1() {
        return locked1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column calendar_event.LOCKED1
     *
     * @param locked1 the value for calendar_event.LOCKED1
     *
     * @mbggenerated Tue Apr 10 16:52:46 CST 2018
     */
    public void setLocked1(String locked1) {
        this.locked1 = locked1 == null ? null : locked1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column calendar_event.LOCKED
     *
     * @return the value of calendar_event.LOCKED
     *
     * @mbggenerated Tue Apr 10 16:52:46 CST 2018
     */
    public String getLocked() {
        return locked;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column calendar_event.LOCKED
     *
     * @param locked the value for calendar_event.LOCKED
     *
     * @mbggenerated Tue Apr 10 16:52:46 CST 2018
     */
    public void setLocked(String locked) {
        this.locked = locked == null ? null : locked.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column calendar_event.SUB_EVENTID
     *
     * @return the value of calendar_event.SUB_EVENTID
     *
     * @mbggenerated Tue Apr 10 16:52:46 CST 2018
     */
    public String getSubEventid() {
        return subEventid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column calendar_event.SUB_EVENTID
     *
     * @param subEventid the value for calendar_event.SUB_EVENTID
     *
     * @mbggenerated Tue Apr 10 16:52:46 CST 2018
     */
    public void setSubEventid(String subEventid) {
        this.subEventid = subEventid == null ? null : subEventid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column calendar_event.YAOQINGEVENTID
     *
     * @return the value of calendar_event.YAOQINGEVENTID
     *
     * @mbggenerated Tue Apr 10 16:52:46 CST 2018
     */
    public String getYaoqingeventid() {
        return yaoqingeventid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column calendar_event.YAOQINGEVENTID
     *
     * @param yaoqingeventid the value for calendar_event.YAOQINGEVENTID
     *
     * @mbggenerated Tue Apr 10 16:52:46 CST 2018
     */
    public void setYaoqingeventid(String yaoqingeventid) {
        this.yaoqingeventid = yaoqingeventid == null ? null : yaoqingeventid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column calendar_event.YAOQINGORDER
     *
     * @return the value of calendar_event.YAOQINGORDER
     *
     * @mbggenerated Tue Apr 10 16:52:46 CST 2018
     */
    public String getYaoqingorder() {
        return yaoqingorder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column calendar_event.YAOQINGORDER
     *
     * @param yaoqingorder the value for calendar_event.YAOQINGORDER
     *
     * @mbggenerated Tue Apr 10 16:52:46 CST 2018
     */
    public void setYaoqingorder(String yaoqingorder) {
        this.yaoqingorder = yaoqingorder == null ? null : yaoqingorder.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column calendar_event.ISMANAGER
     *
     * @return the value of calendar_event.ISMANAGER
     *
     * @mbggenerated Tue Apr 10 16:52:46 CST 2018
     */
    public String getIsmanager() {
        return ismanager;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column calendar_event.ISMANAGER
     *
     * @param ismanager the value for calendar_event.ISMANAGER
     *
     * @mbggenerated Tue Apr 10 16:52:46 CST 2018
     */
    public void setIsmanager(String ismanager) {
        this.ismanager = ismanager == null ? null : ismanager.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column calendar_event.LOCKEDF
     *
     * @return the value of calendar_event.LOCKEDF
     *
     * @mbggenerated Tue Apr 10 16:52:46 CST 2018
     */
    public String getLockedf() {
        return lockedf;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column calendar_event.LOCKEDF
     *
     * @param lockedf the value for calendar_event.LOCKEDF
     *
     * @mbggenerated Tue Apr 10 16:52:46 CST 2018
     */
    public void setLockedf(String lockedf) {
        this.lockedf = lockedf == null ? null : lockedf.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column calendar_event.YAOQING
     *
     * @return the value of calendar_event.YAOQING
     *
     * @mbggenerated Tue Apr 10 16:52:46 CST 2018
     */
    public String getYaoqing() {
        return yaoqing;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column calendar_event.YAOQING
     *
     * @param yaoqing the value for calendar_event.YAOQING
     *
     * @mbggenerated Tue Apr 10 16:52:46 CST 2018
     */
    public void setYaoqing(String yaoqing) {
        this.yaoqing = yaoqing == null ? null : yaoqing.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column calendar_event.DBFLAG
     *
     * @return the value of calendar_event.DBFLAG
     *
     * @mbggenerated Tue Apr 10 16:52:46 CST 2018
     */
    public String getDbflag() {
        return dbflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column calendar_event.DBFLAG
     *
     * @param dbflag the value for calendar_event.DBFLAG
     *
     * @mbggenerated Tue Apr 10 16:52:46 CST 2018
     */
    public void setDbflag(String dbflag) {
        this.dbflag = dbflag == null ? null : dbflag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column calendar_event.ALERT_FLAG
     *
     * @return the value of calendar_event.ALERT_FLAG
     *
     * @mbggenerated Tue Apr 10 16:52:46 CST 2018
     */
    public String getAlertFlag() {
        return alertFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column calendar_event.ALERT_FLAG
     *
     * @param alertFlag the value for calendar_event.ALERT_FLAG
     *
     * @mbggenerated Tue Apr 10 16:52:46 CST 2018
     */
    public void setAlertFlag(String alertFlag) {
        this.alertFlag = alertFlag == null ? null : alertFlag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column calendar_event.START_DAY
     *
     * @return the value of calendar_event.START_DAY
     *
     * @mbggenerated Tue Apr 10 16:52:46 CST 2018
     */
    public String getStartDay() {
        return startDay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column calendar_event.START_DAY
     *
     * @param startDay the value for calendar_event.START_DAY
     *
     * @mbggenerated Tue Apr 10 16:52:46 CST 2018
     */
    public void setStartDay(String startDay) {
        this.startDay = startDay == null ? null : startDay.trim();
    }
}