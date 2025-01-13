package com.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegistrationController {
	
//	http:/localhost:8080/getMsg
	@RequestMapping("/getMsg")
	public String getMessage() {
		return "hello.jsp";
	}
}
