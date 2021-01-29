package com.liuzy.hms.vo;

/**
 * @Author LiuZiYi
 * @Date 2021/1/26 21:55
 * @Version 1.0
 */
public class AssignVo {
    private String orderNumber;
    private String itemName;
    // 负责人姓名
    private String directorName;
    // 派遣员工姓名
    private String staffName;
    private String phone;
    private String assignStatusName;

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAssignStatusName() {
        return assignStatusName;
    }

    public void setAssignStatusName(String assignStatusName) {
        this.assignStatusName = assignStatusName;
    }
}
