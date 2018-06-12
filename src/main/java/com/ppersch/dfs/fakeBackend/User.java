package com.ppersch.dfs.fakeBackend;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class User {
	
	private int userId;
	private String userName;
	private String userPw; //not encrypted :O
	private List<Image> imageList;
	
	public User(int userId, String userName, String userPw, List<Image> imageList) {
		this.userId = userId;
		this.userName = userName;
		this.userPw = userPw;
		this.imageList = imageList;
	}
	
	public void putRandomImages() throws MalformedURLException {
		imageList = new ArrayList<Image>();
		Random random = new Random();
		int numOfPics = 1000; //random.nextInt(5) + 10; Mindestens fünf Bilder, höchstens 15
		for (int i = 0; i < numOfPics; i++) {
			
			int numOfNextImage = 138;
			while (numOfNextImage == 138 || numOfNextImage == 86 || numOfNextImage == 97 || numOfNextImage == 105 )
				numOfNextImage = random.nextInt(147);
			
			String imageFileURL = "https://picsum.photos/1280/720/?image=" + numOfNextImage ;
			String thumbnailURL = "https://picsum.photos/100/150/?image=" + numOfNextImage ;
			Image newImage = new Image(this, new URL(imageFileURL), new URL(thumbnailURL), new MetaData()); 
			imageList.add(newImage);
		}
	}
	
	public Image addImage(Image image) {
		image.setId(imageList.size()+1);
		imageList.add(image);
		return image;
	}
		

	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
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
