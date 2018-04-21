package com.devluff.cms.module.member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devluff.cms.module.member.dao.MemberMapper;
import com.devluff.cms.module.member.model.Member;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberMapper memberMapper;
	
	@Override
	public int getMemberTotalCount() {
		return memberMapper.selectMemberTotalCount();
	}
	
	@Override
	public List<Member> getMemberList() {
		return memberMapper.selectMemberList();
	}

	@Override
	public Member getLoginMember(Member member) {
		return memberMapper.selectLoginMember(member);
	}

	

}
