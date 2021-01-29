package com.liuzy.hms.util;

import com.github.pagehelper.PageInfo;
import com.liuzy.hms.common.PageRequest;
import com.liuzy.hms.common.PageResult;
import com.liuzy.hms.mapper.StaffMapper;
import com.liuzy.hms.pojo.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author LiuZiYi
 * @Date 2021/1/29 16:27
 * @Version 1.0
 */
@Component
public class PageUtil {
    @Autowired
    private StaffMapper staffMapper;

    /**
     * @param staffExample select模板
     * @param pageRequest 分页参数
     * @param T List数据
     * @return
     */
    public PageResult toStaffPageResult(Staff staffExample, PageRequest pageRequest, List<?> T){
        PageResult pageResult = new PageResult();
        pageResult.setPageNum(pageRequest.getPageNum());
        pageResult.setPageSize(pageRequest.getPageSize());
        pageResult.setTotalSize((long) staffMapper.selectCount(staffExample));
        pageResult.setItems(T);
        return pageResult;
    }
}
