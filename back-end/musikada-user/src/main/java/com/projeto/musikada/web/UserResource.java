package com.projeto.musikada.web;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.projeto.musikada.facade.MusikakaUserFacadeApp;
import com.projeto.musikada.to.request.UserRequestTO;
import com.projeto.musikada.to.response.UserResponseTO;

@Path("/users")
public class UserResource {
	
	@Inject
	private MusikakaUserFacadeApp facade;
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createUser(UserRequestTO to) {
		facade.createUser(to);
		return Response.status(200).build();
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/all-users")
	public Response getAllUsers(){
		List<UserResponseTO> responseTO = facade.getAllUser();
		return Response.status(200).entity(responseTO).build();
	}

	@GET()
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getUserById(@PathParam("id") long id){
		UserResponseTO responseTO = facade.getUserById(id);
		return Response.status(200).entity(responseTO).build();
	}

	@GET()
	@Path("/{email}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getUserByEmail(@PathParam("email") String email){
		UserResponseTO responseTO = facade.getUserByEmail(email);
		return Response.status(200).entity(responseTO).build();
	}
}
