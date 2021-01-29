package com.liuzy.hms.util;

import com.liuzy.hms.mapper.StaffMapper;
import com.liuzy.hms.pojo.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * @Author LiuZiYi
 * @Date 2021/1/26 10:11
 * @Version 1.0
 */
@Component
public class JobNumberGenerator {
    @Autowired
    private StaffMapper staffMapper;

    /**
     * 生成规则：年份 + 四位随机数 + staff总数
     * @return
     */
    public String generator() {
        Calendar date = Calendar.getInstance();
        String year = String.valueOf(date.get(Calendar.YEAR));
        System.out.println(year);
        String random = String.valueOf((int)((Math.random()*9+1)*1000));
        System.out.println(random);
        int count = staffMapper.selectCount(null) + 1;
        String countStr = null;
        if(count < 9) {
            countStr = "00" + String.valueOf(count);
        } else if (count < 99) {
            countStr = "0" + String.valueOf(count);
        }
        System.out.println(countStr);
        return year + random + countStr;
    }
}
