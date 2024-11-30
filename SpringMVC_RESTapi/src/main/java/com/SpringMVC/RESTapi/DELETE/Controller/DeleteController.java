package com.SpringMVC.RESTapi.DELETE.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.SpringMVC.RESTapi.Model.User;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/user")
public class DeleteController {
	
	@DeleteMapping("/delete/{id}")
	public String getUserById(@PathVariable("id") Integer id) {
		if(id<=0) {
			return "User ID is not Valid!";
		}
		return "User details for ID: " + id + " deleted Successfully.......!";
	}
}
