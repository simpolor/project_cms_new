package com.devluff.cms.module.member.service;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;

import com.devluff.cms.module.member.model.Member;

public interface MemberService {
	
	public int getMemberTotalCount();
	
	public List<Member> getMemberList();
	
	public Member getLoginMember(Member member);
	
	public Collection<GrantedAuthority> getAuthorities(String member_id);

}
