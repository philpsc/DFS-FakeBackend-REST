package com.ppersch.dfs.fakeBackend;

import java.net.MalformedURLException;
import java.net.URL;

public class Image {
	
	private int imageId;
	private URL fileImage;
	private URL thumbnail;
	private Metadata metadata;
	private User user;
	
	public Image() {}
	
	public Image(User user, URL fileImage, URL thumbnail, Metadata metadata) throws MalformedURLException {
		this.user = user;
		this.imageId = user.getImageList().size()+1;
		this.fileImage = fileImage;
		this.thumbnail = thumbnail;
		this.metadata = metadata;
	}

	public int getImageId() {
		return imageId;
	}

	public void setImageId(int imageId) {
		this.imageId = imageId;
	}

	public URL getFileImage() {
		return fileImage;
	}

	public void setFileImage(URL fileImage) {
		this.fileImage = fileImage;
	}

	public URL getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(URL thumbnail) {
		this.thumbnail = thumbnail;
	}

	public Metadata getMetadata() {
		return metadata;
	}

	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}
}
