package com.devluff.cms.module.member.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.devluff.cms.module.member.model.Member;

@Mapper
public interface MemberMapper {

	int selectMemberTotalCount();
	
	List<Member> selectMemberList();
	
	Member selectLoginMember(String member_id);
	
	List<String> selectMemberRole(String member_id);
}
