package com.liuzy.hms.vo;

import java.util.Date;

/**
 * @Author LiuZiYi
 * @Date 2021/1/26 22:07
 * @Version 1.0
 */
public class AppriseListItemVo {
    private Integer id;
    private Integer itemId;
    // 评价用户
    private String memberName;
    private String comment;
    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
