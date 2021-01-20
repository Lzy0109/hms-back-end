package com.liuzy.hms.util;

import com.liuzy.hms.mapper.EducationMapper;
import com.liuzy.hms.mapper.NationMapper;
import com.liuzy.hms.mapper.PositionMapper;
import com.liuzy.hms.pojo.Position;
import com.liuzy.hms.pojo.Staff;
import com.liuzy.hms.vo.PositionVo;
import com.liuzy.hms.vo.StaffListItemVO;
import com.liuzy.hms.vo.StaffVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @Author LiuZiYi
 * @Date 2021/1/19 12:53
 * @Version 1.0
 */
@Component
public class VoUtil {
    @Autowired
    private NationMapper nationMapper;
    @Autowired
    private EducationMapper educationMapper;
    @Autowired
    private PositionMapper positionMapper;

    /**
     * 将staff对象转换为staffVo对象
     * @param staff
     * @return staffVo
     */
    public StaffVo toStaffVo(Staff staff) {
        StaffVo staffVo = new StaffVo();
        if(staff == null || staff.getDataFlag() == -1) {
            // 如果staff为null或数据无效，直接赋值为null
            staffVo = null;
        } else {
            BeanUtils.copyProperties(staff, staffVo);
            // 性别
            if(staff.getGender() == 1) {
                staffVo.setGender_name("男");
            } else {
                staffVo.setGender_name("女");
            }
            // 民族
            staffVo.setNation_name(nationMapper.selectByPrimaryKey(staff.getNation()).getNationName());
            // 学历
            staffVo.setEducation_name(educationMapper.selectByPrimaryKey(staff.getEducation()).getEduName());
            // 职位
            staffVo.setPosition_name(positionMapper.selectByPrimaryKey(staff.getPositionId()).getPositionName());
        }
        return staffVo;
    }

    /**
     * 将staff对象转换为staffListItemVo对象 用于列表信息提要
     * @param staff
     * @return staffListItemVo
     */
    public StaffListItemVO toStaffListItemVo(Staff staff) {
        StaffListItemVO staffListItemVO = new StaffListItemVO();
        if(staff == null || staff.getDataFlag() == -1) {
            // 如果staff为null或数据无效，直接赋值为null
            staffListItemVO = null;
        } else {
            BeanUtils.copyProperties(staff, staffListItemVO);
            // 性别
            if(staff.getGender() == 1) {
                staffListItemVO.setGender_name("男");
            } else {
                staffListItemVO.setGender_name("女");
            }
            // 学历
            staffListItemVO.setEducation_name(educationMapper.selectByPrimaryKey(staff.getEducation()).getEduName());
            // 职位
            staffListItemVO.setPosition_name(positionMapper.selectByPrimaryKey(staff.getPositionId()).getPositionName());
        }
        return staffListItemVO;
    }

    /**
     * 将position对象转换为positionVo对象
     * @param position
     * @return positionVo
     */
    public PositionVo toPositionVo(Position position) {
        PositionVo positionVo = new PositionVo();
        if(position == null) {
            positionVo = null;
        } else {
            BeanUtils.copyProperties(position, positionVo);
        }
        return positionVo;
    }
}
