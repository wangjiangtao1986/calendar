package com.wangjt.calendar.mysql.dao.mapper;

import com.wangjt.calendar.mysql.dao.model.CalendarUser;
import com.wangjt.calendar.mysql.dao.model.CalendarUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CalendarUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table calendar_user
     *
     * @mbggenerated Thu May 03 16:23:51 CST 2018
     */
    int countByExample(CalendarUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table calendar_user
     *
     * @mbggenerated Thu May 03 16:23:51 CST 2018
     */
    int deleteByExample(CalendarUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table calendar_user
     *
     * @mbggenerated Thu May 03 16:23:51 CST 2018
     */
    int deleteByPrimaryKey(String userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table calendar_user
     *
     * @mbggenerated Thu May 03 16:23:51 CST 2018
     */
    int insert(CalendarUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table calendar_user
     *
     * @mbggenerated Thu May 03 16:23:51 CST 2018
     */
    int insertSelective(CalendarUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table calendar_user
     *
     * @mbggenerated Thu May 03 16:23:51 CST 2018
     */
    List<CalendarUser> selectByExample(CalendarUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table calendar_user
     *
     * @mbggenerated Thu May 03 16:23:51 CST 2018
     */
    CalendarUser selectByPrimaryKey(String userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table calendar_user
     *
     * @mbggenerated Thu May 03 16:23:51 CST 2018
     */
    int updateByExampleSelective(@Param("record") CalendarUser record, @Param("example") CalendarUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table calendar_user
     *
     * @mbggenerated Thu May 03 16:23:51 CST 2018
     */
    int updateByExample(@Param("record") CalendarUser record, @Param("example") CalendarUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table calendar_user
     *
     * @mbggenerated Thu May 03 16:23:51 CST 2018
     */
    int updateByPrimaryKeySelective(CalendarUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table calendar_user
     *
     * @mbggenerated Thu May 03 16:23:51 CST 2018
     */
    int updateByPrimaryKey(CalendarUser record);
}