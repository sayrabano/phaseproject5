package com.admin_login_form.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.admin_login_form.helper.MessageHelper;
import com.admin_login_form.service.LoginService;

@Controller
public class MainController {
	
	

	//Dependency Injection------------>
	@Autowired 
	LoginService service;
	

	//Home handler--------------->
		@RequestMapping("/")
		public String home(Model model) {
			
			return "index";
		}
		
		

		//Admin Login handler--------------->
		@RequestMapping("/login")
		public String administrationLogin(Model model ) {
			
			return "login";
		}
		

		
		@PostMapping("/welcome")
		public String dashboard(ModelMap model,@RequestParam String email,@RequestParam String password,HttpSession s,@ModelAttribute("LoginService") LoginService loginservice) {
		 
		 
			
		
			
			
			boolean isvalidAdmin = service.validateAdmin(email, password);
		
			
			if(!isvalidAdmin) {
			
				s.setAttribute("message", new MessageHelper("Oops Invalid Credential !","error"));
			return "login";
			}
			else {
				model.put("email",email);
			
				model.put("password",password);
				
				
				System.out.println("Admin password : "+ password);
				System.out.println("Admin Email Address : " +email);
				
				model.put("email","admin@gmail.com");
				return "welcome";
			}
			
		
		}
}
