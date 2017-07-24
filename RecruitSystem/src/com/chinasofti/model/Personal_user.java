package com.chinasofti.model;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class Personal_user {
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column personal_user.pid
	 *
	 * @mbggenerated Tue Jul 18 11:12:09 CST 2017 个人用户ID
	 */
	private Integer pid;

	public Personal_user(String pname, String ppwd) {
		super();
		this.pname = pname;
		this.ppwd = ppwd;
	}

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column personal_user.ppwd
	 *
	 * @mbggenerated Tue Jul 18 11:12:09 CST 2017 个人用户密码
	 * 
	 */

	private String pname;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column personal_user.sex
	 *
	 * @mbggenerated Tue Jul 18 11:12:09 CST 2017 用户性别
	 */
	private String ppwd;

	private String puname;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column personal_user.pname
	 *
	 * @mbggenerated Tue Jul 18 11:12:09 CST 2017 个人用户帐号
	 */

	private String sex;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column personal_user.birthday
	 *
	 * @mbggenerated Tue Jul 18 11:12:09 CST 2017 用户出生日期
	 */
	private Integer age;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column edu_background.edu_id
	 *
	 * @mbggenerated Tue Jul 18 11:12:09 CST 2017 教育背景ID
	 */
	private Integer eduId;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column edu_background.sch_name
	 *
	 * @mbggenerated Tue Jul 18 11:12:09 CST 2017 学校名称
	 */
	private String schName;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column edu_background.maj_name
	 *
	 * @mbggenerated Tue Jul 18 11:12:09 CST 2017 专业名称
	 */
	private String majName;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column edu_background.edu
	 *
	 * @mbggenerated Tue Jul 18 11:12:09 CST 2017 学历
	 */
	private String edu;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column work_experience.work_id
	 *
	 * @mbggenerated Tue Jul 18 11:12:09 CST 2017
	 * 
	 *               工作经验ID
	 */
	private Integer workId;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column work_experience.com_name
	 *
	 * @mbggenerated Tue Jul 18 11:12:09 CST 2017 公司名称
	 */
	private String comName;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column work_experience.job_name
	 *
	 * @mbggenerated Tue Jul 18 11:12:09 CST 2017
	 * 
	 *               职位名称
	 */
	private String jobName;

	private String workContent;

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column work_experience.work_id
	 *
	 * @return the value of work_experience.work_id
	 *
	 * @mbggenerated Tue Jul 18 11:12:09 CST 2017
	 */

	public Personal_user(String puname, String sex, Integer age, String email) {
		super();
		this.puname = puname;
		this.sex = sex;
		this.age = age;
		this.email = email;
	}

	public Personal_user(String schName, String majName, String edu) {
		super();
		this.schName = schName;
		this.majName = majName;
		this.edu = edu;
	}

	public Integer getEduId() {
		return eduId;
	}

	public void setEduId(Integer eduId) {
		this.eduId = eduId;
	}

	public String getSchName() {
		return schName;
	}

	public void setSchName(String schName) {
		this.schName = schName;
	}

	public String getMajName() {
		return majName;
	}

	public void setMajName(String majName) {
		this.majName = majName;
	}

	public String getEdu() {
		return edu;
	}

	public void setEdu(String edu) {
		this.edu = edu;
	}

	public Integer getWorkId() {
		return workId;
	}

	public void setWorkId(Integer workId) {
		this.workId = workId;
	}

	public String getComName() {
		return comName;
	}

	public void setComName(String comName) {
		this.comName = comName;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public String getWorkContent() {
		return workContent;
	}

	public void setWorkContent(String workContent) {
		this.workContent = workContent;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column personal_user.email
	 *
	 * @mbggenerated Tue Jul 18 11:12:09 CST 2017 用户EMAIl
	 */
	private String email;

	public Integer getPid() {
		return pid;
	}

	public Personal_user() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Personal_user(Integer pid, String pname, String ppwd, String puname, String sex, Integer age, String email) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.ppwd = ppwd;
		this.puname = puname;
		this.sex = sex;
		this.age = age;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Personal_user [pid=" + pid + ", pname=" + pname + ", ppwd=" + ppwd + ", puname=" + puname + ", sex="
				+ sex + ", age=" + age + ", email=" + email + "]";
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPpwd() {
		return ppwd;
	}

	public void setPpwd(String ppwd) {
		this.ppwd = ppwd;
	}

	public String getPuname() {
		return puname;
	}

	public void setPuname(String puname) {
		this.puname = puname;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column personal_user.state
	 *
	 * @mbggenerated Tue Jul 18 11:12:09 CST 2017 用户现在工作状态
	 */

}