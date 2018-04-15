package com.devluff.cms.module.dashboard;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.devluff.cms.Define;

@Controller
public class AdminDashboardController {
	
	@RequestMapping(value="/admin/dashboard", method=RequestMethod.GET )
	public ModelAndView loginForm() {
		
		ModelAndView mav = new  ModelAndView();
		
		mav.setViewName(Define.PATH_DASHBOARD+"/adminDashboard");
		
		return mav;
	}

}
