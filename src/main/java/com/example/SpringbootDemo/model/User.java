package com.example.SpringbootDemo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "user")
public class User { 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private long userId; 
	private String title;
	private String body;
	
	public User(){
		
	}
	

	public User(long userId, String title, String body) {
		super();
		this.userId = userId;
		this.title = title;
		this.body = body;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	
	
}
