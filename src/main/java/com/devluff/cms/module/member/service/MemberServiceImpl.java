package com.devluff.cms.module.member.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
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
	public Member getLoginMember(String member_id, String member_pw) {
		
		Member member = memberMapper.selectLoginMember(member_id);
		
		if(member == null) return null;
		if(member.getMember_pw().equals(member_pw) == false) return null;

		return member ;
	}

	@Override
	public Collection<GrantedAuthority> getAuthorities(String member_id) {
		
		List<String> string_authorities = memberMapper.selectMemberRole(member_id); 
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>(); 
		for (String authority : string_authorities) { 
			authorities.add(new SimpleGrantedAuthority(authority)); 
		} 
		
		return authorities;
	}

	

}
