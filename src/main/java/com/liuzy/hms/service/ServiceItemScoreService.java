package com.liuzy.hms.service;

import com.liuzy.hms.pojo.ServiceItemScore;

import java.util.List;

/**
 * @Author LiuZiYi
 * @Date 2021/1/23 14:38
 * @Version 1.0
 */
public interface ServiceItemScoreService {
    // 查询所有服务项目评分
    List<ServiceItemScore> queryAllServiceItemScore();
    // 根据id查询服务项目评分
    ServiceItemScore queryServiceItemScoreById(Integer id);
    // 添加服务项目评分
    Integer insertServiceItemScore(ServiceItemScore serviceItemScore);
    // 修改服务项目评分
    Integer updateServiceItemScore(ServiceItemScore serviceItemScore);
    // 根据id删除服务项目评分
    Integer deleteServiceItemScoreById(Integer id);
}
