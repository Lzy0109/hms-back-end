package com.liuzy.hms.controller;

import com.liuzy.hms.common.JsonResult;
import com.liuzy.hms.pojo.Order;
import com.liuzy.hms.service.OrderService;
import com.liuzy.hms.util.VoUtil;
import com.liuzy.hms.vo.OrderListItemVo;
import com.liuzy.hms.vo.OrderVo;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author LiuZiYi
 * @Date 2021/1/23 11:18
 * @Version 1.0
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    private static final Logger log = LoggerFactory.getLogger(OrderController.class);

    @Autowired
    private OrderService orderService;
    @Autowired
    private VoUtil voUtil;

    @PostMapping
    @ApiOperation("添加订单")
    public JsonResult insertOrder(Order order) {
        Integer record = orderService.insertOrder(order);
        if(record != 1) {
            return JsonResult.errorUnknow();
        } else {
            return JsonResult.isOk(record);
        }
    }

    @GetMapping
    @ApiOperation("查询所有订单")
    public JsonResult queryAllOrder() {
        log.info("query all order");
        List<Order> orderList = orderService.queryAllOrder();
        List<OrderListItemVo> orderListVo = new ArrayList<>();
        for (Order order: orderList) {
            orderListVo.add(voUtil.toOrderListItemVo(order));
        }
        return JsonResult.isOk(orderListVo);
    }

    @GetMapping("{id:\\d+}")
    @ApiOperation("根据id查询订单")
    public JsonResult queryOrderById(@PathVariable Integer id) {
        log.info("query order by id:" + id);
        OrderVo orderVo = voUtil.toOrderVo(orderService.queryOrderById(id));
        if(orderVo == null) {
            return JsonResult.errorNotFound();
        } else {
            return JsonResult.isOk(orderVo);
        }
    }

    @DeleteMapping("/{id:\\d+}")
    @ApiOperation("根据id删除订单")
    public JsonResult deleteOrderById(@PathVariable Integer id) {
        log.info("delete order by id:" + id);
        Integer record = orderService.deleteOrderById(id);
        if(record == -1) {
            return JsonResult.errorNotFound();
        } else {
            return JsonResult.isOk(record);
        }
    }

    @PutMapping
    @ApiOperation("修改订单信息")
    public JsonResult updateOrder(Order order) {
        log.info("update order");
        Integer record = orderService.updateOrder(order);
        if(record == -1) {
            return JsonResult.errorNotFound();
        } else {
            return JsonResult.isOk(record);
        }
    }
}
