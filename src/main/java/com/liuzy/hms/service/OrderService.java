package com.liuzy.hms.service;

import com.liuzy.hms.pojo.Order;

import java.util.List;

/**
 * @Author LiuZiYi
 * @Date 2021/1/23 10:27
 * @Version 1.0
 */
public interface OrderService {
    // 添加订单信息
    Integer insertOrder(Order order);
    // 查询所有订单
    List<Order> queryAllOrder();
    // 根据id查询订单
    Order queryOrderById(Integer id);
    // 根据id删除订单
    Integer deleteOrderById(Integer id);
    // 修改订单信息
    Integer updateOrder(Order order);
}
