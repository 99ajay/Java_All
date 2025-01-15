package com.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.webapp.dto.RegistrationDto;
import com.webapp.entity.Registration;
import com.webapp.service.RegistrationService;

@Controller
public class RegistrationController {
	
////	http:/localhost:8080/getMsg
//	@RequestMapping("/getMsg")
//	public String getMessage() {
//		return "hello.jsp";
//	}
//	
	//http://localhost:8080/view
	
	@Autowired
	private RegistrationService registrationService;
	@RequestMapping("/view")
	public String viewCreateRegistrationPage() {
		return "create_registration";
	}
	
//	@RequestMapping("/saveReg")
//	public String getRegistrations(@ModelAttribute Registration registration) {
//		System.out.println(registration.getFirstName());
//		System.out.println(registration.getEmail());
//		System.out.println(registration.getMobile());
//
//		return "create_registration";
//	}
	
//	@RequestMapping("/saveReg")
//	public String getRegistrations(@ModelAttribute Registration registration) {
//		registrationService.createRegistration(registration);
//		
//
//		return "create_registration";
//	}
	
	
//	@RequestMapping("/saveReg")
//	public String getRegistrations(
//			@RequestParam("firstName") String firstName,
//			@RequestParam("email") String email,
//			@RequestParam("mobile") String mobile
//			) {
//		Registration registration = new Registration();
//		registration.setFirstName(firstName);
//		registration.setEmail(email);
//		registration.setMobile(mobile);
//		
//		registrationService.createRegistration(registration);
//		
//
//		return "create_registration";
//	}
	
	
	
	@RequestMapping("/saveReg")
	public String getRegistrations(@ModelAttribute RegistrationDto registrationDto) {
		Registration registration = new Registration();
		registration.setFirstName(registrationDto.getFirstName());
		registration.setEmail(registrationDto.getEmail());
		registration.setMobile(registrationDto.getMobile());
		registrationService.createRegistration(registration);

		return "create_registration";
	}
	
	
	@RequestMapping("/listAll")
	public String getAllRegistrations() {
		return "list_Registrations";
	}
}
