package com.liuzy.hms.controller;

import com.liuzy.hms.common.JsonResult;
import com.liuzy.hms.service.EducationService;
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
 * @Date 2021/1/19 10:40
 * @Version 1.0
 */
@RestController
@RequestMapping("/education")
public class EducationController {
    private static final Logger log = LoggerFactory.getLogger(EducationController.class);
    @Autowired
    private EducationService educationService;

    @GetMapping
    @ApiOperation("查询所有学历信息")
    public JsonResult queryAllEducation() {
        log.info("query all education");
        return JsonResult.isOk(educationService.queryAllEducation());
    }

    @GetMapping("/{id:\\d+}")
    @ApiOperation("根据id查询学历信息")
    public JsonResult queryEducationById(@PathVariable Integer id) {
        log.info("query education by id:" + id);
        return JsonResult.isOk(educationService.queryEducationById(id));
    }
}
