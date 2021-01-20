package com.liuzy.hms.service.impl;

import com.liuzy.hms.mapper.NationMapper;
import com.liuzy.hms.pojo.Nation;
import com.liuzy.hms.service.NationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author LiuZiYi
 * @Date 2021/1/19 10:06
 * @Version 1.0
 */
@Service
public class NationServiceImpl implements NationService {
    @Autowired
    private NationMapper nationMapper;

    @Override
    public List<Nation> queryAllNation() {
        return nationMapper.selectAll();
    }

    @Override
    public Nation queryNationById(Integer id) {
        return nationMapper.selectByPrimaryKey(id);
    }
}
