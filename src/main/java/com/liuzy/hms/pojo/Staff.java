package com.liuzy.hms.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import javafx.beans.DefaultProperty;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "`staff`")
public class Staff implements Serializable {
    /**
     * 自增主键
     */
    @Id
    @Column(name = "`id`")
    private Integer id;

    /**
     * 工号
     */
    @Column(name = "`job_number`")
    private String jobNumber;

    /**
     * 登录用户名（默认工号）
     */
    @Column(name = "`login_name`")
    private String loginName;

    /**
     * 登录密码
     */
    @Column(name = "`login_pwd`")
    private String loginPwd;

    /**
     * 账号状态（-1：停用，1：正常）
     */
    @Column(name = "`login_status`")
    private Byte loginStatus;

    /**
     * 真实姓名
     */
    @Column(name = "`true_name`")
    private String trueName;

    /**
     * 性别（1表示男，0表示女，默认男）
     */
    @Column(name = "`gender`")
    private Byte gender;

    /**
     * 出生日期
     */
    @Column(name = "`birth`")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birth;

    /**
     * 民族（默认汉族，逻辑外键）
     */
    @Column(name = "`nation`")
    private Integer nation;

    /**
     * 学历（默认本科，逻辑外键）
     */
    @Column(name = "`education`")
    private Integer education;

    /**
     * 身份证号码
     */
    @Column(name = "`identification`")
    private String identification;

    /**
     * 邮箱
     */
    @Column(name = "`email`")
    private String email;

    /**
     * 职位（默认后台管理员工，逻辑外键）
     */
    @Column(name = "`position_id`")
    private Integer positionId;

    /**
     * 联系电话
     */
    @Column(name = "`phone`")
    private String phone;

    /**
     * 家庭住址
     */
    @Column(name = "`address`")
    private String address;

    /**
     * 入职时间
     */
    @Column(name = "`entry_time`")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date entryTime;

    /**
     * 离职时间
     */
    @Column(name = "`resignation_time`")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date resignationTime;

    /**
     * 数据有效标志（-1：删除，1：有效，默认有效）
     */
    @Column(name = "`data_flag`")
    private Byte dataFlag;

    /**
     * 创建时间
     */
    @Column(name = "`create_time`")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createTime;

    private static final long serialVersionUID = 1L;

    /**
     * 获取自增主键
     *
     * @return id - 自增主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置自增主键
     *
     * @param id 自增主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取工号
     *
     * @return job_number - 工号
     */
    public String getJobNumber() {
        return jobNumber;
    }

