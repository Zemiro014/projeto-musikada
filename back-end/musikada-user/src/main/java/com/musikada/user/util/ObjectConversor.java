package com.musikada.user.util;

import com.musikada.user.dto.request.UserRequest;
import com.musikada.user.dto.response.UserResponse;
import com.musikada.user.entities.User;

public class ObjectConversor {
	User user;
	UserResponse userResponse;
	UserRequest userRequest;
	
	public User convertUserRequestToUser(UserRequest dto) {
		user = new User();
		user.setFirstName(dto.getFirstName());
		user.setEmail(dto.getEmail());
		user.setNackName(dto.getNackName());
		user.setPassword(dto.getPassword());
		user.setSecondName(dto.getSecondName());
		user.setPhone(dto.getPhone());
		return user;
	}
	
	public UserResponse convertUserToUserResponse(User entity) {
		userResponse = new UserResponse();
		userResponse.setFirstName(entity.getFirstName());
		userResponse.setEmail(entity.getEmail());
		userResponse.setNackName(entity.getNackName());
		userResponse.setSecondName(entity.getSecondName());
		userResponse.setPhone(entity.getPhone());
		return userResponse;
	}
	public UserRequest convertUserToUserRequest(User entity) {
		userRequest = new UserRequest();
		userRequest.setFirstName(entity.getFirstName());
		userRequest.setEmail(entity.getEmail());
		userRequest.setNackName(entity.getNackName());
		userRequest.setSecondName(entity.getSecondName());
		userRequest.setPhone(entity.getPhone());
		userRequest.setPassword(entity.getPassword());
		return userRequest;
	}
}
