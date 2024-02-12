package com.example.LearnSphere.Services;

import com.example.LearnSphere.Entity.Users;

public interface UserServices {
	
	//to add user in data base
	String addUser(Users user);
	//to check email is already present in database to avoid duplicate emails
	boolean checkEmail(String email);
	
	//to validate user credentials
	
	boolean valid(String email,String password);
	
	//to get user role via email
	
	String getUserRole(String email);

}
