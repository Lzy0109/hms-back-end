package com.liuzy.hms.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "`service_item_attachment`")
public class ServiceItemAttachment implements Serializable {
    /**
     * 自增主键
     */
    @Id
    @Column(name = "`id`")
    private Integer id;

    /**
     * 服务项目id（逻辑外键）
     */
    @Column(name = "`item_id`")
    private Integer itemId;

    /**
     * 附件名称
     */
    @Column(name = "`attachment_name`")
    private String attachmentName;

    /**
     * 附件路径
     */
    @Column(name = "`path`")
    private String path;

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
     * 获取服务项目id（逻辑外键）
     *
     * @return item_id - 服务项目id（逻辑外键）
     */
    public Integer getItemId() {
        return itemId;
    }

    /**
     * 设置服务项目id（逻辑外键）
     *
     * @param itemId 服务项目id（逻辑外键）
     */
    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    /**
     * 获取附件名称
     *
     * @return attachment_name - 附件名称
     */
    public String getAttachmentName() {
        return attachmentName;
    }

    /**
     * 设置附件名称
     *
     * @param attachmentName 附件名称
     */
    public void setAttachmentName(String attachmentName) {
        this.attachmentName = attachmentName;
    }

    /**
     * 获取附件路径
     *
     * @return path - 附件路径
     */
    public String getPath() {
        return path;
    }

    /**
     * 设置附件路径
     *
     * @param path 附件路径
     */
    public void setPath(String path) {
        this.path = path;
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