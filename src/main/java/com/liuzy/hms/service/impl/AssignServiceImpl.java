package com.liuzy.hms.service.impl;

import com.liuzy.hms.mapper.AssignMapper;
import com.liuzy.hms.pojo.Assign;
import com.liuzy.hms.service.AssignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author LiuZiYi
 * @Date 2021/1/23 14:09
 * @Version 1.0
 */
@Service
public class AssignServiceImpl implements AssignService {
    @Autowired
    private AssignMapper assignMapper;

    @Override
    public Integer insertAssign(Assign assign) {
        return assignMapper.insert(assign);
    }

    @Override
    public Integer deleteAssignById(Integer id) {
        Assign assign = assignMapper.selectByPrimaryKey(id);
        // 先检查是否存在该数据和数据是否有效
        if(assign == null || assign.getDataFlag() == -1) {
            return -1;
        } else {
            Assign assignExample = new Assign();
            assignExample.setId(id);
            assignExample.setDataFlag((byte) -1);
            return assignMapper.updateByPrimaryKeySelective(assignExample);
        }
    }

    @Override
    public Integer updateAssign(Assign assign) {
        // 先检查是否存在该数据和数据是否有效
        if(assignMapper.selectByPrimaryKey(assign.getId()) == null || assign.getDataFlag() == -1) {
            return -1;
        } else {
            return assignMapper.updateByPrimaryKeySelective(assign);
        }
    }

    @Override
    public List<Assign> queryAllAssign() {
        return assignMapper.selectAll();
    }

    @Override
    public Assign queryAssignById(Integer id) {
        Assign assign = assignMapper.selectByPrimaryKey(id);
        // 先检查是否存在该数据和数据是否有效
        if(assign.getDataFlag() == -1) {
            return null;
        } else {
            return assign;
        }
    }
}
