package com.SpringMVC.RESTapi.GET.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.SpringMVC.RESTapi.Model.User;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/user")
public class GetController {
	
	@GetMapping
	public List<User> getAllUsers() {
		
		User user1 = new User(1, "Naveen", "Bengalaur");
		User user2 = new User(2, "Nitin", "Gadag");
		
		List<User> users = new ArrayList<User>();
		users.add(user1);
		users.add(user2);
		
		return users;
	}
	
	@GetMapping("/{id}")
	public String getUserById(@PathVariable("id") Integer id) {
		if(id<=0) {
			return "User ID is not Valid!";
		}
		return "User details for ID: " + id;
	}
}