package com.ppersch.dfs.resources;

import java.net.MalformedURLException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ppersch.dfs.fakeBackend.Image;
import com.ppersch.dfs.fakeBackend.UserService;

@Path("/users/{userId}/images/{imageId}")
public class ImageResource {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Image getImage(@PathParam("imageId") int imageId, @PathParam("userId") int userId) throws MalformedURLException {
		List<Image> imageList = UserService.getUser(userId).getImageList();
		for(Image image : imageList) {
			if (image.getId() == imageId)
				return image;
		}
		return null;
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Image putImage(@PathParam("userId") int userId, @PathParam("imageId") int imageId, Image image) throws MalformedURLException {
		List<Image> imageList =  UserService.getUser(userId).getImageList();
		for(Image i : imageList) {
			if (i.getId() == imageId) {
				imageList.remove(i);
				imageList.add(image);
				imageList.sort((a, b) -> a.getId() - b.getId());
				break;
			}
		}
		return image;		
	}
}
