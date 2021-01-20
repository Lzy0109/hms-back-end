package com.liuzy.hms.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "`service_item_score`")
public class ServiceItemScore implements Serializable {
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
     * 评分会员（逻辑外键）
     */
    @Column(name = "`member_id`")
    private Integer memberId;

    /**
     * 项目评分（默认5分）
     */
    @Column(name = "`item_score`")
    private Integer itemScore;

    /**
     * 服务评分（默认5分）
     */
    @Column(name = "`service_score`")
    private Integer serviceScore;

    /**
     * 时效评分（默认5分）
     */
    @Column(name = "`time_score`")
    private Integer timeScore;

    /**
     * 数据有效标志（-1：删除，1：有效，默认有效）
     */
    @Column(name = "`data_flag`")
    private Byte dataFlag;

    /**
     * 创建时间（评分时间）
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
     * 获取评分会员（逻辑外键）
     *
     * @return member_id - 评分会员（逻辑外键）
     */
    public Integer getMemberId() {
        return memberId;
    }

    /**
     * 设置评分会员（逻辑外键）
     *
     * @param memberId 评分会员（逻辑外键）
     */
    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    /**
     * 获取项目评分（默认5分）
     *
     * @return item_score - 项目评分（默认5分）
     */
    public Integer getItemScore() {
        return itemScore;
    }

    /**
     * 设置项目评分（默认5分）
     *
     * @param itemScore 项目评分（默认5分）
     */
    public void setItemScore(Integer itemScore) {
        this.itemScore = itemScore;
    }

    /**
     * 获取服务评分（默认5分）
     *
     * @return service_score - 服务评分（默认5分）
     */
    public Integer getServiceScore() {
        return serviceScore;
    }

    /**
     * 设置服务评分（默认5分）
     *
     * @param serviceScore 服务评分（默认5分）
     */
    public void setServiceScore(Integer serviceScore) {
        this.serviceScore = serviceScore;
    }

    /**
     * 获取时效评分（默认5分）
     *
     * @return time_score - 时效评分（默认5分）
     */
    public Integer getTimeScore() {
        return timeScore;
    }

    /**
     * 设置时效评分（默认5分）
     *
     * @param timeScore 时效评分（默认5分）
     */
    public void setTimeScore(Integer timeScore) {
        this.timeScore = timeScore;
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
     * 获取创建时间（评分时间）
     *
     * @return create_time - 创建时间（评分时间）
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间（评分时间）
     *
     * @param createTime 创建时间（评分时间）
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}