package com.devluff.cms.module.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.devluff.cms.Define;

@Controller
public class AdminMemberController {
	
	@RequestMapping(value="/admin/member/list", method=RequestMethod.GET )
	public ModelAndView adminMemberList() {
		
		ModelAndView mav = new  ModelAndView();
		
		
		mav.setViewName(Define.PATH_MEMBER+"/adminMemberList");
		
		return mav;
	}

}
