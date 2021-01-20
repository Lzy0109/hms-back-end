package com.liuzy.hms.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "`order`")
public class Order implements Serializable {
    /**
     * 自增主键
     */
    @Id
    @Column(name = "`id`")
    private Integer id;

    /**
     * 订单号
     */
    @Column(name = "`order_number`")
    private String orderNumber;

    /**
     * 下单会员id（逻辑外键）
     */
    @Column(name = "`member_id`")
    private Integer memberId;

    /**
     * 联系电话
     */
    @Column(name = "`phone`")
    private String phone;

    /**
     * 地址
     */
    @Column(name = "`address`")
    private String address;

    /**
     * 服务预约时间
     */
    @Column(name = "`appointment_time`")
    private Date appointmentTime;

    /**
     * 需要支付费用
     */
    @Column(name = "`needpay`")
    private Long needpay;

    /**
     * 订单状态（逻辑外键，默认待支付）
     */
    @Column(name = "`order_status`")
    private Integer orderStatus;

    /**
     * 备注
     */
    @Column(name = "`remark`")
    private String remark;

    /**
     * 创建时间（下单时间）
     */
    @Column(name = "`create_time`")
    private Date createTime;

    /**
     * 数据有效标志（-1：删除，1：有效，默认有效）
     */
    @Column(name = "`data_flag`")
    private Byte dataFlag;

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
     * 获取订单号
     *
     * @return order_number - 订单号
     */
    public String getOrderNumber() {
        return orderNumber;
    }

    /**
     * 设置订单号
     *
     * @param orderNumber 订单号
     */
    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    /**
     * 获取下单会员id（逻辑外键）
     *
     * @return member_id - 下单会员id（逻辑外键）
     */
    public Integer getMemberId() {
        return memberId;
    }

    /**
     * 设置下单会员id（逻辑外键）
     *
     * @param memberId 下单会员id（逻辑外键）
     */
    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
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
     * 获取地址
     *
     * @return address - 地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置地址
     *
     * @param address 地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取服务预约时间
     *
     * @return appointment_time - 服务预约时间
     */
    public Date getAppointmentTime() {
        return appointmentTime;
    }

    /**
     * 设置服务预约时间
     *
     * @param appointmentTime 服务预约时间
     */
    public void setAppointmentTime(Date appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    /**
     * 获取需要支付费用
     *
     * @return needpay - 需要支付费用
     */
    public Long getNeedpay() {
        return needpay;
    }

    /**
     * 设置需要支付费用
     *
     * @param needpay 需要支付费用
     */
    public void setNeedpay(Long needpay) {
        this.needpay = needpay;
    }

    /**
     * 获取订单状态（逻辑外键，默认待支付）
     *
     * @return order_status - 订单状态（逻辑外键，默认待支付）
     */
    public Integer getOrderStatus() {
        return orderStatus;
    }

    /**
     * 设置订单状态（逻辑外键，默认待支付）
     *
     * @param orderStatus 订单状态（逻辑外键，默认待支付）
     */
    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取创建时间（下单时间）
     *
     * @return create_time - 创建时间（下单时间）
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间（下单时间）
     *
     * @param createTime 创建时间（下单时间）
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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
}