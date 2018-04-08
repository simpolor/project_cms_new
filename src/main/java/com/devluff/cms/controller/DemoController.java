package com.devluff.cms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.devluff.cms.Define;
import com.devluff.cms.mapper.DemoMapper;
import com.devluff.cms.model.Demo;

@Controller
public class DemoController {

	@Autowired
	DemoMapper demoMapper;
	
	@RequestMapping("/demo")
	public String demo() {
		
		System.out.println("DEVLUFF : "+Define.DEVLUFF);
		
		System.out.println("demo count : "+demoMapper.selectDemoCount());
		
		System.out.println("demo find all count : "+demoMapper.findAllCount());
		
		Demo demo = demoMapper.selectDemo(1);
		if(demo != null) {
			System.out.println("seq : "+demo.getSeq());
			System.out.println("name : "+demo.getName());
			System.out.println("age : "+demo.getAge());
			System.out.println("hobby : "+demo.getHobby());
		}
		
		return "demo";
	}
	
	@RequestMapping("/demo/{seq}")
	public ModelAndView demo(@PathVariable int seq) {
		
		ModelAndView mav = new ModelAndView();
		
		Demo demo = demoMapper.selectDemo(seq);
		if(demo != null) {
			System.out.println("seq : "+demo.getSeq());
			System.out.println("name : "+demo.getName());
			System.out.println("age : "+demo.getAge());
			System.out.println("hobby : "+demo.getHobby());
			mav.addObject("demo", demo);
		}
		
		mav.setViewName("demo");
		
		return mav;
	}
}
