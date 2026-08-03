package com.amazon.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	// 
	@GetMapping("/viewFrom")
	public String viewLoginPage()
	{
		System.out.println("LoginController.viewLoginPage():::::::::::::::::::::::::::::::::::::::::;");
		return "login-form";
	}
	
	@GetMapping("/logout")
	public String logout()
	{
		System.out.println("LoginController.logout() ::::::::::::::::::::::::::::");
		return "logout-page";
	}
	
}
