package com.user.userMicroservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.userMicroservice.model.User;
import com.user.userMicroservice.repository.UserRepository;
import com.user.userMicroservice.util.UserGlobalException;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	@Autowired
	UserGlobalException userGlobalException;
	
	public User saveUser(User user) {
		return userRepository.save(user);
	}
	
	public List<User> getAllUser() {
		return userRepository.findAll();
	}
	
	public List<User> getUserBasedOnWork(String work) {
		return userRepository.findAllUserByWork(work);
		//return null;
	}

	public User updateUser(User user) {
		User newuser = new User();
		
		Optional<User> updateUser = userRepository.findById(user.getId());
		if(updateUser.isPresent()) {
			newuser.setName(user.getName());
			newuser.setEmail(user.getEmail());
			newuser.setLocation(user.getLocation());
			newuser.setCharges(user.getCharges());
			newuser.setPanCard(user.getPanCard());
			newuser.setPhoneNumber(user.getPhoneNumber());
			newuser.setWorkDetails(user.getWorkDetails());
			newuser.setWorkingDays(user.getWorkingDays());
			userRepository.save(newuser);
		}
		else {
			return null;
		}
		return user;
		
	}
	
	
	
	
	

}
