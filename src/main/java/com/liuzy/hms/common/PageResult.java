package com.liuzy.hms.common;

import java.util.List;

/**
 * @Author LiuZiYi
 * @Date 2021/1/29 16:19
 * @Version 1.0
 */
public class PageResult {
    //当前页码
    private Integer pageNum;
    //每页数量
    private Integer pageSize;
    //记录总数
    private Long totalSize;
    //数据
    private List<?> items;

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
    public Long getTotalSize() {
        return totalSize;
    }
    public void setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
    }

    public List<?> getItems() {
        return items;
    }

    public void setItems(List<?> items) {
        this.items = items;
    }
}
