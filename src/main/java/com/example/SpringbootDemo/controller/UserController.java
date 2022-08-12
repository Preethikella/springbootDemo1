package com.example.SpringbootDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringbootDemo.model.User;
import com.example.SpringbootDemo.service.UserService;

@RestController
public class UserController {	
	@Autowired
	private UserService userService;

	
	@PostMapping("/save")
	public User saveUser(@RequestBody User user) {
		return userService.saveUsers(user);
	}
	
	@GetMapping("/getUser/{id}")
	public User fetchUser(@PathVariable int id) {
		return userService.fetchUserById(id);
	}
	
	@GetMapping("/getUsers")
	public List<User> fetchAllUser(){
		return userService.fetchAllUsers();
	}
	
	@DeleteMapping("/deleteUser/{id}")
	public String deleteUser(@PathVariable int id) {
		return userService.deleteUserById(id);
	}
	@PutMapping("/updateUser/{id}")
	public User updateUser(@PathVariable int id,@RequestBody User user) {
		return userService.updateUserById(id,user);
	}

}
