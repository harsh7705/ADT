package com.adt.contoller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.adt.model.Movie;
import com.adt.model.User;
import com.adt.service.UserService;

/**
 * This is controller class for User related requests
 * 
 * @author Harsh Vyas <vyas61@uwindsor.ca>
 *
 */
@Controller
public class UserController {

	@Autowired
	UserService service;

	/**
	 * API to handle user-registration request
	 * 
	 * @param user
	 * @return
	 */
	@PostMapping("/user/register")
	public ResponseEntity register(@RequestBody User user) {
		service.register(user);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	
	@GetMapping("/about")
	public String about() {
		return "about-us";
	}
}
