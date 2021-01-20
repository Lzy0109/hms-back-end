package com.liuzy.hms.vo;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import java.util.Date;

/**
 * @Author LiuZiYi
 * @Date 2021/1/19 10:45
 * @Version 1.0
 */
public class StaffVo {
    private Integer id;
    private String jobNumber;
    private Byte loginStatus;
    private String trueName;
    private String gender_name;
    private Date birth;
    private String nation_name;
    private String education_name;
    private String identification;
    private String email;
    private String position_name;
    private String phone;
    private String address;
    private Date entryTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJobNumber() {
        return jobNumber;
    }

    public void setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber;
    }

    public Byte getLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(Byte loginStatus) {
        this.loginStatus = loginStatus;
    }

    public String getTrueName() {
        return trueName;
    }

    public void setTrueName(String trueName) {
        this.trueName = trueName;
    }

    public String getGender_name() {
        return gender_name;
    }

    public void setGender_name(String gender_name) {
        this.gender_name = gender_name;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getNation_name() {
        return nation_name;
    }

    public void setNation_name(String nation_name) {
        this.nation_name = nation_name;
    }

    public String getEducation_name() {
        return education_name;
    }

    public void setEducation_name(String education_name) {
        this.education_name = education_name;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPosition_name() {
        return position_name;
    }

    public void setPosition_name(String position_name) {
        this.position_name = position_name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public Date getResignationTime() {
        return resignationTime;
    }

    public void setResignationTime(Date resignationTime) {
        this.resignationTime = resignationTime;
    }

    private Date resignationTime;
}
