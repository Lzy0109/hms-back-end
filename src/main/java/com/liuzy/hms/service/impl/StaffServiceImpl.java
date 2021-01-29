package com.liuzy.hms.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.liuzy.hms.mapper.StaffMapper;
import com.liuzy.hms.pojo.Staff;
import com.liuzy.hms.service.StaffService;
import com.liuzy.hms.util.JobNumberGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author LiuZiYi
 * @Date 2021/1/18 下午9:03
 * @Version 1.0
 */
@Service
@Transactional
public class StaffServiceImpl implements StaffService {
    @Autowired
    private StaffMapper staffMapper;
    @Autowired
    private JobNumberGenerator jobNumberGenerator;

    @Override
    public Integer insertStaff(Staff staff) {
        // 生成工号
        staff.setJobNumber(jobNumberGenerator.generator());
        // 同步登录账号
        staff.setLoginName(staff.getJobNumber());
        System.out.println("insert staff: " + staff.toString());
        return staffMapper.insertSelective(staff);
    }

    @Override
    public Staff queryStaffById(Integer id) {
        Staff staff = staffMapper.selectByPrimaryKey(id);
        // 检查数据是否有效
        if(staff.getDataFlag() == -1) {
            return null;
        } else {
            return staff;
        }
    }

    @Override
    public List<Staff> queryStaffByExample(Staff staff, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return staffMapper.select(staff);
    }

    @Override
    public List<Staff> queryAllStaff(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return staffMapper.selectAll();
    }

    @Override
    public Integer deleteStaffById(Integer id) {
        Staff staff = staffMapper.selectByPrimaryKey(id);
        // 先检查是否存在该数据和数据是否有效
        if(staff == null || staff.getDataFlag() == -1) {
            return -1;
        } else {
            Staff staffExample = new Staff();
            staffExample.setId(id);
            // 停用该账号
            staffExample.setLoginStatus((byte) -1);
            // 设置数据无效
            staffExample.setDataFlag((byte) -1);
            return staffMapper.updateByPrimaryKeySelective(staffExample);
        }
    }

    @Override
    public Integer updateStaff(Staff staff) {
        // 先检查是否存在该数据和数据是否有效
        if(staffMapper.selectByPrimaryKey(staff.getId()) == null || staff.getDataFlag() == -1) {
            return -1;
        } else {
            return staffMapper.updateByPrimaryKeySelective(staff);
        }
    }
}
