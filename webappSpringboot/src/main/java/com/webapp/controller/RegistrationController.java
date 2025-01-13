package com.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webapp.entity.Registration;

@Controller
public class RegistrationController {
	
////	http:/localhost:8080/getMsg
//	@RequestMapping("/getMsg")
//	public String getMessage() {
//		return "hello.jsp";
//	}
//	
	//http://localhost:8080/view
	@RequestMapping("/view")
	public String viewCreateRegistrationPage() {
		return "create_registration";
	}
	
	@RequestMapping("/saveReg")
	public String getRegistrations(@ModelAttribute Registration registration) {
		System.out.println(registration.getFirstName());
		System.out.println(registration.getEmail());
		System.out.println(registration.getMobile());

		return "create_registration";
	}
}
