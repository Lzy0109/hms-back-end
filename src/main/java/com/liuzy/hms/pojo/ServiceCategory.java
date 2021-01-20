package com.liuzy.hms.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "`service_category`")
public class ServiceCategory implements Serializable {
    /**
     * 自增主键
     */
    @Id
    @Column(name = "`id`")
    private Integer id;

    /**
     * 分类名称
     */
    @Column(name = "`cat_name`")
    private String catName;

    /**
     * 分类描述
     */
    @Column(name = "`description`")
    private String description;

    /**
     * 分类图标
     */
    @Column(name = "`icon`")
    private String icon;

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
     * 获取分类名称
     *
     * @return cat_name - 分类名称
     */
    public String getCatName() {
        return catName;
    }

    /**
     * 设置分类名称
     *
     * @param catName 分类名称
     */
    public void setCatName(String catName) {
        this.catName = catName;
    }

    /**
     * 获取分类描述
     *
     * @return description - 分类描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置分类描述
     *
     * @param description 分类描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取分类图标
     *
     * @return icon - 分类图标
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 设置分类图标
     *
     * @param icon 分类图标
     */
    public void setIcon(String icon) {
        this.icon = icon;
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