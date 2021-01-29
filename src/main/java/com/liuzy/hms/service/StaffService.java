package com.liuzy.hms.service;

import com.liuzy.hms.pojo.Staff;
import com.liuzy.hms.vo.StaffVo;
import io.swagger.models.auth.In;

import java.util.List;

/**
 * @Author LiuZiYi
 * @Date 2021/1/18 下午9:03
 * @Version 1.0
 */
public interface StaffService {
    // 添加员工信息
    Integer insertStaff(Staff staff);
    // 根据id查询员工信息
    Staff queryStaffById(Integer id);
    // 条件查询员工信息
    List<Staff> queryStaffByExample(Staff staff, Integer pageNum, Integer pageSize);
    // 查询所有员工信息
    List<Staff> queryAllStaff(Integer pageNum, Integer pageSize);
    // 根据id删除员工信息
    Integer deleteStaffById(Integer id);
    // 修改员工信息
    Integer updateStaff(Staff staff);
}
