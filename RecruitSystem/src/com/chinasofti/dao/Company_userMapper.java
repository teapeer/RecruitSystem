package com.chinasofti.dao;

import com.chinasofti.model.Company_user;

public interface Company_userMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_user
     *
     * @mbggenerated Tue Jul 18 11:12:09 CST 2017
     */
    int deleteByPrimaryKey(Integer cuserId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_user
     *
     * @mbggenerated Tue Jul 18 11:12:09 CST 2017
     */
    int insert(Company_user record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_user
     *
     * @mbggenerated Tue Jul 18 11:12:09 CST 2017
     */
    int insertSelective(Company_user record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_user
     *
     * @mbggenerated Tue Jul 18 11:12:09 CST 2017
     */
    Company_user selectByPrimaryKey(Integer cuserId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_user
     *
     * @mbggenerated Tue Jul 18 11:12:09 CST 2017
     */
    int updateByPrimaryKeySelective(Company_user record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_user
     *
     * @mbggenerated Tue Jul 18 11:12:09 CST 2017
     */
    int updateByPrimaryKey(Company_user record);
}