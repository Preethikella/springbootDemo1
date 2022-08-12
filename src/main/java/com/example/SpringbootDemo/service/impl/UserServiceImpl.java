package com.example.SpringbootDemo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringbootDemo.model.User;
import com.example.SpringbootDemo.repo.UserRepository;
import com.example.SpringbootDemo.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserRepository userRepository;
	
	

	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public User saveUsers(User user) {
		User usr=userRepository.save(user);
		return usr;
	}

	@Override
	public User fetchUserById(int id) {
		return userRepository.findById(id).get();
	}

	@Override
	public List<User> fetchAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public String deleteUserById(int id) {
		userRepository.deleteById(id);
		return "deleted";
	}

	@Override
	public User updateUserById(int id, User user) {
		User usr=userRepository.findById(id).get();
		usr.setUserId(user.getUserId());
		usr.setTitle(user.getTitle());
		usr.setBody(user.getBody());
	    userRepository.save(user);
	  return usr;
	}
	
	

}
