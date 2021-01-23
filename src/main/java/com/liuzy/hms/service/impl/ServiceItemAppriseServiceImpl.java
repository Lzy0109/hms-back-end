package com.liuzy.hms.service.impl;

import com.liuzy.hms.mapper.ServiceItemAppriseMapper;
import com.liuzy.hms.pojo.ServiceItemApprise;
import com.liuzy.hms.pojo.Staff;
import com.liuzy.hms.service.ServiceItemAppriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author LiuZiYi
 * @Date 2021/1/23 14:32
 * @Version 1.0
 */
@Service
public class ServiceItemAppriseServiceImpl implements ServiceItemAppriseService {
    @Autowired
    private ServiceItemAppriseMapper serviceItemAppriseMapper;
    @Override
    public List<ServiceItemApprise> queryAllServiceItemApprise() {
        return serviceItemAppriseMapper.selectAll();
    }

    @Override
    public ServiceItemApprise queryServiceItemApprise(Integer id) {
        ServiceItemApprise serviceItemApprise = serviceItemAppriseMapper.selectByPrimaryKey(id);
        // 检查数据是否有效
        if(serviceItemApprise.getDataFlag() == -1) {
            return null;
        } else {
            return serviceItemApprise;
        }
    }

    @Override
    public Integer updateServiceItemApprise(ServiceItemApprise serviceItemApprise) {
        // 先检查是否存在该数据和数据是否有效
        if(serviceItemAppriseMapper.selectByPrimaryKey(serviceItemApprise.getId()) == null ||
                serviceItemApprise.getDataFlag() == -1) {
            return -1;
        } else {
            return serviceItemAppriseMapper.updateByPrimaryKeySelective(serviceItemApprise);
        }
    }

    @Override
    public Integer insertServiceItemApprise(ServiceItemApprise serviceItemApprise) {
        return serviceItemAppriseMapper.insert(serviceItemApprise);
    }

    @Override
    public Integer deleteServiceItemAppriseById(Integer id) {
        ServiceItemApprise serviceItemApprise = serviceItemAppriseMapper.selectByPrimaryKey(id);
        // 先检查是否存在该数据和数据是否有效
        if(serviceItemApprise == null || serviceItemApprise.getDataFlag() == -1) {
            return -1;
        } else {
            ServiceItemApprise serviceItemAppriseExample = new ServiceItemApprise();
            serviceItemAppriseExample.setId(id);
            // 设置数据无效
            serviceItemAppriseExample.setDataFlag((byte) -1);
            return serviceItemAppriseMapper.updateByPrimaryKeySelective(serviceItemAppriseExample);
        }
    }
}
