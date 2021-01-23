package com.liuzy.hms.service.impl;

import com.liuzy.hms.mapper.ServiceItemMapper;
import com.liuzy.hms.pojo.ServiceItem;
import com.liuzy.hms.pojo.Staff;
import com.liuzy.hms.service.ServiceItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author LiuZiYi
 * @Date 2021/1/23 14:25
 * @Version 1.0
 */
@Service
public class ServiceItemServiceImpl implements ServiceItemService {
    @Autowired
    private ServiceItemMapper serviceItemMapper;

    @Override
    public List<ServiceItem> queryAllServiceItem() {
        return serviceItemMapper.selectAll();
    }

    @Override
    public ServiceItem queryServiceItemById(Integer id) {
        ServiceItem serviceItem = serviceItemMapper.selectByPrimaryKey(id);
        // 检查数据是否有效
        if(serviceItem.getDataFlag() == -1) {
            return null;
        } else {
            return serviceItem;
        }
    }

    @Override
    public Integer updateServiceItem(ServiceItem serviceItem) {
        // 先检查是否存在该数据和数据是否有效
        if(serviceItemMapper.selectByPrimaryKey(serviceItem.getId()) == null || serviceItem.getDataFlag() == -1) {
            return -1;
        } else {
            return serviceItemMapper.updateByPrimaryKeySelective(serviceItem);
        }
    }

    @Override
    public Integer deleteServiceItemById(Integer id) {
        ServiceItem serviceItem = serviceItemMapper.selectByPrimaryKey(id);
        // 先检查是否存在该数据和数据是否有效
        if(serviceItem == null || serviceItem.getDataFlag() == -1) {
            return -1;
        } else {
            ServiceItem serviceItemExample = new ServiceItem();
            serviceItemExample.setId(id);
            // 设置数据无效
            serviceItemExample.setDataFlag((byte) -1);
            return serviceItemMapper.updateByPrimaryKeySelective(serviceItemExample);
        }
    }
}
