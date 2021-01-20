package com.liuzy.hms.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "`service_item_apprise`")
public class ServiceItemApprise implements Serializable {
    /**
     * 自增主键
     */
    @Id
    @Column(name = "`id`")
    private Integer id;

    /**
     * 服务项目（逻辑外键）
     */
    @Column(name = "`item_id`")
    private Integer itemId;

    /**
     * 评价会员（逻辑外键）
     */
    @Column(name = "`member_id`")
    private Integer memberId;

    /**
     * 评价内容
     */
    @Column(name = "`comment`")
    private String comment;

    /**
     * 数据有效标志（-1：删除，1：有效，默认有效）
     */
    @Column(name = "`data_flag`")
    private Byte dataFlag;

    /**
     * 创建时间（评价时间）
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
     * 获取服务项目（逻辑外键）
     *
     * @return item_id - 服务项目（逻辑外键）
     */
    public Integer getItemId() {
        return itemId;
    }

    /**
     * 设置服务项目（逻辑外键）
     *
     * @param itemId 服务项目（逻辑外键）
     */
    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    /**
     * 获取评价会员（逻辑外键）
     *
     * @return member_id - 评价会员（逻辑外键）
     */
    public Integer getMemberId() {
        return memberId;
    }

    /**
     * 设置评价会员（逻辑外键）
     *
     * @param memberId 评价会员（逻辑外键）
     */
    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    /**
     * 获取评价内容
     *
     * @return comment - 评价内容
     */
    public String getComment() {
        return comment;
    }

    /**
     * 设置评价内容
     *
     * @param comment 评价内容
     */
    public void setComment(String comment) {
        this.comment = comment;
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
     * 获取创建时间（评价时间）
     *
     * @return create_time - 创建时间（评价时间）
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间（评价时间）
     *
     * @param createTime 创建时间（评价时间）
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}