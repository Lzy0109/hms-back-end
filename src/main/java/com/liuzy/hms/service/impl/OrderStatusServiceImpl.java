package com.liuzy.hms.service.impl;

import com.liuzy.hms.mapper.OrderStatusMapper;
import com.liuzy.hms.pojo.OrderStatus;
import com.liuzy.hms.service.OrderStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author LiuZiYi
 * @Date 2021/1/20 15:18
 * @Version 1.0
 */
@Service
public class OrderStatusServiceImpl implements OrderStatusService {
    @Autowired
    private OrderStatusMapper orderStatusMapper;

    @Override
    public List<OrderStatus> queryAllOrderStatus() {
        return orderStatusMapper.selectAll();
    }

    @Override
    public OrderStatus queryOrderStatusById(Integer id) {
        OrderStatus orderStatus = orderStatusMapper.selectByPrimaryKey(id);
        // 检查数据是否有效
        if(orderStatus.getDataFlag() == -1) {
            return null;
        } else {
            return orderStatus;
        }
    }
}
