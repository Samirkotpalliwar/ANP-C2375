package com.anudip.jpa.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anudip.jpa.entity.User;
import com.anudip.jpa.service.UserService;

@RestController
@RequestMapping("/user")
//RestController to handle all incoming request using REST Api
public class UserController {
	
	@Autowired
	private UserService us;
	
	//Saving User details using post mapping
	@PostMapping("/save")
	public ResponseEntity<User>saveu(@Valid @RequestBody User user){
	return new ResponseEntity<User>(us.saveUser(user),HttpStatus.CREATED);
	}
	
	//fetching user details by using get mapping
	@GetMapping("/get/{userId}")
	public ResponseEntity<User>getu(@PathVariable("userId") int userId){
		return new ResponseEntity<User>(us.getByUserId(userId),HttpStatus.OK);
	}
	
	//updating user details by using put mapping
	@PutMapping("/update/{userId}")
	public ResponseEntity<User>updateu(@PathVariable("userId") int userId,@RequestBody User user){
		return new ResponseEntity<User>(us.updateByUserId( user, userId),HttpStatus.OK);
	}
	
	//Deleting user details by id using delete mapping
	@DeleteMapping("delete/{userId}")
	public ResponseEntity<String>deleteu(@PathVariable("userId") int userId ) {
		us.deleteByUserId(userId);
		return new ResponseEntity<String>("Deleted Succefully",HttpStatus.OK);
		
	}
	
	//fetching All User details by using get mapping
	@GetMapping("/get")
	public List<User>getAllUser(){
		return us.getAllUser();
	}
	

	//fetching User detail by userName using get mapping
	@GetMapping("/get/{userName}")
	public List<User>getUserByName(@PathVariable("userName") String userName){
		return us.getUserByName(userName);
	}
	
	//fetching User details by phone using get mapping
	@GetMapping("/get/phone/{phone}")
	public ResponseEntity<User>getUserByPhone(@PathVariable("phone") long phone){
		return new ResponseEntity<User>(us.getUserByPhone(phone),HttpStatus.OK);
	}
	
}
