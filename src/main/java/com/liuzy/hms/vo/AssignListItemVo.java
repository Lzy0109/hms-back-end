package com.liuzy.hms.vo;

import springfox.documentation.service.ApiListing;

import java.util.Date;

/**
 * @Author LiuZiYi
 * @Date 2021/1/26 21:58
 * @Version 1.0
 */
public class AssignListItemVo {
    private Integer id;
    private String orderNumber;
    // 订单创建时间
    private Date orderCreateTime;
    private String itemName;
    private String staffName;
    // 派遣时间
    private Date assignTime;
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

    public Date getOrderCreateTime() {
        return orderCreateTime;
    }

    public void setOrderCreateTime(Date orderCreateTime) {
        this.orderCreateTime = orderCreateTime;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public Date getAssignTime() {
        return assignTime;
    }

    public void setAssignTime(Date assignTime) {
        this.assignTime = assignTime;
    }

    public String getAssignStatusName() {
        return assignStatusName;
    }

    public void setAssignStatusName(String assignStatusName) {
        this.assignStatusName = assignStatusName;
    }
}
