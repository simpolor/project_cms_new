package com.devluff.cms.module.auth;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.devluff.cms.Define;

@Controller
public class AdminAccessController {
	
	@RequestMapping(value="/admin/auth/setting", method=RequestMethod.GET )
	public ModelAndView authSetting() {
		
		ModelAndView mav = new  ModelAndView();
		
		mav.setViewName(Define.PATH_AUTH+"/authSetting");
		
		return mav;
	}

}
