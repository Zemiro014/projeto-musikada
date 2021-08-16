package com.projeto.musikada.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import com.projeto.musikada.entities.User;
import com.projeto.musikada.to.request.UserRequestTO;
import com.projeto.musikada.to.response.UserResponseTO;

import io.quarkus.elytron.security.common.BcryptUtil;

@ApplicationScoped
public class UserServiceImpl implements UserServiceApp{

	@Inject
	private EntityManager em;
	
	@Transactional
	@Override
	public void createUser(UserRequestTO to) {
		try 
		{
			User user = userRequestToUser(to);
			user.setPassword(encodePassword(to.getPassword()));
			System.out.println("Name: "+user.getName());	
			em.persist(user);
		} catch (Exception e) {
			System.out.println("Error 01: "+e.getMessage());
		}
	}


	@Override
	public UserResponseTO getUserByEmail(String email) {
		Query query = em.createQuery("SELECT us FROM User us WHERE us.email = '" + email + "'");
  		User user = (User)query.getSingleResult();
		return userToUserResponseTo(user);
	}

	@Override
	public UserResponseTO getUserById(long id) {
		Query query = em.createQuery("SELECT us FROM User us WHERE us.id = " + id );
		User user = (User)query.getSingleResult();
		return userToUserResponseTo(user);
	}

	@Override
	public List<UserResponseTO> getAllUser() {

		List<UserResponseTO> responseList = new ArrayList<>();
		List<User> userList = new ArrayList<>();

		try 
		{
			TypedQuery<User> query =	em.createQuery("SELECT us FROM User us", User.class);
			userList = query.getResultList();
			responseList = userList.stream().map(x -> userToUserResponseTo(x)).collect(Collectors.toList());
		
		} catch (Exception e) {
			System.out.println("Error 02: "+e.getMessage());
		}
		return responseList;	
	}
	
	private User userRequestToUser(UserRequestTO to) {
		
		User user = new User();
		user.setName(to.getName());
		user.setAge(to.getAge());
		user.setEmail(to.getEmail());
		user.setPassword(to.getPassword());		
		return user;
	}

	private UserResponseTO userToUserResponseTo(User entity) {
		
		UserResponseTO userResponse = new UserResponseTO();

		userResponse.setId(entity.getId());
		userResponse.setName(entity.getName());
		userResponse.setAge(entity.getAge());
		userResponse.setEmail(entity.getEmail());
		userResponse.setPassword(entity.getPassword());		
		return userResponse;
	}

	private static String encodePassword(String password) {
        String passwordEncod = BcryptUtil.bcryptHash(password);
		return passwordEncod;
    }
}

