package com.devluff.cms.admin.login;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.devluff.cms.Define;

public class AdminLoginController {
	
	@RequestMapping(value="/admin/login", method=RequestMethod.GET )
	public ModelAndView loginForm() {
		
		ModelAndView mav = new  ModelAndView();
		
		mav.setViewName(Define.PATH_ADMIN_LOGIN+"/loginForm");
		
		return mav;
	}
	
	@RequestMapping(value="/admin/login", method=RequestMethod.POST )
	public ModelAndView login() {
		
		ModelAndView mav = new  ModelAndView();
		
		mav.setViewName("redirect:/admin/login");
		
		return mav;
	}
	
	@RequestMapping(value="/admin/login/setting", method=RequestMethod.GET )
	public ModelAndView loginSettingForm() {
		
		ModelAndView mav = new  ModelAndView();
		
		mav.setViewName(Define.PATH_ADMIN_LOGIN+"/loginSettingForm");
		
		return mav;
	}
	
	@RequestMapping(value="/admin/login/setting", method=RequestMethod.POST )
	public ModelAndView loginSetting() {
		
		ModelAndView mav = new  ModelAndView();
		
		mav.setViewName("redirect:/admin/login/setting");
		
		return mav;
	}

}
