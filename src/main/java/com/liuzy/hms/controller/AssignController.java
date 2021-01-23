package com.liuzy.hms.controller;

import com.liuzy.hms.service.AssignService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author LiuZiYi
 * @Date 2021/1/23 14:18
 * @Version 1.0
 */
@RestController
@RequestMapping("/assign")
public class AssignController {
    private static final Logger log = LoggerFactory.getLogger(AssignController.class);

    @Autowired
    private AssignService assignService;
}
