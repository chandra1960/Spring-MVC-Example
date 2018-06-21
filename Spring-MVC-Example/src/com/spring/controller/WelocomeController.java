package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class WelocomeController {
	@RequestMapping(value="/chandraWelcome", method = RequestMethod.GET)
	public String greetHelloAgain1(ModelMap model) {
	    model.addAttribute("greeting", "Hello chandraWelcome....User in Spring MVC");
	    return "home";
	}

}
