package com.devluff.cms.module.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.devluff.cms.Define;
import com.devluff.cms.module.member.service.MemberService;

@Controller
public class AdminMemberController {
	
	@Autowired
	MemberService memberService;
	
	@RequestMapping(value="/admin/member/list", method=RequestMethod.GET )
	public ModelAndView adminMemberList() {
		
		ModelAndView mav = new  ModelAndView();
		
		System.out.println("memberService.getMemberTotalCount "+memberService.getMemberTotalCount());
		System.out.println("memberService.getMemberList "+memberService.getMemberList());
		
		mav.addObject("memberTotalCount", memberService.getMemberTotalCount());
		mav.addObject("memberList", memberService.getMemberList());
		
		mav.setViewName(Define.PATH_MEMBER+"/adminMemberList");
		
		return mav;
	}

}
