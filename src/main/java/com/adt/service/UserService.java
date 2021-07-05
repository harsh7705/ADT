package com.adt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adt.model.User;
import com.adt.repository.UserRepository;

/**
 * Service layer for user related requests
 * 
 * @author Harsh Vyas <vyas61@uwindsor.ca>
 *
 */
@Service
public class UserService {
	
	@Autowired
	UserRepository repository;
	
	/**
	 * This method calls is used to regiter a user
	 * 
	 * @param user
	 */
	public void register(User user) {
		repository.insert(user);
	}
}
