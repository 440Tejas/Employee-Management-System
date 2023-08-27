package com.ems.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ems.Constants.UrlConstant;

@Controller
public class ErrorController {
	
	@RequestMapping(UrlConstant.error)
	public ModelAndView errorHome() {
		return new ModelAndView(UrlConstant.error);
	}
	
	@GetMapping("loginAgain")
	public ModelAndView Home() {
		return new ModelAndView("redirect:/");
	}

}
