package com.liuzy.hms.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "`member`")
public class Member implements Serializable {
    /**
     * 自增主键
     */
    @Id
    @Column(name = "`id`")
    private Integer id;

    /**
     * 登录用户名（默认手机号）
     */
    @Column(name = "`login_name`")
    private String loginName;

    /**
     * 登录密码
     */
    @Column(name = "`login_pwd`")
    private String loginPwd;

    /**
     * 微信openid
     */
    @Column(name = "`wx_openid`")
    private String wxOpenid;

    /**
     * 用户名（默认手机号）
     */
    @Column(name = "`username`")
    private String username;

    /**
     * 真实姓名
     */
    @Column(name = "`true_name`")
    private String trueName;

    /**
     * 性别（1表示男，0表示女，默认男）
     */
    @Column(name = "`gender`")
    private Byte gender;

    /**
     * 出生日期
     */
    @Column(name = "`birth`")
    private Date birth;

    /**
     * 邮箱
     */
    @Column(name = "`email`")
    private String email;

    /**
     * 家庭住址
     */
    @Column(name = "`address`")
    private String address;

    /**
     * 联系电话
     */
    @Column(name = "`phone`")
    private String phone;

    /**
     * 下单次数（默认0）
     */
    @Column(name = "`order_num`")
    private Integer orderNum;

    /**
     * 评价次数（默认0）
     */
    @Column(name = "`appraise_num`")
    private Integer appraiseNum;

    /**
     * 购物总金额数（默认0）
     */
    @Column(name = "`total_shopping_amount`")
    private Integer totalShoppingAmount;

    /**
     * 创建时间（注册时间）
     */
    @Column(name = "`create_time`")
    private Date createTime;

    /**
     * 数据有效标准（-1：删除，1：有效）
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
     * 获取登录用户名（默认手机号）
     *
     * @return login_name - 登录用户名（默认手机号）
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * 设置登录用户名（默认手机号）
     *
     * @param loginName 登录用户名（默认手机号）
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    /**
     * 获取登录密码
     *
     * @return login_pwd - 登录密码
     */
    public String getLoginPwd() {
        return loginPwd;
    }

    /**
     * 设置登录密码
     *
     * @param loginPwd 登录密码
     */
    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    /**
     * 获取微信openid
     *
     * @return wx_openid - 微信openid
     */
    public String getWxOpenid() {
        return wxOpenid;
    }

    /**
     * 设置微信openid
     *
     * @param wxOpenid 微信openid
     */
    public void setWxOpenid(String wxOpenid) {
        this.wxOpenid = wxOpenid;
    }

    /**
     * 获取用户名（默认手机号）
     *
     * @return username - 用户名（默认手机号）
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名（默认手机号）
     *
     * @param username 用户名（默认手机号）
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取真实姓名
     *
     * @return true_name - 真实姓名
     */
    public String getTrueName() {
        return trueName;
    }

    /**
     * 设置真实姓名
     *
     * @param trueName 真实姓名
     */
    public void setTrueName(String trueName) {
        this.trueName = trueName;
    }

    /**
     * 获取性别（1表示男，0表示女，默认男）
     *
     * @return gender - 性别（1表示男，0表示女，默认男）
     */
    public Byte getGender() {
        return gender;
    }

    /**
     * 设置性别（1表示男，0表示女，默认男）
     *
     * @param gender 性别（1表示男，0表示女，默认男）
     */
    public void setGender(Byte gender) {
        this.gender = gender;
    }

    /**
     * 获取出生日期
     *
     * @return birth - 出生日期
     */
    public Date getBirth() {
        return birth;
    }

    /**
     * 设置出生日期
     *
     * @param birth 出生日期
     */
    public void setBirth(Date birth) {
        this.birth = birth;
    }

    /**
     * 获取邮箱
     *
     * @return email - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取家庭住址
     *
     * @return address - 家庭住址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置家庭住址
     *
     * @param address 家庭住址
     */
    public void setAddress(String address) {
        this.address = address;
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
     * 获取下单次数（默认0）
     *
     * @return order_num - 下单次数（默认0）
     */
    public Integer getOrderNum() {
        return orderNum;
    }

    /**
     * 设置下单次数（默认0）
     *
     * @param orderNum 下单次数（默认0）
     */
    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    /**
     * 获取评价次数（默认0）
     *
     * @return appraise_num - 评价次数（默认0）
     */
    public Integer getAppraiseNum() {
        return appraiseNum;
    }

    /**
     * 设置评价次数（默认0）
     *
     * @param appraiseNum 评价次数（默认0）
     */
    public void setAppraiseNum(Integer appraiseNum) {
        this.appraiseNum = appraiseNum;
    }

    /**
     * 获取购物总金额数（默认0）
     *
     * @return total_shopping_amount - 购物总金额数（默认0）
     */
    public Integer getTotalShoppingAmount() {
        return totalShoppingAmount;
    }

    /**
     * 设置购物总金额数（默认0）
     *
     * @param totalShoppingAmount 购物总金额数（默认0）
     */
    public void setTotalShoppingAmount(Integer totalShoppingAmount) {
        this.totalShoppingAmount = totalShoppingAmount;
    }

    /**
     * 获取创建时间（注册时间）
     *
     * @return create_time - 创建时间（注册时间）
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间（注册时间）
     *
     * @param createTime 创建时间（注册时间）
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取数据有效标准（-1：删除，1：有效）
     *
     * @return data_flag - 数据有效标准（-1：删除，1：有效）
     */
    public Byte getDataFlag() {
        return dataFlag;
    }

    /**
     * 设置数据有效标准（-1：删除，1：有效）
     *
     * @param dataFlag 数据有效标准（-1：删除，1：有效）
     */
    public void setDataFlag(Byte dataFlag) {
        this.dataFlag = dataFlag;
    }
}