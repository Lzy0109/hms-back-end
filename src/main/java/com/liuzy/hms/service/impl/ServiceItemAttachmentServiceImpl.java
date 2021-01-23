package com.liuzy.hms.service.impl;

import com.liuzy.hms.mapper.ServiceItemAttachmentMapper;
import com.liuzy.hms.pojo.ServiceItemAttachment;
import com.liuzy.hms.pojo.Staff;
import com.liuzy.hms.service.ServiceItemAttachmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @Author LiuZiYi
 * @Date 2021/1/23 15:07
 * @Version 1.0
 */
@Service
public class ServiceItemAttachmentServiceImpl implements ServiceItemAttachmentService {
    @Autowired
    private ServiceItemAttachmentMapper serviceItemAttachmentMapper;
    @Override
    public List<ServiceItemAttachment> queryServiceItemAttachmentByItemId(Integer id) {
       ServiceItemAttachment serviceItemAttachment = new ServiceItemAttachment();
       serviceItemAttachment.setItemId(id);
       return serviceItemAttachmentMapper.select(serviceItemAttachment);
    }

    @Override
    public Integer insertServiceItemAttachmentByItemId(ServiceItemAttachment serviceItemAttachment) {
        return serviceItemAttachmentMapper.insert(serviceItemAttachment);
    }

    @Override
    public Integer deleteServiceItemAttachmentById(Integer id) {
        ServiceItemAttachment serviceItemAttachment = serviceItemAttachmentMapper.selectByPrimaryKey(id);
        // 先检查是否存在该数据和数据是否有效
        if(serviceItemAttachment == null || serviceItemAttachment.getDataFlag() == -1) {
            return -1;
        } else {
            ServiceItemAttachment serviceItemAttachmentExample = new ServiceItemAttachment();
            serviceItemAttachmentExample.setId(id);
            // 设置数据无效
            serviceItemAttachmentExample.setDataFlag((byte) -1);
            return serviceItemAttachmentMapper.updateByPrimaryKeySelective(serviceItemAttachmentExample);
        }
    }

    @Override
    public Integer updateServiceItemAttachment(ServiceItemAttachment serviceItemAttachment) {
        // 先检查是否存在该数据和数据是否有效
        if(serviceItemAttachmentMapper.selectByPrimaryKey(serviceItemAttachment.getId()) == null ||
                serviceItemAttachment.getDataFlag() == -1) {
            return -1;
        } else {
            return serviceItemAttachmentMapper.updateByPrimaryKeySelective(serviceItemAttachment);
        }
    }
}
