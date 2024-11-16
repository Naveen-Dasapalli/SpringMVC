package com.SpringMVC.ORM.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String rootUrlHandler() {
		return "redirect:/home";
	}
	
	@RequestMapping("/home")
	public String home() {
		return "home";
	}
	
	@RequestMapping(value = "/search", method = RequestMethod.POST)
	public RedirectView search(@RequestParam("searchBox") String query) {
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("https://www.google.com/search?q="+query);
		return redirectView;
	}
}
