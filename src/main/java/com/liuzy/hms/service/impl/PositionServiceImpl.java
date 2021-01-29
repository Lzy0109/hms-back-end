package com.liuzy.hms.service.impl;

import com.liuzy.hms.mapper.PositionMapper;
import com.liuzy.hms.pojo.Position;
import com.liuzy.hms.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author LiuZiYi
 * @Date 2021/1/19 20:40
 * @Version 1.0
 */
@Service
public class PositionServiceImpl implements PositionService {
    @Autowired
    private PositionMapper positionMapper;

    @Override
    public Position queryPositionById(Integer id) {
        Position position = positionMapper.selectByPrimaryKey(id);
        // 检查数据是否有效
        if(position.getDataFlag() == -1) {
            return null;
        } else {
            return position;
        }
    }

    @Override
    public List<Position> queryAllPosition() {
        return positionMapper.selectAll();
    }
}
