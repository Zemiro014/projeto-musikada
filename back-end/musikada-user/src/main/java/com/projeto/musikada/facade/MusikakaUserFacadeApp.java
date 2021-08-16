package com.projeto.musikada.facade;

import java.util.List;

import com.projeto.musikada.to.request.UserRequestTO;
import com.projeto.musikada.to.response.UserResponseTO;

public interface MusikakaUserFacadeApp {

	void createUser(UserRequestTO to);

	List<UserResponseTO> getAllUser();

	UserResponseTO getUserByEmail(String email);

    UserResponseTO getUserById(long id);
}
