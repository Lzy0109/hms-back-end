package com.liuzy.hms.controller;

import com.liuzy.hms.common.JsonResult;
import com.liuzy.hms.mapper.EducationMapper;
import com.liuzy.hms.mapper.NationMapper;
import com.liuzy.hms.pojo.Staff;
import com.liuzy.hms.service.StaffService;
import com.liuzy.hms.util.VoUtil;
import com.liuzy.hms.vo.StaffListItemVO;
import com.liuzy.hms.vo.StaffVo;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author LiuZiYi
 * @Date 2021/1/18 下午9:03
 * @Version 1.0
 */
@RestController
@RequestMapping("/staff")
public class StaffController {
    private static final Logger log = LoggerFactory.getLogger(StaffController.class);

    @Autowired
    private StaffService staffService;
    @Autowired
    private VoUtil voUtil;

    @PostMapping
    @ApiOperation("添加员工信息")
    public JsonResult insertStaff(Staff staff) {
        log.info("insert staff");
        Integer record = staffService.insertStaff(staff);
        if(record != 1) {
            return JsonResult.errorUnknow();
        } else {
            return JsonResult.isOk(record);
        }
    }

    @GetMapping("/{id:\\d+}")
    @ApiOperation("根据id查询员工信息")
    public JsonResult queryStaffById(@PathVariable Integer id) {
        log.info("query staff by id:" + id);
        StaffVo staffVo = voUtil.toStaffVo(staffService.queryStaffById(id));
        if(staffVo == null) {
            return JsonResult.errorNotFound();
        } else {
            return JsonResult.isOk(staffVo);
        }
    }

    @GetMapping
    @ApiOperation("查询所有员工信息")
    public JsonResult queryAllStaff() {
        log.info("query all staff");
        List<Staff> staffList = staffService.queryAllStaff();
        List<StaffListItemVO> staffListVo = new ArrayList<>();
        for (Staff staff: staffList) {
            staffListVo.add(voUtil.toStaffListItemVo(staff));
        }
        return JsonResult.isOk(staffListVo);
    }

    @DeleteMapping("/{id:\\d+}")
    @ApiOperation("根据id删除员工")
    public JsonResult deleteStaffById(@PathVariable Integer id) {
        log.info("delete staff by id:" + id);
        Integer record = staffService.deleteStaffById(id);
        if(record == -1) {
            return JsonResult.errorNotFound();
        } else {
            return JsonResult.isOk(record);
        }
    }

    @PutMapping
    @ApiOperation("修改员工信息")
    public JsonResult updateStaff(Staff staff) {
        log.info("update staff");
        Integer record = staffService.updateStaff(staff);
        if(record == -1) {
            return JsonResult.errorNotFound();
        } else {
            return JsonResult.isOk(record);
        }
    }
}
