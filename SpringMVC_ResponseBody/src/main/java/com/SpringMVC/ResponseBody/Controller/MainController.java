package com.SpringMVC.ResponseBody.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.SpringMVC.ResponseBody.Model.User;

@Controller
public class MainController {
	
		// The methods return plain text directly to the HTTP response.
		@RequestMapping("/")
		@ResponseBody
		public String home() {
			
			return "Hello User.....!"; // will return a plain string "User"
		}
		
		// The methods return JSON directly to the HTTP response.
		@RequestMapping(value="/user")
		@ResponseBody
		public User user() {
			return new User("Naveen", 24, "Gadag");
		}
		
		
}
