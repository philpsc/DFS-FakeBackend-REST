package com.ppersch.dfs.resources;
import java.net.MalformedURLException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ppersch.dfs.fakeBackend.Image;
import com.ppersch.dfs.fakeBackend.User;
import com.ppersch.dfs.fakeBackend.UserService;

@Path("/users")
public class UserResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> getUsers() throws MalformedURLException {
		return UserService.getUsers();
	}
	
	
}
