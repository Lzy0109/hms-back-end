package com.liuzy.hms.service.impl;

import com.liuzy.hms.mapper.AssignStatusMapper;
import com.liuzy.hms.pojo.AssignStatus;
import com.liuzy.hms.service.AssginStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author LiuZiYi
 * @Date 2021/1/20 15:36
 * @Version 1.0
 */
@Service
public class AssginStatusServiceImpl implements AssginStatusService {
    @Autowired
    private AssignStatusMapper assignStatusMapper;
    @Override
    public List<AssignStatus> queryAllAssignStatus() {
        return assignStatusMapper.selectAll();
    }

    @Override
    public AssignStatus queryAssignStatusById(Integer id) {
        AssignStatus assignStatus = assignStatusMapper.selectByPrimaryKey(id);
        // 检查数据是否有效
        if(assignStatus.getDataFlag() == -1) {
            return null;
        } else {
            return assignStatus;
        }
    }
}
