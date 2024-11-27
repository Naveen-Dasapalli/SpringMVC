package com.SpringMVC.RestController.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringMVC.RestController.Model.Person;

@RestController // Shortcut for @Controller + @ResponseBody
@RequestMapping("/person")
public class PersonController {
	
	// The methods return plain text directly to the HTTP response.
	@GetMapping("/greet")
	public String greet() {
		
		return "Hello person.....!"; // will return a plain string "User"
	}
	
	// The methods return JSON directly to the HTTP response.
	@GetMapping("/data")
	public Person getPerson() {
		return new Person("Bob", 35, "xxx-xxxxxxxxxx");
	}

}
