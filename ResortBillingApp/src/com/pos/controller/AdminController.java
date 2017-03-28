package com.pos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminController {	
	
	@RequestMapping(value="login")
	public ModelAndView loginPage(){
		return new ModelAndView("loginPage");
	}
	
	@RequestMapping(value="/index")
	public ModelAndView index()
	{
		return new ModelAndView("home");
	}
	
	
}


