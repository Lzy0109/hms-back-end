package com.liuzy.hms.service.impl;

import com.liuzy.hms.mapper.ServiceCategoryMapper;
import com.liuzy.hms.pojo.ServiceCategory;
import com.liuzy.hms.pojo.Staff;
import com.liuzy.hms.service.ServiceCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author LiuZiYi
 * @Date 2021/1/23 14:49
 * @Version 1.0
 */
@Service
public class ServiceCategoryServiceImpl implements ServiceCategoryService {
    @Autowired
    private ServiceCategoryMapper serviceCategoryMapper;

    @Override
    public List<ServiceCategory> queryAllServiceCategory() {
        return serviceCategoryMapper.selectAll();
    }

    @Override
    public ServiceCategory queryServiceCategoryById(Integer id) {
        ServiceCategory serviceCategory = serviceCategoryMapper.selectByPrimaryKey(id);
        // 检查数据是否有效
        if(serviceCategory.getDataFlag() == -1) {
            return null;
        } else {
            return serviceCategory;
        }
    }

    @Override
    public Integer insertServiceCategory(ServiceCategory serviceCategory) {
        return serviceCategoryMapper.insert(serviceCategory);
    }

    @Override
    public Integer deleteServiceCategoryById(Integer id) {
        ServiceCategory serviceCategory = serviceCategoryMapper.selectByPrimaryKey(id);
        // 先检查是否存在该数据和数据是否有效
        if(serviceCategory == null || serviceCategory.getDataFlag() == -1) {
            return -1;
        } else {
            ServiceCategory serviceCategoryExample = new ServiceCategory();
            serviceCategoryExample.setId(id);
            // 设置数据无效
            serviceCategoryExample.setDataFlag((byte) -1);
            return serviceCategoryMapper.updateByPrimaryKeySelective(serviceCategoryExample);
        }
    }

    @Override
    public Integer updateServiceCategory(ServiceCategory serviceCategory) {
        // 先检查是否存在该数据和数据是否有效
        if(serviceCategoryMapper.selectByPrimaryKey(serviceCategory.getId()) == null ||
                serviceCategory.getDataFlag() == -1) {
            return -1;
        } else {
            return serviceCategoryMapper.updateByPrimaryKeySelective(serviceCategory);
        }
    }
}
