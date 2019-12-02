package com.ssi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

	@RequestMapping("verify")
	public String userAuthentication() {
		//read id/pwd, auth
		System.out.println("Authentication Performed");
		return "success.jsp";
	}
	
	@RequestMapping("login")
	public String showLoginForm() {
		return "loginpage.jsp";
	}
	
	@RequestMapping("/home")
	public void doSomething() {
		System.out.println("Doing Something To Process Request");
	}
	
}
