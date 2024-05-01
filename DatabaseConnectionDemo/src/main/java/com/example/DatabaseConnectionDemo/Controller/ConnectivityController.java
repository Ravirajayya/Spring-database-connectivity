package com.example.DatabaseConnectionDemo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.DatabaseConnectionDemo.entity.User;
import com.example.DatabaseConnectionDemo.service.ConnectivityService;

@RestController
@RequestMapping("/user")
public class ConnectivityController {
	
	@Autowired
	ConnectivityService connectivityService;
	
	@PostMapping("/save")
	User saveUser(@RequestBody User user) {
		
		return connectivityService.saveUser(user);
	}

}
