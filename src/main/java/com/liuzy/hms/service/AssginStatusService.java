package com.liuzy.hms.service;

import com.liuzy.hms.pojo.AssignStatus;

import java.util.List;

/**
 * @Author LiuZiYi
 * @Date 2021/1/20 15:35
 * @Version 1.0
 */
public interface AssginStatusService {
    // 查询所有派遣状态
    List<AssignStatus> queryAllAssignStatus();
    // 根据id查询派遣状态
    AssignStatus queryAssignStatusById(Integer id);
}
