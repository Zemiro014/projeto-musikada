package com.musikada.user.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.musikada.user.dto.request.UserRequest;
import com.musikada.user.dto.response.UserResponse;
import com.musikada.user.entities.User;
import com.musikada.user.repositories.UserRepository;
import com.musikada.user.util.ObjectConversor;

@Service
public class UserService implements UserDetailsService{

	@Autowired
	private UserRepository userRepository;
	private static Logger logger = LoggerFactory.getLogger(UserService.class);
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	public List<UserResponse> findAll(){
		return userRepository.findAll()
				.stream().map(x -> new ObjectConversor().convertUserToUserResponse(x))
				.collect(Collectors.toList());
	}
	
	public UserResponse findByEmail(String email) {
		User user = userRepository.findByEmail(email);
		return new ObjectConversor().convertUserToUserResponse(user);
	}
	
	public UserResponse findById(Long id) {
		Optional<User> user = userRepository.findById(id);
		return new ObjectConversor().convertUserToUserResponse(user.get());
	}
	
	public UserRequest saveUser(UserRequest dto) {
		dto.setPassword(passwordEncoder.encode(dto.getPassword()));		
		User user = userRepository.save(new ObjectConversor().convertUserRequestToUser(dto));
		return new ObjectConversor().convertUserToUserRequest(user);
	}
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user = userRepository.findByEmail(username);
		if (user == null) {
			logger.error("User not found: " + username);
			throw new UsernameNotFoundException("Email not found");
		}
		logger.info("User found: " + username);
		return user;
	}
}
