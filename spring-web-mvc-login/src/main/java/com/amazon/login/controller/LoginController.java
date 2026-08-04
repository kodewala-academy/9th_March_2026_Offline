package com.amazon.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	// 
	@GetMapping("/viewFrom")
	public String viewLoginPage() // Request
	{
		// Service Layer --> Repository Layer
		System.out.println("LoginController.viewLoginPage():::::::::::::::::::::::::::::::::::::::::;");
		return "login-form"; // Response  --> login-form --> ViewResolver --> /WEB-INF/views/login-form.jsp
		// 
	}
	
	@GetMapping("/logout")
	public String logout()
	{
		System.out.println("LoginController.logout() ::::::::::::::::::::::::::::");
		return "logout-page";
	}
	
}
