package com.SpringMVC.RESTapi.POST.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.SpringMVC.RESTapi.Model.User;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/user")
public class PostController {
	
	@PostMapping("/add")
	public String user(@RequestBody User user) {
		System.out.println("User with id: " + user.getId());
		return "User Added Successfully." + "{"+user.getId()+"}";
	}
}
