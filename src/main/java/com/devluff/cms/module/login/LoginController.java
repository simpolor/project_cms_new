package com.devluff.cms.module.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.devluff.cms.Define;

@Controller
public class LoginController {
	
	@RequestMapping(value="/login", method=RequestMethod.GET )
	public ModelAndView loginForm() {
		
		ModelAndView mav = new  ModelAndView();
		
		mav.setViewName(Define.PATH_LOGIN+"/loginForm");
		
		return mav;
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST )
	public ModelAndView login() {
		
		ModelAndView mav = new  ModelAndView();
		
		mav.setViewName("redirect:/login");
		
		return mav;
	}

}
