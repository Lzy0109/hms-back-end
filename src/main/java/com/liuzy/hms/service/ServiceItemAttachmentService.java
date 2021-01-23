package com.liuzy.hms.service;

import com.liuzy.hms.pojo.ServiceItemAttachment;
import io.swagger.models.auth.In;

import java.util.List;

/**
 * @Author LiuZiYi
 * @Date 2021/1/23 15:03
 * @Version 1.0
 */
public interface ServiceItemAttachmentService {
    // 根据服务项目id查询附件信息
    List<ServiceItemAttachment> queryServiceItemAttachmentByItemId(Integer id);
    // 添加附件
    Integer insertServiceItemAttachmentByItemId(ServiceItemAttachment serviceItemAttachment);
    // 根据id删除附件
    Integer deleteServiceItemAttachmentById(Integer id);
    // 修改附件信息
    Integer updateServiceItemAttachment(ServiceItemAttachment serviceItemAttachment);
}
