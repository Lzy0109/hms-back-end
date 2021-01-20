package com.liuzy.hms.controller;

import com.liuzy.hms.common.JsonResult;
import com.liuzy.hms.service.PositionService;
import com.liuzy.hms.util.VoUtil;
import com.liuzy.hms.vo.PositionVo;
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
 * @Date 2021/1/19 21:15
 * @Version 1.0
 */
@RestController
@RequestMapping("/position")
public class PositionController {
    private static final Logger log = LoggerFactory.getLogger(PositionController.class);

    @Autowired
    private PositionService positionService;
    @Autowired
    private VoUtil voUtil;

    @GetMapping("/{id:\\d+}")
    @ApiOperation("根据id查询职位信息")
    public JsonResult queryPositionById(@PathVariable Integer id) {
        log.info("query position by id:" + id);
        PositionVo positionVo = voUtil.toPositionVo(positionService.queryPositionById(id));
        if(positionVo == null) {
            return JsonResult.errorNotFound();
        } else {
            return JsonResult.isOk(positionVo);
        }
    }
}
