package com.liuzy.hms.common;

/**
 * @Author LiuZiYi
 * @Date 2021/1/17 下午8:52
 * @Version 1.0
 */
public enum ResultCode {
    // 添加会员信息
    INSERT_MEMBER_SUCCESS(1, "添加会员信息成功"),
    INSERT_MEMBER_FAILED(0, "添加会员信息失败"),
    INSERT_MEMBER_EXCEPTION(-1, "添加会员信息异常"),



    SYSTEM_BUSY(-1, "系统繁忙"),
    LOGIN_SUCCESS(1, "登陆成功");

    /**
     * 状态
     * 1：成功；0：失败；-1：异常
     */
    private Integer status;
    /**
     * 状态信息
     */
    private String message;

    ResultCode(Integer status, String message) {
        this.status = status;
        this.message = message;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
