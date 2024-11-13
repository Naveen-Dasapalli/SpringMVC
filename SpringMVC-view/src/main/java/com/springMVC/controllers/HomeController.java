package com.springMVC.controllers;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/home")
public class HomeController {

	@RequestMapping(method = RequestMethod.GET)
	public String printHello(ModelMap model) {
		
		// model.addAttribute(String Key, Object Value)
		
		model.addAttribute("Message","Hello Spring MVC Framework!");
		model.addAttribute("Name","Naveen Dasapalli");
		model.addAttribute("Age", 24);
		
		List<String> courses = new ArrayList<String>();
		courses.add("Java");
		courses.add("Spring");
		courses.add("Hibernate");
		
		model.addAttribute("courses", courses);
		
		LocalDateTime now = LocalDateTime.now();
		model.addAttribute("DateTime", now);
		return "home";
	}
}
