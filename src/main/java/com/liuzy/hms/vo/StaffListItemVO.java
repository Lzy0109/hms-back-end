package com.liuzy.hms.vo;

import java.util.Date;

/**
 * @Author LiuZiYi
 * @Date 2021/1/19 19:55
 * @Version 1.0
 */
public class StaffListItemVO {
    private Integer id;
    private String jobNumber;
    private String trueName;
    private String gender_name;
    private String education_name;
    private String position_name;

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

    public String getEducation_name() {
        return education_name;
    }

    public void setEducation_name(String education_name) {
        this.education_name = education_name;
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

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    private String phone;
    private Date entryTime;
}
