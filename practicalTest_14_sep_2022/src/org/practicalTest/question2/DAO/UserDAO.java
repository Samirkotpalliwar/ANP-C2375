package org.practicalTest.question2.DAO;

import org.practicalTest.question2.model.User;

public class UserDAO {
	User[]userArray=new User[10];
	static int i=0;

	public String setUser(User user) {
		// TODO Auto-generated method stub
		userArray[i]=user;
		i++;
		return "Succefully added user details";
	}

	public User[] displayUserDetails() {
		// TODO Auto-generated method stub
		return userArray;
	}

}
