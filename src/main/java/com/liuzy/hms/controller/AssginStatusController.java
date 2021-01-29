package com.liuzy.hms.controller;

import com.liuzy.hms.common.JsonResult;
import com.liuzy.hms.service.AssginStatusService;
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
 * @Date 2021/1/20 15:39
 * @Version 1.0
 */
@RestController
@RequestMapping("/assginstatus")
public class AssginStatusController {
    private static final Logger log = LoggerFactory.getLogger(AssginStatusController.class);
    @Autowired
    private AssginStatusService assginStatusService;

    @GetMapping
    @ApiOperation("查询所有派遣状态")
    public JsonResult queryAllAssignStatus() {
        return JsonResult.isOk(assginStatusService.queryAllAssignStatus());
    }

    @GetMapping("{id:\\d+}")
    @ApiOperation("根据id查询派遣状态")
    public JsonResult queryAssignStatusById(@PathVariable Integer id) {
        return JsonResult.isOk(assginStatusService.queryAssignStatusById(id));
    }
}
