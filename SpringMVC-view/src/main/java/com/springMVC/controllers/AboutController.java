package com.springMVC.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

@Controller
public class AboutController {
	
	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public ModelAndView about() {
		ModelAndView model = new ModelAndView("about");
		model.addObject("Message", "This is about page........!");
		model.addObject("Name","Nitin Dasapalli");
		model.addObject("Age", 24);
		
		List<String> courses = new ArrayList<String>();
		courses.add("Java");
		courses.add("Spring");
		courses.add("Hibernate");
		
		model.addObject("courses", courses);
		return model;
	}
	
}
