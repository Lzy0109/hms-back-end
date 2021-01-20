package com.liuzy.hms.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "`staff_login`")
public class StaffLogin implements Serializable {
    /**
     * 自增主键
     */
    @Id
    @Column(name = "`id`")
    private Integer id;

    /**
     * 员工id（逻辑外键）
     */
    @Column(name = "`staff_id`")
    private Integer staffId;

    /**
     * 登录账号（工号）
     */
    @Column(name = "`login_name`")
    private String loginName;

    /**
     * 登陆密码
     */
    @Column(name = "`login_pwd`")
    private String loginPwd;

    /**
     * 登录类型（逻辑外键）
     */
    @Column(name = "`position_id`")
    private Integer positionId;

    /**
     * 账号状态（-1：停用，1：正常）
     */
    @Column(name = "`login_status`")
    private Byte loginStatus;

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
     * 获取员工id（逻辑外键）
     *
     * @return staff_id - 员工id（逻辑外键）
     */
    public Integer getStaffId() {
        return staffId;
    }

    /**
     * 设置员工id（逻辑外键）
     *
     * @param staffId 员工id（逻辑外键）
     */
    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    /**
     * 获取登录账号（工号）
     *
     * @return login_name - 登录账号（工号）
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * 设置登录账号（工号）
     *
     * @param loginName 登录账号（工号）
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    /**
     * 获取登陆密码
     *
     * @return login_pwd - 登陆密码
     */
    public String getLoginPwd() {
        return loginPwd;
    }

    /**
     * 设置登陆密码
     *
     * @param loginPwd 登陆密码
     */
    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    /**
     * 获取登录类型（逻辑外键）
     *
     * @return position_id - 登录类型（逻辑外键）
     */
    public Integer getPositionId() {
        return positionId;
    }

    /**
     * 设置登录类型（逻辑外键）
     *
     * @param positionId 登录类型（逻辑外键）
     */
    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    /**
     * 获取账号状态（-1：停用，1：正常）
     *
     * @return login_status - 账号状态（-1：停用，1：正常）
     */
    public Byte getLoginStatus() {
        return loginStatus;
    }

    /**
     * 设置账号状态（-1：停用，1：正常）
     *
     * @param loginStatus 账号状态（-1：停用，1：正常）
     */
    public void setLoginStatus(Byte loginStatus) {
        this.loginStatus = loginStatus;
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