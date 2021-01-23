package com.liuzy.hms.service;

import com.liuzy.hms.pojo.Assign;

import java.util.List;

/**
 * @Author LiuZiYi
 * @Date 2021/1/23 14:06
 * @Version 1.0
 */
public interface AssignService {
    // 添加任务派遣
    Integer insertAssign(Assign assign);
    // 根据id删除任务派遣
    Integer deleteAssignById(Integer id);
    // 修改任务派遣信息
    Integer updateAssign(Assign assign);
    // 查询所有任务派遣信息
    List<Assign> queryAllAssign();
    // 根据id查询任务派遣信息
    Assign queryAssignById(Integer id);
}
