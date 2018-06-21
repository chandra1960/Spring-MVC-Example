package com.spring.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.model.User;

@Controller
@RequestMapping(value = "/register")
public class RegisterController {

@RequestMapping(method = RequestMethod.GET)
public String viewRegistration(Map<String, Object> model) {
    User userForm = new User();    
    model.put("userForm", userForm);
     
    List<String> professionList = new ArrayList<>();
    professionList.add("Software Developer");
    professionList.add("Software Designer");
    professionList.add("IT Manager");
    model.put("professionList", professionList);
     
    return "Registration";
}
 
@RequestMapping(method = RequestMethod.POST)
public String processRegistration(@Valid @ModelAttribute("userForm") User user,
		BindingResult result,Map<String, Object> model) {
	if (result.hasErrors()) {
		List<String> professionList = new ArrayList<>();
	    professionList.add("Software Developer");
	    professionList.add("Software Designer");
	    professionList.add("IT Manager");
	    model.put("professionList", professionList);
		return "Registration";
		
		}  
	else {
    System.out.println("username: " + user.getUsername());
    System.out.println("password: " + user.getPassword());
    System.out.println("email: " + user.getEmail());
    System.out.println("birth date: " + user.getBirthDate());
    System.out.println("profession: " + user.getProfession());
	}

    return "RegistrationSuccess";
}

}
