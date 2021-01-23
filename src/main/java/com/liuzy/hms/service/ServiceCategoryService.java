package com.liuzy.hms.service;

import com.liuzy.hms.pojo.ServiceCategory;

import java.util.List;

/**
 * @Author LiuZiYi
 * @Date 2021/1/23 14:46
 * @Version 1.0
 */
public interface ServiceCategoryService {
    // 查询所有服务分类
    List<ServiceCategory> queryAllServiceCategory();
    // 根据id查询服务分类
    ServiceCategory queryServiceCategoryById(Integer id);
    // 添加服务分类
    Integer insertServiceCategory(ServiceCategory serviceCategory);
    // 根据id删除服务分类
    Integer deleteServiceCategoryById(Integer id);
    // 修改服务分类
    Integer updateServiceCategory(ServiceCategory serviceCategory);
}
