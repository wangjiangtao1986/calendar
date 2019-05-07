package com.wangjt.calendar.mysql.dao.model;

public class CalendarEmailEvent {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column calendar_email_event.ID
     *
     * @mbggenerated Thu May 03 16:56:10 CST 2018
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column calendar_email_event.START_DAY
     *
     * @mbggenerated Thu May 03 16:56:10 CST 2018
     */
    private String startDay;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column calendar_email_event.START_TIME
     *
     * @mbggenerated Thu May 03 16:56:10 CST 2018
     */
    private String startTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column calendar_email_event.END_DAY
     *
     * @mbggenerated Thu May 03 16:56:10 CST 2018
     */
    private String endDay;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column calendar_email_event.END_TIME
     *
     * @mbggenerated Thu May 03 16:56:10 CST 2018
     */
    private String endTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column calendar_email_event.DESCRIPTION
     *
     * @mbggenerated Thu May 03 16:56:10 CST 2018
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column calendar_email_event.SUBJECT
     *
     * @mbggenerated Thu May 03 16:56:10 CST 2018
     */
    private String subject;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column calendar_email_event.ALERT_FLAG
     *
     * @mbggenerated Thu May 03 16:56:10 CST 2018
     */
    private String alertFlag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column calendar_email_event.user_addr
     *
     * @mbggenerated Thu May 03 16:56:10 CST 2018
     */
    private String userAddr;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column calendar_email_event.user_mail
     *
     * @mbggenerated Thu May 03 16:56:10 CST 2018
     */
    private String userMail;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column calendar_email_event.user_tel
     *
     * @mbggenerated Thu May 03 16:56:10 CST 2018
     */
    private String userTel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column calendar_email_event.user_name
     *
     * @mbggenerated Thu May 03 16:56:10 CST 2018
     */
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column calendar_email_event.user_id
     *
     * @mbggenerated Thu May 03 16:56:10 CST 2018
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column calendar_email_event.TYPE
     *
     * @mbggenerated Thu May 03 16:56:10 CST 2018
     */
    private String type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column calendar_email_event.UNIT
     *
     * @mbggenerated Thu May 03 16:56:10 CST 2018
     */
    private String unit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column calendar_email_event.EARLY
     *
     * @mbggenerated Thu May 03 16:56:10 CST 2018
     */
    private String early;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column calendar_email_event.ID
     *
     * @return the value of calendar_email_event.ID
     *
     * @mbggenerated Thu May 03 16:56:10 CST 2018
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column calendar_email_event.ID
     *
     * @param id the value for calendar_email_event.ID
     *
     * @mbggenerated Thu May 03 16:56:10 CST 2018
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column calendar_email_event.START_DAY
     *
     * @return the value of calendar_email_event.START_DAY
     *
     * @mbggenerated Thu May 03 16:56:10 CST 2018
     */
    public String getStartDay() {
        return startDay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column calendar_email_event.START_DAY
     *
     * @param startDay the value for calendar_email_event.START_DAY
     *
     * @mbggenerated Thu May 03 16:56:10 CST 2018
     */
    public void setStartDay(String startDay) {
        this.startDay = startDay == null ? null : startDay.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column calendar_email_event.START_TIME
     *
     * @return the value of calendar_email_event.START_TIME
     *
     * @mbggenerated Thu May 03 16:56:10 CST 2018
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column calendar_email_event.START_TIME
     *
     * @param startTime the value for calendar_email_event.START_TIME
     *
     * @mbggenerated Thu May 03 16:56:10 CST 2018
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime == null ? null : startTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column calendar_email_event.END_DAY
     *
     * @return the value of calendar_email_event.END_DAY
     *
     * @mbggenerated Thu May 03 16:56:10 CST 2018
     */
    public String getEndDay() {
        return endDay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column calendar_email_event.END_DAY
     *
     * @param endDay the value for calendar_email_event.END_DAY
     *
     * @mbggenerated Thu May 03 16:56:10 CST 2018
     */
    public void setEndDay(String endDay) {
        this.endDay = endDay == null ? null : endDay.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column calendar_email_event.END_TIME
     *
     * @return the value of calendar_email_event.END_TIME
     *
     * @mbggenerated Thu May 03 16:56:10 CST 2018
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column calendar_email_event.END_TIME
     *
     * @param endTime the value for calendar_email_event.END_TIME
     *
     * @mbggenerated Thu May 03 16:56:10 CST 2018
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime == null ? null : endTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column calendar_email_event.DESCRIPTION
     *
     * @return the value of calendar_email_event.DESCRIPTION
     *
     * @mbggenerated Thu May 03 16:56:10 CST 2018
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column calendar_email_event.DESCRIPTION
     *
     * @param description the value for calendar_email_event.DESCRIPTION
     *
     * @mbggenerated Thu May 03 16:56:10 CST 2018
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column calendar_email_event.SUBJECT
     *
     * @return the value of calendar_email_event.SUBJECT
     *
     * @mbggenerated Thu May 03 16:56:10 CST 2018
     */
    public String getSubject() {
        return subject;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column calendar_email_event.SUBJECT
     *
     * @param subject the value for calendar_email_event.SUBJECT
     *
     * @mbggenerated Thu May 03 16:56:10 CST 2018
     */
    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column calendar_email_event.ALERT_FLAG
     *
     * @return the value of calendar_email_event.ALERT_FLAG
     *
     * @mbggenerated Thu May 03 16:56:10 CST 2018
     */
    public String getAlertFlag() {
        return alertFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column calendar_email_event.ALERT_FLAG
     *
     * @param alertFlag the value for calendar_email_event.ALERT_FLAG
     *
     * @mbggenerated Thu May 03 16:56:10 CST 2018
     */
    public void setAlertFlag(String alertFlag) {
        this.alertFlag = alertFlag == null ? null : alertFlag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column calendar_email_event.user_addr
     *
     * @return the value of calendar_email_event.user_addr
     *
     * @mbggenerated Thu May 03 16:56:10 CST 2018
     */
    public String getUserAddr() {
        return userAddr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column calendar_email_event.user_addr
     *
     * @param userAddr the value for calendar_email_event.user_addr
     *
     * @mbggenerated Thu May 03 16:56:10 CST 2018
     */
    public void setUserAddr(String userAddr) {
        this.userAddr = userAddr == null ? null : userAddr.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column calendar_email_event.user_mail
     *
     * @return the value of calendar_email_event.user_mail
     *
     * @mbggenerated Thu May 03 16:56:10 CST 2018
     */
    public String getUserMail() {
        return userMail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column calendar_email_event.user_mail
     *
     * @param userMail the value for calendar_email_event.user_mail
     *
     * @mbggenerated Thu May 03 16:56:10 CST 2018
     */
    public void setUserMail(String userMail) {
        this.userMail = userMail == null ? null : userMail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column calendar_email_event.user_tel
     *
     * @return the value of calendar_email_event.user_tel
     *
     * @mbggenerated Thu May 03 16:56:10 CST 2018
     */
    public String getUserTel() {
        return userTel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column calendar_email_event.user_tel
     *
     * @param userTel the value for calendar_email_event.user_tel
     *
     * @mbggenerated Thu May 03 16:56:10 CST 2018
     */
    public void setUserTel(String userTel) {
        this.userTel = userTel == null ? null : userTel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column calendar_email_event.user_name
     *
     * @return the value of calendar_email_event.user_name
     *
     * @mbggenerated Thu May 03 16:56:10 CST 2018
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column calendar_email_event.user_name
     *
     * @param userName the value for calendar_email_event.user_name
     *
     * @mbggenerated Thu May 03 16:56:10 CST 2018
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column calendar_email_event.user_id
     *
     * @return the value of calendar_email_event.user_id
     *
     * @mbggenerated Thu May 03 16:56:10 CST 2018
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column calendar_email_event.user_id
     *
     * @param userId the value for calendar_email_event.user_id
     *
     * @mbggenerated Thu May 03 16:56:10 CST 2018
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column calendar_email_event.TYPE
     *
     * @return the value of calendar_email_event.TYPE
     *
     * @mbggenerated Thu May 03 16:56:10 CST 2018
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column calendar_email_event.TYPE
     *
     * @param type the value for calendar_email_event.TYPE
     *
     * @mbggenerated Thu May 03 16:56:10 CST 2018
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column calendar_email_event.UNIT
     *
     * @return the value of calendar_email_event.UNIT
     *
     * @mbggenerated Thu May 03 16:56:10 CST 2018
     */
    public String getUnit() {
        return unit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column calendar_email_event.UNIT
     *
     * @param unit the value for calendar_email_event.UNIT
     *
     * @mbggenerated Thu May 03 16:56:10 CST 2018
     */
    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column calendar_email_event.EARLY
     *
     * @return the value of calendar_email_event.EARLY
     *
     * @mbggenerated Thu May 03 16:56:10 CST 2018
     */
    public String getEarly() {
        return early;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column calendar_email_event.EARLY
     *
     * @param early the value for calendar_email_event.EARLY
     *
     * @mbggenerated Thu May 03 16:56:10 CST 2018
     */
    public void setEarly(String early) {
        this.early = early == null ? null : early.trim();
    }
}