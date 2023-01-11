package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.model.User;
import com.repo.Employerepo;

@Service
public class EmployeService {
//employee repo
Employerepo userRepo;

//get mapping for user
public List<User>getAllUser(){

	List<User> user= new ArrayList<User>();
	userRepo.findAll().forEach(user1 -> user.add(user1));
	return user;
}

//get mapping using id 

public User getUserById(Long id) {
	return userRepo.findById(id).get();
	}
	
//put mapping save or update 
public void saveOrUpdate(User user) {
	userRepo.save(user);
}

// delete mapping
public void delete(Long id ) {
	userRepo.deleteById(id);
}

// update user mapping 
public void update(User user,Long id) {
	userRepo.save(user);
}
}
