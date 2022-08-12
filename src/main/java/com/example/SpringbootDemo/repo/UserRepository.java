package com.example.SpringbootDemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringbootDemo.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
