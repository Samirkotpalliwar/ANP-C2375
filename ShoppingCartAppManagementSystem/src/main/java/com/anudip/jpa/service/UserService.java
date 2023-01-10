package com.anudip.jpa.service;

import java.util.List;

import com.anudip.jpa.entity.User;

//abstract method for perfoming CRUD on entity Passenger
public interface UserService {
	
	//method for saving user details
	User saveUser(User u);
	
	//method for fetching user details based on userId
	User getByUserId(int userId);
	
	//method for fetching All user detail 
	List<User>getAllUser();
	
	//method for updating user details based on userId
	User updateByUserId(User u,int userId);
	
	//method for removing user details based on userId
	void deleteByUserId(int userId);
	
	//method to fetche user details based on username
	List<User>getUserByName(String userName);
	
	//method to fetch user details based on phone number
	User getUserByPhone(long phone);

	
	

}
