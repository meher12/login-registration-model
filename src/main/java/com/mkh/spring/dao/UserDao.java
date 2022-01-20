package com.mkh.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mkh.spring.model.User;

@Repository
public interface UserDao extends JpaRepository<User, Long>{
	
	User findByEmail(String email);

}
