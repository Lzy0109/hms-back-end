package com.liuzy.hms.controller;

import com.liuzy.hms.common.JsonResult;
import com.liuzy.hms.service.NationService;
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
 * @Date 2021/1/19 10:09
 * @Version 1.0
 */
@RestController
@RequestMapping("/nation")
public class NationController {
    private static final Logger log = LoggerFactory.getLogger(NationController.class);

    @Autowired
    private NationService nationService;

    @GetMapping
    @ApiOperation("查询所有民族信息")
    public JsonResult queryAllNation() {
        log.info("query all nation");
        return JsonResult.isOk(nationService.queryAllNation());
    }

    @GetMapping("/{id:\\d+}")
    @ApiOperation("根据id查询民族信息")
    public JsonResult queryNationById(@PathVariable Integer id) {
        log.info("query nation by id:" + id);
        return JsonResult.isOk(nationService.queryNationById(id));
    }
}
