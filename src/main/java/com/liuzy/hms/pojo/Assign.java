package com.liuzy.hms.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "`assign`")
public class Assign implements Serializable {
    /**
     * 自增主键
     */
    @Id
    @Column(name = "`id`")
    private Integer id;

    /**
     * 订单id（逻辑外键）
     */
    @Column(name = "`order_id`")
    private Integer orderId;

    /**
     * 项目id（逻辑外键）
     */
    @Column(name = "`item_id`")
    private Integer itemId;

    /**
     * 负责人id（逻辑外键）
     */
    @Column(name = "`director`")
    private Integer director;

    /**
     * 派遣员工id（逻辑外键）
     */
    @Column(name = "`staff_id`")
    private Integer staffId;

    /**
     * 派遣时间
     */
    @Column(name = "`assign_time`")
    private Date assignTime;

    /**
     * 派遣状态（逻辑外键，默认待派遣）
     */
    @Column(name = "`assign_status`")
    private Integer assignStatus;

    /**
     * 数据有效标志（-1：删除，1：有效，默认有效）
     */
    @Column(name = "`data_flag`")
    private Byte dataFlag;

    /**
     * 创建时间
     */
    @Column(name = "`create_time`")
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
     * 获取订单id（逻辑外键）
     *
     * @return order_id - 订单id（逻辑外键）
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * 设置订单id（逻辑外键）
     *
     * @param orderId 订单id（逻辑外键）
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取项目id（逻辑外键）
     *
     * @return item_id - 项目id（逻辑外键）
     */
    public Integer getItemId() {
        return itemId;
    }

    /**
     * 设置项目id（逻辑外键）
     *
     * @param itemId 项目id（逻辑外键）
     */
    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    /**
     * 获取负责人id（逻辑外键）
     *
     * @return director - 负责人id（逻辑外键）
     */
    public Integer getDirector() {
        return director;
    }

    /**
     * 设置负责人id（逻辑外键）
     *
     * @param director 负责人id（逻辑外键）
     */
    public void setDirector(Integer director) {
        this.director = director;
    }

    /**
     * 获取派遣员工id（逻辑外键）
     *
     * @return staff_id - 派遣员工id（逻辑外键）
     */
    public Integer getStaffId() {
        return staffId;
    }

    /**
     * 设置派遣员工id（逻辑外键）
     *
     * @param staffId 派遣员工id（逻辑外键）
     */
    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    /**
     * 获取派遣时间
     *
     * @return assign_time - 派遣时间
     */
    public Date getAssignTime() {
        return assignTime;
    }

    /**
     * 设置派遣时间
     *
     * @param assignTime 派遣时间
     */
    public void setAssignTime(Date assignTime) {
        this.assignTime = assignTime;
    }

    /**
     * 获取派遣状态（逻辑外键，默认待派遣）
     *
     * @return assign_status - 派遣状态（逻辑外键，默认待派遣）
     */
    public Integer getAssignStatus() {
        return assignStatus;
    }

    /**
     * 设置派遣状态（逻辑外键，默认待派遣）
     *
     * @param assignStatus 派遣状态（逻辑外键，默认待派遣）
     */
    public void setAssignStatus(Integer assignStatus) {
        this.assignStatus = assignStatus;
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
}