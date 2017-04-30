package com.niit.controller;

// step 4

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping({"/","/index"})
	public String hello(){
		return "index";
	}
	@RequestMapping("/aboutus")
	public String about(){
		return "aboutus";
	}
	@RequestMapping("/contactus")
	public String contact(){
		return "contactus";
	}
	
}
