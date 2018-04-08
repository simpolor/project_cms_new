package com.devluff.cms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {

	@RequestMapping({"/", "/index"})
	@ResponseBody
	public String home() {
		return "index";
	}
}