    /**
     * 设置工号
     *
     * @param jobNumber 工号
     */
    public void setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber;
    }

    /**
     * 获取登录用户名（默认工号）
     *
     * @return login_name - 登录用户名（默认工号）
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * 设置登录用户名（默认工号）
     *
     * @param loginName 登录用户名（默认工号）
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    /**
     * 获取登录密码
     *
     * @return login_pwd - 登录密码
     */
    public String getLoginPwd() {
        return loginPwd;
    }

    /**
     * 设置登录密码
     *
     * @param loginPwd 登录密码
     */
    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    /**
     * 获取账号状态（-1：停用，1：正常）
     *
     * @return login_status - 账号状态（-1：停用，1：正常）
     */
    public Byte getLoginStatus() {
        return loginStatus;
    }

    /**
     * 设置账号状态（-1：停用，1：正常）
     *
     * @param loginStatus 账号状态（-1：停用，1：正常）
     */
    public void setLoginStatus(Byte loginStatus) {
        this.loginStatus = loginStatus;
    }

    /**
     * 获取真实姓名
     *
     * @return true_name - 真实姓名
     */
    public String getTrueName() {
        return trueName;
    }

    /**
     * 设置真实姓名
     *
     * @param trueName 真实姓名
     */
    public void setTrueName(String trueName) {
        this.trueName = trueName;
    }

    /**
     * 获取性别（1表示男，0表示女，默认男）
     *
     * @return gender - 性别（1表示男，0表示女，默认男）
     */
    public Byte getGender() {
        return gender;
    }

    /**
     * 设置性别（1表示男，0表示女，默认男）
     *
     * @param gender 性别（1表示男，0表示女，默认男）
     */
    public void setGender(Byte gender) {
        this.gender = gender;
    }

    /**
     * 获取出生日期
     *
     * @return birth - 出生日期
     */
    public Date getBirth() {
        return birth;
    }

    /**
     * 设置出生日期
     *
     * @param birth 出生日期
     */
    public void setBirth(Date birth) {
        this.birth = birth;
    }

    /**
     * 获取民族（默认汉族，逻辑外键）
     *
     * @return nation - 民族（默认汉族，逻辑外键）
     */
    public Integer getNation() {
        return nation;
    }

    /**
     * 设置民族（默认汉族，逻辑外键）
     *
     * @param nation 民族（默认汉族，逻辑外键）
     */
    public void setNation(Integer nation) {
        this.nation = nation;
    }

    /**
     * 获取学历（默认本科，逻辑外键）
     *
     * @return education - 学历（默认本科，逻辑外键）
     */
    public Integer getEducation() {
        return education;
    }

    /**
     * 设置学历（默认本科，逻辑外键）
     *
     * @param education 学历（默认本科，逻辑外键）
     */
    public void setEducation(Integer education) {
        this.education = education;
    }

    /**
     * 获取身份证号码
     *
     * @return identification - 身份证号码
     */
    public String getIdentification() {
        return identification;
    }

    /**
     * 设置身份证号码
     *
     * @param identification 身份证号码
     */
    public void setIdentification(String identification) {
        this.identification = identification;
    }

    /**
     * 获取邮箱
     *
     * @return email - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取职位（默认后台管理员工，逻辑外键）
     *
     * @return position_id - 职位（默认后台管理员工，逻辑外键）
     */
    public Integer getPositionId() {
        return positionId;
    }

    /**
     * 设置职位（默认后台管理员工，逻辑外键）
     *
     * @param positionId 职位（默认后台管理员工，逻辑外键）
     */
    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    /**
     * 获取联系电话
     *
     * @return phone - 联系电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置联系电话
     *
     * @param phone 联系电话
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取家庭住址
     *
     * @return address - 家庭住址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置家庭住址
     *
     * @param address 家庭住址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取入职时间
     *
     * @return entry_time - 入职时间
     */
    public Date getEntryTime() {
        return entryTime;
    }

    /**
     * 设置入职时间
     *
     * @param entryTime 入职时间
     */
    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    /**
     * 获取离职时间
     *
     * @return resignation_time - 离职时间
     */
    public Date getResignationTime() {
        return resignationTime;
    }

    /**
     * 设置离职时间
     *
     * @param resignationTime 离职时间
     */
    public void setResignationTime(Date resignationTime) {
        this.resignationTime = resignationTime;
    }

    /**
     * 获取数据有效标志（-1：删除，1：有效，默认有效）
     *
     * @return data_flag - 数据有效标志（-1：删除，1：有效，默认有效）
     */
    public Byte getDataFlag() {
        return dataFlag;
    }

    /**
     * 设置数据有效标志（-1：删除，1：有效，默认有效）
     *
     * @param dataFlag 数据有效标志（-1：删除，1：有效，默认有效）
     */
    public void setDataFlag(Byte dataFlag) {
        this.dataFlag = dataFlag;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", jobNumber='" + jobNumber + '\'' +
                ", loginName='" + loginName + '\'' +
                ", loginPwd='" + loginPwd + '\'' +
                ", loginStatus=" + loginStatus +
                ", trueName='" + trueName + '\'' +
                ", gender=" + gender +
                ", birth=" + birth +
                ", nation=" + nation +
                ", education=" + education +
                ", identification='" + identification + '\'' +
                ", email='" + email + '\'' +
                ", positionId=" + positionId +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", entryTime=" + entryTime +
                ", resignationTime=" + resignationTime +
                ", dataFlag=" + dataFlag +
                ", createTime=" + createTime +
                '}';
    }
}