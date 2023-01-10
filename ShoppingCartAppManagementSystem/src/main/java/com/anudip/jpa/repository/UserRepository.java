package com.anudip.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.anudip.jpa.entity.User;

//Jpa Repository
@Repository
public interface UserRepository extends JpaRepository<User,Integer>{
	
	//customized query using jpql
	@Query("select u from User u where u.email=?1")
	List<User>getUserByName(String userName);

	@Query("select u from User u where u.phone=?1")
	User getUserByPhone(long phone);
}
