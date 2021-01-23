package com.liuzy.hms.service.impl;

import com.liuzy.hms.mapper.OrderMapper;
import com.liuzy.hms.pojo.Order;
import com.liuzy.hms.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author LiuZiYi
 * @Date 2021/1/23 10:30
 * @Version 1.0
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;

    @Override
    public Integer insertOrder(Order order) {
        return orderMapper.insert(order);
    }

    @Override
    public List<Order> queryAllOrder() {
        return orderMapper.selectAll();
    }

    @Override
    public Order queryOrderById(Integer id) {
        Order order = orderMapper.selectByPrimaryKey(id);
        if(order.getDataFlag() == -1) {
            return null;
        } else {
            return order;
        }
    }

    @Override
    public Integer deleteOrderById(Integer id) {
        Order order = orderMapper.selectByPrimaryKey(id);
        // 先检查是否存在该数据和数据是否有效
        if(order == null || order.getDataFlag() == -1) {
            return -1;
        } else {
            Order orderExample = new Order();
            orderExample.setId(id);
            // 设置数据无效
            orderExample.setDataFlag((byte) -1);
            return orderMapper.updateByPrimaryKeySelective(orderExample);
        }
    }

    @Override
    public Integer updateOrder(Order order) {
        // 先检查是否存在该数据和数据是否有效
        if(orderMapper.selectByPrimaryKey(order.getId()) == null || order.getDataFlag() == -1) {
            return -1;
        } else {
            return orderMapper.updateByPrimaryKeySelective(order);
        }
    }
}
