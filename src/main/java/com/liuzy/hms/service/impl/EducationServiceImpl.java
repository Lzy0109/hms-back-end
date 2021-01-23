package com.liuzy.hms.service.impl;

import com.liuzy.hms.mapper.EducationMapper;
import com.liuzy.hms.pojo.Education;
import com.liuzy.hms.service.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author LiuZiYi
 * @Date 2021/1/19 10:38
 * @Version 1.0
 */
@Service
public class EducationServiceImpl implements EducationService {
    @Autowired
    private EducationMapper educationMapper;

    @Override
    public List<Education> queryAllEducation() {
        return educationMapper.selectAll();
    }

    @Override
    public Education queryEducationById(Integer id) {
        Education education = educationMapper.selectByPrimaryKey(id);
        // 检查数据是否有效
        if(education.getDataFlag() == -1) {
            return null;
        } else {
            return education;
        }
    }
}
