package com.example.DatabaseConnectionDemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DatabaseConnectionDemo.Repository.UserRepository;
import com.example.DatabaseConnectionDemo.entity.User;

@Service
public class ConnectivityService {
	
	@Autowired
	UserRepository userRepository;
	
	public User saveUser(User user) {
		
		return userRepository.save(user);
	}

	
}
