package com.liuzy.hms.service;

import com.liuzy.hms.pojo.Position;

import java.util.List;

/**
 * @Author LiuZiYi
 * @Date 2021/1/19 20:40
 * @Version 1.0
 */
public interface PositionService {
    // 根据id查询职位
    Position queryPositionById(Integer id);
    // 查询所有职位
    List<Position> queryAllPosition();
}
