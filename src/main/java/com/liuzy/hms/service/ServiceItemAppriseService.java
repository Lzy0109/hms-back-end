package com.liuzy.hms.service;

import com.liuzy.hms.pojo.ServiceItemApprise;

import java.util.List;

/**
 * @Author LiuZiYi
 * @Date 2021/1/23 14:30
 * @Version 1.0
 */
public interface ServiceItemAppriseService {
    // 查询所有项目评价
    List<ServiceItemApprise> queryAllServiceItemApprise();
    // 根据id查询项目评价
    ServiceItemApprise queryServiceItemApprise(Integer id);
    // 修改项目评价
    Integer updateServiceItemApprise(ServiceItemApprise serviceItemApprise);
    // 添加项目评价
    Integer insertServiceItemApprise(ServiceItemApprise serviceItemApprise);
    // 根据id删除项目评价
    Integer deleteServiceItemAppriseById(Integer id);
}
