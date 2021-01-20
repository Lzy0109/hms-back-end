package com.liuzy.hms.vo;

/**
 * @Author LiuZiYi
 * @Date 2021/1/19 21:18
 * @Version 1.0
 */
public class PositionVo {
    private Integer id;
    private String positionName;
    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
