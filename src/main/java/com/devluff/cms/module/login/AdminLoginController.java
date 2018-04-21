package com.devluff.cms.module.login;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.devluff.cms.Define;
import com.devluff.cms.module.member.model.Member;
import com.devluff.cms.module.member.service.MemberService;

@Controller
public class AdminLoginController {
	
	@Autowired
	MemberService memberService;
	
	@RequestMapping(value="/admin/login", method=RequestMethod.GET )
	public ModelAndView loginForm(HttpSession session, Member member) {
		
		ModelAndView mav = new  ModelAndView();

		mav.setViewName(Define.PATH_LOGIN+"/adminLoginForm");
		
		return mav;
	}
	
	@RequestMapping(value="/admin/login", method=RequestMethod.POST )
	public ModelAndView login(Member member) {
		
		
		Member loginMember = memberService.getLoginMember(member);
		if(loginMember != null) {
			System.out.println("member.getMember_id : "+loginMember.getMember_id());
			System.out.println("member.getMember_name : "+loginMember.getMember_name());
			System.out.println("member.getMember_nickname : "+loginMember.getMember_nickname());
			System.out.println("member.getMember_email: "+loginMember.getMember_email());
		}
		
		ModelAndView mav = new  ModelAndView();
		
		mav.setViewName("redirect:/admin/login");
		
		return mav;
	}
	
	@RequestMapping(value="/admin/login/setting", method=RequestMethod.GET )
	public ModelAndView loginSettingForm() {
		
		ModelAndView mav = new  ModelAndView();
		
		mav.setViewName(Define.PATH_LOGIN+"/loginSettingForm");
		
		return mav;
	}
	
	@RequestMapping(value="/admin/login/setting", method=RequestMethod.POST )
	public ModelAndView loginSetting() {
		
		ModelAndView mav = new  ModelAndView();
		
		mav.setViewName("redirect:/admin/login/setting");
		
		return mav;
	}

}
