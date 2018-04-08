package com.devluff.cms.admin.dashboard;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.devluff.cms.Define;

public class AdminDashboardController {
	
	@RequestMapping(value="/admin/dashboard", method=RequestMethod.GET )
	public ModelAndView loginForm() {
		
		ModelAndView mav = new  ModelAndView();
		
		mav.setViewName(Define.PATH_ADMIN_DASHBOARD+"/adminDashboard");
		
		return mav;
	}

}
