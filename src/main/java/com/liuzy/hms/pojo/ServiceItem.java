package com.liuzy.hms.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "`service_item`")
public class ServiceItem implements Serializable {
    /**
     * 自增主键
     */
    @Id
    @Column(name = "`id`")
    private Integer id;

    /**
     * 服务项目名称
     */
    @Column(name = "`item_name`")
    private String itemName;

    /**
     * 服务项目分类（逻辑外键）
     */
    @Column(name = "`category`")
    private Integer category;

    /**
     * 服务项目描述
     */
    @Column(name = "`description`")
    private String description;

    /**
     * 服务时长
     */
    @Column(name = "`duration`")
    private String duration;

    /**
     * 服务人数
     */
    @Column(name = "`unit`")
    private Byte unit;

    /**
     * 服务标准
     */
    @Column(name = "`standard`")
    private String standard;

    /**
     * 单价
     */
    @Column(name = "`price`")
    private BigDecimal price;

    /**
     * 访问数（默认0）
     */
    @Column(name = "`visit`")
    private Integer visit;

    /**
     * 销售量（默认0）
     */
    @Column(name = "`sale`")
    private Integer sale;

    /**
     * 是否新品（0：否，1：是，默认是）
     */
    @Column(name = "`is_new`")
    private Byte isNew;

    /**
     * 是否推荐（0：否，1：是，默认否）
     */
    @Column(name = "`is_recommend`")
    private Byte isRecommend;

    /**
     * 上架时间
     */
    @Column(name = "`added_time`")
    private Date addedTime;

    /**
     * 评价数（默认0）
     */
    @Column(name = "`appraise`")
    private Integer appraise;

    /**
     * 备注
     */
    @Column(name = "`remark`")
    private String remark;

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
     * 获取服务项目名称
     *
     * @return item_name - 服务项目名称
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * 设置服务项目名称
     *
     * @param itemName 服务项目名称
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * 获取服务项目分类（逻辑外键）
     *
     * @return category - 服务项目分类（逻辑外键）
     */
    public Integer getCategory() {
        return category;
    }

    /**
     * 设置服务项目分类（逻辑外键）
     *
     * @param category 服务项目分类（逻辑外键）
     */
    public void setCategory(Integer category) {
        this.category = category;
    }

    /**
     * 获取服务项目描述
     *
     * @return description - 服务项目描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置服务项目描述
     *
     * @param description 服务项目描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取服务时长
     *
     * @return duration - 服务时长
     */
    public String getDuration() {
        return duration;
    }

    /**
     * 设置服务时长
     *
     * @param duration 服务时长
     */
    public void setDuration(String duration) {
        this.duration = duration;
    }

    /**
     * 获取服务人数
     *
     * @return unit - 服务人数
     */
    public Byte getUnit() {
        return unit;
    }

    /**
     * 设置服务人数
     *
     * @param unit 服务人数
     */
    public void setUnit(Byte unit) {
        this.unit = unit;
    }

    /**
     * 获取服务标准
     *
     * @return standard - 服务标准
     */
    public String getStandard() {
        return standard;
    }

    /**
     * 设置服务标准
     *
     * @param standard 服务标准
     */
    public void setStandard(String standard) {
        this.standard = standard;
    }

    /**
     * 获取单价
     *
     * @return price - 单价
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 设置单价
     *
     * @param price 单价
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 获取访问数（默认0）
     *
     * @return visit - 访问数（默认0）
     */
    public Integer getVisit() {
        return visit;
    }

    /**
     * 设置访问数（默认0）
     *
     * @param visit 访问数（默认0）
     */
    public void setVisit(Integer visit) {
        this.visit = visit;
    }

    /**
     * 获取销售量（默认0）
     *
     * @return sale - 销售量（默认0）
     */
    public Integer getSale() {
        return sale;
    }

    /**
     * 设置销售量（默认0）
     *
     * @param sale 销售量（默认0）
     */
    public void setSale(Integer sale) {
        this.sale = sale;
    }

    /**
     * 获取是否新品（0：否，1：是，默认是）
     *
     * @return is_new - 是否新品（0：否，1：是，默认是）
     */
    public Byte getIsNew() {
        return isNew;
    }

    /**
     * 设置是否新品（0：否，1：是，默认是）
     *
     * @param isNew 是否新品（0：否，1：是，默认是）
     */
    public void setIsNew(Byte isNew) {
        this.isNew = isNew;
    }

    /**
     * 获取是否推荐（0：否，1：是，默认否）
     *
     * @return is_recommend - 是否推荐（0：否，1：是，默认否）
     */
    public Byte getIsRecommend() {
        return isRecommend;
    }

    /**
     * 设置是否推荐（0：否，1：是，默认否）
     *
     * @param isRecommend 是否推荐（0：否，1：是，默认否）
     */
    public void setIsRecommend(Byte isRecommend) {
        this.isRecommend = isRecommend;
    }

    /**
     * 获取上架时间
     *
     * @return added_time - 上架时间
     */
    public Date getAddedTime() {
        return addedTime;
    }

    /**
     * 设置上架时间
     *
     * @param addedTime 上架时间
     */
    public void setAddedTime(Date addedTime) {
        this.addedTime = addedTime;
    }

    /**
     * 获取评价数（默认0）
     *
     * @return appraise - 评价数（默认0）
     */
    public Integer getAppraise() {
        return appraise;
    }

    /**
     * 设置评价数（默认0）
     *
     * @param appraise 评价数（默认0）
     */
    public void setAppraise(Integer appraise) {
        this.appraise = appraise;
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