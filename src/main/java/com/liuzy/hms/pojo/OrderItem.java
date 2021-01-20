package com.liuzy.hms.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "`order_item`")
public class OrderItem implements Serializable {
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
     * 项目名称
     */
    @Column(name = "`item_name`")
    private String itemName;

    /**
     * 项目价格
     */
    @Column(name = "`item_price`")
    private BigDecimal itemPrice;

    /**
     * 下单个数
     */
    @Column(name = "`num`")
    private Integer num;

    /**
     * 项目图片
     */
    @Column(name = "`item_image`")
    private String itemImage;

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
     * 获取项目名称
     *
     * @return item_name - 项目名称
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * 设置项目名称
     *
     * @param itemName 项目名称
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * 获取项目价格
     *
     * @return item_price - 项目价格
     */
    public BigDecimal getItemPrice() {
        return itemPrice;
    }

    /**
     * 设置项目价格
     *
     * @param itemPrice 项目价格
     */
    public void setItemPrice(BigDecimal itemPrice) {
        this.itemPrice = itemPrice;
    }

    /**
     * 获取下单个数
     *
     * @return num - 下单个数
     */
    public Integer getNum() {
        return num;
    }

    /**
     * 设置下单个数
     *
     * @param num 下单个数
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * 获取项目图片
     *
     * @return item_image - 项目图片
     */
    public String getItemImage() {
        return itemImage;
    }

    /**
     * 设置项目图片
     *
     * @param itemImage 项目图片
     */
    public void setItemImage(String itemImage) {
        this.itemImage = itemImage;
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