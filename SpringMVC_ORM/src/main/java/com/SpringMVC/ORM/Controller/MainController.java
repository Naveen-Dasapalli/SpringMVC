package com.SpringMVC.ORM.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.SpringMVC.ORM.Model.User;
import com.SpringMVC.ORM.Service.UserService;

@Controller
public class MainController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public String showUser() {
		return "user";
	}
	
	@RequestMapping(value = "/processUserForm", method = RequestMethod.POST)
	public String handleUserForm(@ModelAttribute User user) {
		this.userService.CreateUser(user);
		return "SuccessCreateUser";
	}

}
