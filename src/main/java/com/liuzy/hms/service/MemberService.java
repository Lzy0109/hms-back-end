package com.liuzy.hms.service;

import com.liuzy.hms.mapper.MemberMapper;
import com.liuzy.hms.pojo.Member;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author LiuZiYi
 * @Date 2021/1/18 下午8:54
 * @Version 1.0
 */
public interface MemberService {
    // 查询所有会员信息
    List<Member> queryAllMember();
    // 根据id查询会员信息
    Member queryMemberById(Integer id);
    // 修改会员信息
    Integer updateMember(Member member);
    // 添加会员信息
    Integer insertMember(Member member);
    // 删除会员信息
    Integer deleteMemberById(Integer id);

}
