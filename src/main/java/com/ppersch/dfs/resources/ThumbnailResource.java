package com.ppersch.dfs.resources;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.ppersch.dfs.fakeBackend.Image;
import com.ppersch.dfs.fakeBackend.UserService;

@Path("/users/{userId}/images/{imageId}/thumbnail")
public class ThumbnailResource {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public URL getThumbnail(@PathParam("userId") String userId, @PathParam("imageId") int imageId) throws MalformedURLException {
		Image matchingImage = new Image();
		List<Image> images = UserService.getUser(userId).getImageList();
		for (Image image: images) {
			if (image.getImageId() == imageId)
				matchingImage = image;
		}
		return matchingImage.getThumbnail();		
	}
}
