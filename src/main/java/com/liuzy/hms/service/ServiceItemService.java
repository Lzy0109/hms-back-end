package com.liuzy.hms.service;

import com.liuzy.hms.pojo.ServiceItem;

import java.util.List;

/**
 * @Author LiuZiYi
 * @Date 2021/1/23 14:23
 * @Version 1.0
 */
public interface ServiceItemService {
    // 查询所有服务项目
    List<ServiceItem> queryAllServiceItem();
    // 根据id查询服务项目
    ServiceItem queryServiceItemById(Integer id);
    // 修改服务项目
    Integer updateServiceItem(ServiceItem serviceItem);
    // 根据id删除服务项目
    Integer deleteServiceItemById(Integer id);
}
