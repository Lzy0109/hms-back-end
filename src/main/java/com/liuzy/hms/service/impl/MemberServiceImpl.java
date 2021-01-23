package com.liuzy.hms.service.impl;

import com.liuzy.hms.mapper.MemberMapper;
import com.liuzy.hms.pojo.Member;
import com.liuzy.hms.pojo.Staff;
import com.liuzy.hms.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author LiuZiYi
 * @Date 2021/1/18 下午8:55
 * @Version 1.0
 */
@Service
public class MemberServiceImpl implements MemberService {
    @Autowired
    private MemberMapper memberMapper;

    @Override
    public List<Member> queryAllMember() {
        return memberMapper.selectAll();
    }

    @Override
    public Member queryMemberById(Integer id) {
        Member member = memberMapper.selectByPrimaryKey(id);
        // 检查数据是否有效
        if(member.getDataFlag() == -1) {
            return null;
        } else {
            return member;
        }
    }

    @Override
    public Integer updateMember(Member member) {
        // 先检查是否存在该数据和数据是否有效
        if(memberMapper.selectByPrimaryKey(member.getId()) == null || member.getDataFlag() == -1) {
            return -1;
        } else {
            return memberMapper.updateByPrimaryKeySelective(member);
        }
    }

    @Override
    public Integer insertMember(Member member) {
        return memberMapper.insert(member);
    }

    @Override
    public Integer deleteMemberById(Integer id) {
        Member member = memberMapper.selectByPrimaryKey(id);
        // 先检查是否存在该数据和数据是否有效
        if(member == null || member.getDataFlag() == -1) {
            return -1;
        } else {
            Member memberExample = new Member();
            memberExample.setId(id);
            // 设置数据无效
            memberExample.setDataFlag((byte) -1);
            return memberMapper.updateByPrimaryKeySelective(memberExample);
        }
    }
}
