package com.liuzy.hms.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "`position`")
public class Position implements Serializable {
    /**
     * 自增主键
     */
    @Id
    @Column(name = "`id`")
    private Integer id;

    /**
     * 职位名称
     */
    @Column(name = "`position_name`")
    private String positionName;

    /**
     * 职位描述
     */
    @Column(name = "`description`")
    private String description;

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
     * 获取职位名称
     *
     * @return position_name - 职位名称
     */
    public String getPositionName() {
        return positionName;
    }

    /**
     * 设置职位名称
     *
     * @param positionName 职位名称
     */
    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    /**
     * 获取职位描述
     *
     * @return description - 职位描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置职位描述
     *
     * @param description 职位描述
     */
    public void setDescription(String description) {
        this.description = description;
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