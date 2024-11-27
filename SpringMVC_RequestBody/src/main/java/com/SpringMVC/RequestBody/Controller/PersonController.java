package com.SpringMVC.RequestBody.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringMVC.RequestBody.Model.Person;

@RestController // Shortcut for @Controller + @ResponseBody
@RequestMapping("/person")
public class PersonController {
	
	// The methods return JSON directly to the HTTP response.
	@PostMapping("/addPerson")
	public String addPerson(@RequestBody Person person) {
		// The `person` object is automatically populated from the request body
		return "Person added: "+ person.getName();
	}

}
