package com.liuzy.hms.service;

import com.liuzy.hms.pojo.Nation;

import java.util.List;

/**
 * @Author LiuZiYi
 * @Date 2021/1/19 10:05
 * @Version 1.0
 */
public interface NationService {
    // 查询所有民族信息
    List<Nation> queryAllNation();
    // 根据id查询民族信息
    Nation queryNationById(Integer id);
}
