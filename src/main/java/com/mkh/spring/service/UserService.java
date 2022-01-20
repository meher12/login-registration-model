package com.mkh.spring.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.mkh.spring.dto.UserRegistrationDto;
import com.mkh.spring.model.User;

public interface UserService extends UserDetailsService{
	
	User save(UserRegistrationDto registrationDto);
 
}
