package com.devluff.cms.module.menu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.devluff.cms.Define;

@Controller
public class AdminMenuController {
	
	@RequestMapping(value="/admin/menu/setting", method=RequestMethod.GET )
	public ModelAndView adminMenuSettingForm() {
		
		ModelAndView mav = new  ModelAndView();
		
		mav.setViewName(Define.PATH_MENU+"/adminMenuSetting");
		
		return mav;
	}
	
	@RequestMapping(value="/admin/menu/setting", method=RequestMethod.POST )
	public ModelAndView adminMenuSetting() {
		
		ModelAndView mav = new  ModelAndView();
		
		mav.setViewName("redirect:/admin/menu/setting");
		
		return mav;
	}

}
