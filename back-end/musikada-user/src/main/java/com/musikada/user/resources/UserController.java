package com.musikada.user.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.musikada.user.dto.request.UserRequest;
import com.musikada.user.dto.response.UserResponse;
import com.musikada.user.services.UserService;

import io.swagger.annotations.Api;

@RestController
@RequestMapping(value = "/users")
@Api(value = "Usuarios")
public class UserController {

	@Autowired
	private UserService service;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<UserResponse> findById(@PathVariable Long id) {
		UserResponse obj = service.findById(id);
		return ResponseEntity.ok(obj);
	}
	
	@GetMapping(value = "/{email}")
	public ResponseEntity<UserResponse> findByEmail(@PathVariable String email) {
		UserResponse obj = service.findByEmail(email);
		return ResponseEntity.ok(obj);
	}

	@GetMapping
	public ResponseEntity<List<UserResponse>> findAll() {
		List<UserResponse> list = service.findAll();
		return ResponseEntity.ok(list);
	}
	
	@PostMapping
	public ResponseEntity<UserRequest> newUser(@RequestBody UserRequest dto){
		UserRequest obj = service.saveUser(dto);
		return ResponseEntity.ok(obj);
	}
}
