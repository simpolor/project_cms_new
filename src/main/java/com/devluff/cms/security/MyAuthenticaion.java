package com.devluff.cms.security;

import java.util.List;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

import com.devluff.cms.module.member.model.Member;

public class MyAuthenticaion extends UsernamePasswordAuthenticationToken {
   
	private  static final long serialVersionUID = 1L;

    Member member;

    public MyAuthenticaion (String id, String password, List<GrantedAuthority> grantedAuthorityList, Member member) {
        super(id, password, grantedAuthorityList);
        this.member = member;
    }

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}
}
