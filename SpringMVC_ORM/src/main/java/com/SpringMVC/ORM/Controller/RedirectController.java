package com.SpringMVC.ORM.Controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.SpringMVC.ORM.Model.User;

@Controller
public class RedirectController {
	
	@RequestMapping(value = "/addUser", method = RequestMethod.GET)
	public String showUserForm() {
		return "user";
	}
	
	// Old traditional way used by servlet
	@RequestMapping(value = "/processAddUser", method = RequestMethod.POST)
	public ModelAndView handleUserForm(HttpServletRequest request ,HttpServletResponse response) {
		if(request.getParameter("name") == "") {
			try {
				response.sendRedirect("addUser");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		User user = new User();
		user.setName(name);
		user.setEmail(email);
		user.setPassword(password);
		
		ModelAndView model = new ModelAndView();
		model.setViewName("SuccessCreateUser");
		model.addObject("user", user);
		
		return model;
	}
	
	// Method-1 redirect prefix
//	@RequestMapping(value = "/processAddUser", method = RequestMethod.POST)
//	public String handleUserForm(@ModelAttribute User user) {	
//		return "redirect:/successPage";
//	}
	
	// Method-2 redirect View
//	@RequestMapping(value = "/processAddUser", method = RequestMethod.POST)
//	public RedirectView handleUserForm(@ModelAttribute User user) {	
//		RedirectView rv = new RedirectView();
//		rv.setUrl("successPage");
//		System.out.println("Method-2");
//		return rv;
//	}
//	
//	@RequestMapping(value = "/successPage", method = RequestMethod.GET)
//	public String showSuccessPage() {
//		return "SuccessCreateUser";
//	}
	

}
