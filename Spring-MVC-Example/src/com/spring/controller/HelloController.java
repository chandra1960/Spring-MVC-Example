package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloController {

@RequestMapping(method = RequestMethod.GET)
public String greetHello(ModelMap model) {
    model.addAttribute("greeting", "Hello User in Spring MVC");
    return "home";
}

@RequestMapping(value="/chandraHello", method = RequestMethod.GET)
public String greetHelloAgain(ModelMap model) {
    model.addAttribute("greeting", "Hello ChandraHello....User in Spring MVC");
    return "home";
}
@RequestMapping(value="/shabbir", method = RequestMethod.GET)
public String greetHelloAgain1(ModelMap model) {
    model.addAttribute("greeting", "Hello shabbir....User in Spring MVC");
    return "home";
}

}
