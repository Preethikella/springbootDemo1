package com.example.SpringbootDemo.service;

import java.util.List;

import com.example.SpringbootDemo.model.User;

public interface UserService {
	User saveUsers(User user);

	User fetchUserById(int id);

	List<User> fetchAllUsers();

	String deleteUserById(int id);

	User updateUserById(int id, User user);
	
}
