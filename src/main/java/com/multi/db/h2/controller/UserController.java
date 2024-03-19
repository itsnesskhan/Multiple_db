package com.multi.db.h2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.multi.db.h2.entity.Users;
import com.multi.db.h2.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserController {

	@Autowired
	private final UserRepository userRepository;
	
	@PostMapping
	public ResponseEntity<?> createUser(@RequestBody Users user){
		Users saveUser = userRepository.save(user);
		return ResponseEntity.created(null).body(saveUser);
	}
	
	@GetMapping
	public ResponseEntity<?> getAllUser(){
		List<Users> findAll = userRepository.findAll();
		return ResponseEntity.ok(findAll);
	}
}
