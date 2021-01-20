package com.liuzy.hms.common;

/**
 * @Author LiuZiYi
 * @Date 2021/1/17 下午8:45
 * @Version 1.0
 */
public class JsonResult {
    /**
     * 状态码
     */
    private Integer status;
    /**
     * 返回信息
     */
    private String msg;
    /**
     * 返回数据
     */
    private Object data;

    public JsonResult(Integer status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public static JsonResult isOk(String msg, Object data) {
        return new JsonResult(200, msg, data);
    }

    public static JsonResult isOk(Object data) {
        return new JsonResult(200, "success", data);
    }

    public static JsonResult errorUnknow() {
        return new JsonResult(500, "Unknown error", null);
    }

    public static JsonResult errorUnauthorized() {
        return new JsonResult(401, "Unauthorized", null);
    }

    public static JsonResult errorNotFound() {
        return new JsonResult(404,"Not Found",null);
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
