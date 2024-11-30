package com.SpringMVC.RESTapi.PATCH.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.SpringMVC.RESTapi.Model.User;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/user")
public class PatchController {
	
	@PatchMapping("/update/{id}")
	public String updateUsersById(@PathVariable Integer id, @RequestBody User user) {
		
		if(id <= 0) {
			return "User ID is not Valid!";
		}
		
		// Simulate updating only part of the resource
        System.out.println("Updating user with ID: " + id + " and new name: " + user.getName());
        return "User with ID " + id + " updated with name: " + user.getName();
	}
}
