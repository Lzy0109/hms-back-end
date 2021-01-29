package com.liuzy.hms.common;

/**
 * @Author LiuZiYi
 * @Date 2021/1/29 21:58
 * @Version 1.0
 */
public class PageRequest {
    //当前页码
    private Integer pageNum;
    //每页数量
    private Integer pageSize;

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
