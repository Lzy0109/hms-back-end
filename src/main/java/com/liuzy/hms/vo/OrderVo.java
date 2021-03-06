package com.liuzy.hms.vo;

import java.util.Date;

/**
 * @Author LiuZiYi
 * @Date 2021/1/23 10:22
 * @Version 1.0
 */
public class OrderVo {
    private Integer id;
    private String orderNumber;
    private String memberName;
    private String phone;
    private String address;
    private Date appointmentTime;
    private Long needpay;
    private String orderStatusName;
    private String remark;
    // 订单派遣状态
    private String assignStatusName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
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

    public Date getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(Date appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public Long getNeedpay() {
        return needpay;
    }

    public void setNeedpay(Long needpay) {
        this.needpay = needpay;
    }

    public String getOrderStatusName() {
        return orderStatusName;
    }

    public void setOrderStatusName(String orderStatusName) {
        this.orderStatusName = orderStatusName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getAssignStatusName() {
        return assignStatusName;
    }

    public void setAssignStatusName(String assignStatusName) {
        this.assignStatusName = assignStatusName;
    }
}
