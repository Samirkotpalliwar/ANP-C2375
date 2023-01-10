package com.anudip.jpa.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anudip.jpa.entity.User;
import com.anudip.jpa.exception.UserNotFoundException;
import com.anudip.jpa.repository.UserRepository;
import com.anudip.jpa.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository urepo;

	@Override
	//Saving user details into table using save() of JpaRepository
	public User saveUser(User u) {
		// TODO Auto-generated method stub
		return urepo.save(u);
	}

	@Override
	//fetching user details from table based on  id .if not found then throw exception
	public User getByUserId(int userId) {
		// TODO Auto-generated method stub
		return urepo.findById(userId).orElseThrow(()->new UserNotFoundException("Entered user id does not exist in system"));
	}

	@Override
	//fetching all user details from table using findAll() of jpaRepository
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return urepo.findAll();
	}

	@Override
	//Updating user details based on id from table using save()
	public User updateByUserId(User u, int userId) {
		// TODO Auto-generated method stub
		User u1=urepo.findById(userId).orElseThrow(()->new UserNotFoundException("Entered user id does not exist in system"));
		
		u1.setEmail(u.getEmail());
		u1.setPhone(u.getPhone());
		return u1;
	}

	@Override
	//remove user details based on id from table using deleteById()
	public void deleteByUserId(int userId) {
		// TODO Auto-generated method stub
		urepo.findById(userId).orElseThrow(()->new UserNotFoundException("Entered user id does not exist in system"));
		urepo.deleteById(userId);
	}

	@Override
	public List<User> getUserByName(String userName) {
		// TODO Auto-generated method stub
		return urepo.getUserByName(userName);
	}

	@Override
	public User getUserByPhone(long phone) {
		// TODO Auto-generated method stub
		return urepo.getUserByPhone(phone);
	}

}
