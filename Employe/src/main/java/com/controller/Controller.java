package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.model.User;
import com.repo.Employerepo;
import com.service.EmployeService;

@RestController
@RequestMapping("/api")
public class Controller {
    
	
	@Autowired
    EmployeService service;
     
     //get mapping for all users 
	@GetMapping("/user")
 	private List<User> getAllUser(){
 		return service.getAllUser();
 	}
 // get mapping for single id 
	@GetMapping("/user/{id}")
	private User getUser(@PathVariable("id")Long id) {
		return service.getUserById(id);
	}
 	
// delete user by id
	@DeleteMapping("/user/{id}")
private void deleteUser(@PathVariable("id")Long id) {
	service.delete(id);
}
	
// post mapping 
	private Long saveUser(@RequestBody User user) {
		service.saveOrUpdate(user);
		return user.getId();
		
	}
	
//put mappping or updating data 
	private User update(@RequestBody User user) {
		service.saveOrUpdate(user);
		return user;
	}
	
}
