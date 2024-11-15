package Controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import models.User;

@Controller
public class MainController {
	
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public String showForm() {
		return "user";
	}
	
//	// servelet technique // old way
//	@RequestMapping(path = "/processForm", method = RequestMethod.POST)
//	public String handleForm(HttpServletRequest request) {
//		
//		String name = request.getParameter("name");
//		String email = request.getParameter("email");
//		String password = request.getParameter("password");
//		
//		System.out.println("Name: "+ name +", Email: "+email+", Password:"+password);
//		return "";
//	}
	
//	 // spring MVC provides better way
//	@RequestMapping(path = "/processForm", method = RequestMethod.POST)
//	public String handleForm(
//			@RequestParam(value="name", required = false) String name,
//			@RequestParam("email") String email,
//			@RequestParam("password") String password,
//			ModelMap model
//			) {
//		
////		model.addAttribute("name", name);
////		model.addAttribute("email", email);
////		model.addAttribute("password", password);
//		
//		User user = new User();
//		
//		user.setName(name);
//		user.setEmail(email);
//		user.setPassword(password);
//		
//		model.addAttribute("user", user);
//		
//		//System.out.println("Name: "+ name +", Email: "+email+", Password:"+password);
//		return "success";
//	}
	
	// spring MVC provides most optimized way as well
	@RequestMapping(path = "/processForm", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, ModelMap model) {
		return "success";
	}

}
