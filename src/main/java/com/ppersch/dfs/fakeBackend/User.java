package com.ppersch.dfs.fakeBackend;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class User {
	
	private String userId;
	private String userName;
	private String userPw; //not encrypted :O
	private List<Image> imageList;
	
	public User(String userId, String userName, String userPw, List<Image> imageList) {
		this.userId = userId;
		this.userName = userName;
		this.userPw = userPw;
		this.imageList = imageList;
	}
	
	public void putRandomImages() throws MalformedURLException {
		imageList = new ArrayList<Image>();
		Random random = new Random();
		int numOfPics = random.nextInt(5) + 10; // Mindestens fünf Bilder, höchstens 15
		for (int i = 0; i < numOfPics; i++) {
			int numOfNextImage = random.nextInt(1000);
			String imageFileURL = "https://picsum.photos/400/600/?image=" + numOfNextImage ;
			String thumbnailURL = "https://picsum.photos/100/150/?image=" + numOfNextImage ;
			Image newImage = new Image(this, new URL(imageFileURL), new URL(thumbnailURL), new Metadata()); 
			imageList.add(newImage);
		}
	}
	
	public Image addImage(Image image) {
		image.setImageId(imageList.size()+1);
		imageList.add(image);
		return image;
	}
		

	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public List<Image> getImageList() {
		return imageList;
	}
	public void setImageList(List<Image> imageList) {
		this.imageList = imageList;
	}
	
	
}
