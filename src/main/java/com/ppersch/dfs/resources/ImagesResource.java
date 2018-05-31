package com.ppersch.dfs.resources;

import java.net.MalformedURLException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.ppersch.dfs.fakeBackend.Image;
import com.ppersch.dfs.fakeBackend.UserService;

@Path("/users/{userId}/images")
public class ImagesResource {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Image> getImages(@PathParam("userId") String userId) throws MalformedURLException {
		
		return UserService.getUser(userId).getImageList();		
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Image addImage(@PathParam("userId") String userId, Image image) throws MalformedURLException {
		return UserService.getUser(userId).addImage(image);
	}

}
