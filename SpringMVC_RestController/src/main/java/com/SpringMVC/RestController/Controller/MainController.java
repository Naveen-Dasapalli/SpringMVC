package com.SpringMVC.RestController.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping("/")
	private String redirectView() {
		return "redirect:/person/greet";
	}
}
