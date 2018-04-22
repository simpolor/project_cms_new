package com.devluff.cms.security;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import com.devluff.cms.module.member.model.Member;

public class AuthorizationService {
	
	public static Member getCurrentMember() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication instanceof MyAuthenticaion)
            return ((MyAuthenticaion) authentication).getMember();
        return null;
    }

    public static void setCurrentMember(Member member) {
        ((MyAuthenticaion)
                SecurityContextHolder.getContext().getAuthentication()).setMember(member);
    }
}
