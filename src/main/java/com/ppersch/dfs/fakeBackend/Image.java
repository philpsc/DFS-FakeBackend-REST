package com.ppersch.dfs.fakeBackend;

import java.net.MalformedURLException;
import java.net.URL;

public class Image {
	
	private int id;
	private URL imageSource;
	private URL thumbnail;
	private MetaData metaData;
	private User user;
	
	public Image() {}
	
	public Image(User user, URL fileImage, URL thumbnail, MetaData metadata) throws MalformedURLException {
		this.user = user;
		this.id = user.getImageList().size()+1;
		this.imageSource = fileImage;
		this.thumbnail = thumbnail;
		this.metaData = metadata;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public URL getImageSource() {
		return imageSource;
	}

	public void setImageSource(URL imageSource) {
		this.imageSource = imageSource;
	}

	public URL getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(URL thumbnail) {
		this.thumbnail = thumbnail;
	}

	public MetaData getMetaData() {
		return metaData;
	}

	public void setMetaData(MetaData metadata) {
		this.metaData = metadata;
	}
}
