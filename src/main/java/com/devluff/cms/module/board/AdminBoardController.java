package com.devluff.cms.module.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.devluff.cms.Define;

@Controller
public class AdminBoardController {
	
	@RequestMapping(value="/admin/board/list", method=RequestMethod.GET )
	public ModelAndView main() {
		
		ModelAndView mav = new  ModelAndView();
		
		
		mav.setViewName(Define.PATH_BOARD+"/adminBoardList");
		
		return mav;
	}

}
