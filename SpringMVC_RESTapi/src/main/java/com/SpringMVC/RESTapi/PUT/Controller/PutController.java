package com.SpringMVC.RESTapi.PUT.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.SpringMVC.RESTapi.Model.User;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/user")
public class PutController {
	
	@PutMapping("/update")
	public String updateUsers(@RequestBody User user) {
		
		// Simulate updating the resource
        System.out.println("Updating user with ID: " + user.getId());
        return "User with ID " + user.getId() + " updated successfully!";
	}
}
