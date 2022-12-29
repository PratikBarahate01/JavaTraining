package com.user.userMicroservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.user.userMicroservice.model.User;
import com.user.userMicroservice.service.UserService;

@RestController
@RequestMapping("/api/user/")
public class UserController {

	@Autowired
	UserService userService;
	
	@PostMapping("/register")
	public User createUser(@RequestBody User user) {
		return userService.saveUser(user);
	}
	
	@GetMapping("/getUser")
	public List<User> getAllUser() {
		return userService.getAllUser();
	}
	
	@GetMapping("/getUser/work/{workDetails}")
	public List<User> getUserBasedOnWork(@PathVariable String workDetails) {
		return userService.getUserBasedOnWork(workDetails);
	}
	
	@PutMapping("/update")
	public User updateUser(@RequestBody User user) {
		return userService.updateUser(user);
	}
	
	
	
	
	
}
