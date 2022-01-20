package com.mkh.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mkh.spring.dto.UserRegistrationDto;
import com.mkh.spring.service.UserService;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {
	
	@Autowired
	private UserService userService;
	

	public UserRegistrationController(UserService userService) {
		super();
		this.userService = userService;
	}
//	
//	@ModelAttribute("user")
//	public UserRegistrationDto userRegistrationDto() {
//		return new UserRegistrationDto();
//	}

	@GetMapping
	public String registrationPage(UserRegistrationDto userRegistrationDto, Model model) {
		
		 
		model.addAttribute("user", userRegistrationDto);
		return "registration";
	}
	
	@PostMapping
	public String registerUserAccount(@ModelAttribute("user") UserRegistrationDto registrationDto) {
		this.userService.save(registrationDto);
		return "redirect:/registration?success";
	}
	
	

}
