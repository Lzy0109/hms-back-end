package com.liuzy.hms.service.impl;

import com.liuzy.hms.mapper.ServiceItemScoreMapper;
import com.liuzy.hms.pojo.ServiceItemScore;
import com.liuzy.hms.pojo.Staff;
import com.liuzy.hms.service.ServiceItemScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author LiuZiYi
 * @Date 2021/1/23 14:41
 * @Version 1.0
 */
@Service
public class ServiceItemScoreServiceImpl implements ServiceItemScoreService {
    @Autowired
    private ServiceItemScoreMapper serviceItemScoreMapper;
    @Override
    public List<ServiceItemScore> queryAllServiceItemScore() {
        return serviceItemScoreMapper.selectAll();
    }

    @Override
    public ServiceItemScore queryServiceItemScoreById(Integer id) {
        ServiceItemScore serviceItemScore = serviceItemScoreMapper.selectByPrimaryKey(id);
        // 检查数据是否有效
        if(serviceItemScore.getDataFlag() == -1) {
            return null;
        } else {
            return serviceItemScore;
        }
    }

    @Override
    public Integer insertServiceItemScore(ServiceItemScore serviceItemScore) {
        return serviceItemScoreMapper.insert(serviceItemScore);
    }

    @Override
    public Integer updateServiceItemScore(ServiceItemScore serviceItemScore) {
        // 先检查是否存在该数据和数据是否有效
        if(serviceItemScoreMapper.selectByPrimaryKey(serviceItemScore.getId()) == null ||
                serviceItemScore.getDataFlag() == -1) {
            return -1;
        } else {
            return serviceItemScoreMapper.updateByPrimaryKeySelective(serviceItemScore);
        }
    }

    @Override
    public Integer deleteServiceItemScoreById(Integer id) {
        ServiceItemScore serviceItemScore = serviceItemScoreMapper.selectByPrimaryKey(id);
        // 先检查是否存在该数据和数据是否有效
        if(serviceItemScore == null || serviceItemScore.getDataFlag() == -1) {
            return -1;
        } else {
            ServiceItemScore serviceItemScoreExample = new ServiceItemScore();
            serviceItemScoreExample.setId(id);
            // 设置数据无效
            serviceItemScoreExample.setDataFlag((byte) -1);
            return serviceItemScoreMapper.updateByPrimaryKeySelective(serviceItemScoreExample);
        }
    }
}
