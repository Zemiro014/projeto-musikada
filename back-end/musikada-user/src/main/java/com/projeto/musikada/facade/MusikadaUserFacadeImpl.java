package com.projeto.musikada.facade;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import com.projeto.musikada.service.UserServiceApp;
import com.projeto.musikada.to.request.UserRequestTO;
import com.projeto.musikada.to.response.UserResponseTO;

@ApplicationScoped
public class MusikadaUserFacadeImpl implements MusikakaUserFacadeApp{
	
	@Inject
	private UserServiceApp userService;

	@Override
	public void createUser(UserRequestTO to) {
		userService.createUser(to);
	}

	@Override
	public List<UserResponseTO> getAllUser() {		
		return userService.getAllUser();
	}

	@Override
	public UserResponseTO getUserByEmail(String email) {
		return userService.getUserByEmail(email);
	}

	@Override
	public UserResponseTO getUserById(long id) {
		return userService.getUserById(id);
	}
}
