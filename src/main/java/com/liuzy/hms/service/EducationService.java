package com.liuzy.hms.service;

import com.liuzy.hms.pojo.Education;

import java.util.List;

/**
 * @Author LiuZiYi
 * @Date 2021/1/19 10:37
 * @Version 1.0
 */
public interface EducationService {
    // 查询所有学历信息
    List<Education> queryAllEducation();
    // 根据id查询学历信息
    Education queryEducationById(Integer id);
}
