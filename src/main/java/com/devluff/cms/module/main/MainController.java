package com.devluff.cms.module.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.devluff.cms.Define;

@Controller
public class MainController {
	
	@RequestMapping(value="/main", method=RequestMethod.GET )
	public ModelAndView main() {
		
		ModelAndView mav = new  ModelAndView();
		
		
		mav.setViewName(Define.PATH_MAIN+"/main");
		
		return mav;
	}

}
