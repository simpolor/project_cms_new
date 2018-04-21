package com.devluff.cms.module.member.service;

import java.util.List;

import com.devluff.cms.module.member.model.Member;

public interface MemberService {
	
	public int getMemberTotalCount();
	
	public List<Member> getMemberList();
	
	public Member getLoginMember(Member member);

}
