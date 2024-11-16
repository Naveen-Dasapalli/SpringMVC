package com.SpringMVC.Search.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class MainController {

	@RequestMapping("/")
	public String defaultHandler() {
		return "redirect:/home";
	}
	
	@RequestMapping("/home")
	public String homeHandler() {
		return "home";
	}
	
	@RequestMapping(value="/search", method = RequestMethod.POST)
	public RedirectView searchHandler(@RequestParam("searchQuery") String query) {
		RedirectView rediredtView = new RedirectView();
		if(query.isEmpty()) {
			rediredtView.setUrl("home");
		}
		else {
			rediredtView.setUrl("https://www.google.com/search?q="+query);
		}
		return rediredtView;
	}
}
