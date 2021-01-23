package com.liuzy.hms.service;

import com.liuzy.hms.pojo.OrderStatus;

import java.util.List;

/**
 * @Author LiuZiYi
 * @Date 2021/1/20 15:17
 * @Version 1.0
 */
public interface OrderStatusService {
    // 查询所有订单状态
    List<OrderStatus> queryAllOrderStatus();
    // 根据id查询订单状态
    OrderStatus queryOrderStatusById(Integer id);

}
