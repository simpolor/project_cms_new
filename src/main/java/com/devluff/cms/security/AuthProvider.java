package com.devluff.cms.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import com.devluff.cms.module.member.model.Member;
import com.devluff.cms.module.member.service.MemberService;

public class AuthProvider implements AuthenticationProvider {

	@Autowired
    MemberService memberService;

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		String id = authentication.getName();
        String password = authentication.getCredentials().toString();
        
        return authenticate(id, password);
	}
	
	 //실행 2
    public Authentication authenticate(String id, String password) throws AuthenticationException {
        Member member = memberService.getLoginMember(id, password);
        if (member == null) return null;
        
        List<GrantedAuthority> grantedAuthorityList = new ArrayList<GrantedAuthority>();
        String role = "";
        /**
         * 0 : 일반 사용자, 1 : 학생, 2 : 교수, 3 : 직원, 4 : 관리자
         **/
        /*switch (user.getU_type()) {
            case 0:
                role = "ROLE_NO";
                break;
            case 1:
                role = "ROLE_USER";
                break;
            case 2:
            case 3:
            case 4:
                role = "ROLE_ADMIN";
                break;
        }*/
        role = "ADMIN";
        grantedAuthorityList.add(new SimpleGrantedAuthority(role));
        return new MyAuthenticaion(id, password, grantedAuthorityList, member);
    }

	@Override
	public boolean supports(Class<?> authentication) {
		return authentication.equals(UsernamePasswordAuthenticationToken.class);
	}
}
