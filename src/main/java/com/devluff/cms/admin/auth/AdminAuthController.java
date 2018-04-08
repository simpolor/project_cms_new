package com.devluff.cms.admin.auth;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.devluff.cms.Define;

public class AdminAuthController {
	
	@RequestMapping(value="/admin/auth/setting", method=RequestMethod.GET )
	public ModelAndView authSetting() {
		
		ModelAndView mav = new  ModelAndView();
		
		mav.setViewName(Define.PATH_ADMIN_AUTH+"/authSetting");
		
		return mav;
	}

}
