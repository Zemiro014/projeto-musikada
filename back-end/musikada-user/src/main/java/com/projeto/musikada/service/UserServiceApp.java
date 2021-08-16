package com.projeto.musikada.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import com.projeto.musikada.to.request.UserRequestTO;
import com.projeto.musikada.to.response.UserResponseTO;

@ApplicationScoped
public interface UserServiceApp {
	void createUser(UserRequestTO to);
	List<UserResponseTO> getAllUser();
	UserResponseTO getUserByEmail(String email);
    UserResponseTO getUserById(long id);
}