package com.liuzy.hms.controller;

import com.liuzy.hms.common.JsonResult;
import com.liuzy.hms.pojo.OrderStatus;
import com.liuzy.hms.service.OrderStatusService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author LiuZiYi
 * @Date 2021/1/20 15:25
 * @Version 1.0
 */
@RestController
@RequestMapping("/orderstatus")
public class OrderStatusController {
    private static final Logger log = LoggerFactory.getLogger(OrderStatusController.class);

    @Autowired
    private OrderStatusService orderStatusService;

    @GetMapping
    @ApiOperation("查询所有订单状态")
    public JsonResult queryAllOrderStatus() {
        log.info("query all order status");
        return JsonResult.isOk(orderStatusService.queryAllOrderStatus());
    }

    @GetMapping("/{id:\\d+}")
    @ApiOperation("根据id查询订单状态")
    public JsonResult queryOrderStatusById(@PathVariable Integer id) {
        log.info("query order status by id:" + id);
        return JsonResult.isOk(orderStatusService.queryOrderStatusById(id));
    }
}
