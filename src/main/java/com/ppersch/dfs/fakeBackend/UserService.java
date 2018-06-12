package com.ppersch.dfs.fakeBackend;

import java.net.MalformedURLException;
import java.util.ArrayList;

public class UserService {
		
	private static ArrayList<User> users;
	
	public static ArrayList<User> getUsers() throws MalformedURLException {
		if (users != null) {
			return users;
		}		
		users = new ArrayList<User>();
		User raph = new User(1, "Raphaela", "raph123", new ArrayList<Image>());
		User tobi = new User(2, "Tobias", "tobi123", new ArrayList<Image>());
		User benni = new User(3, "Benjamin", "benni123", new ArrayList<Image>());
		User juli = new User(4, "Julian", "juli123", new ArrayList<Image>());
		User phil = new User(5, "Phillip", "phil123", new ArrayList<Image>());
		User aude = new User(6, "Aude", "aude123", new ArrayList<Image>());
		User mario = new User(7, "Mario", "mario123", new ArrayList<Image>());
		users.add(raph);
		users.add(tobi);
		users.add(benni);
		users.add(juli);
		users.add(phil);
		users.add(aude);
		users.add(mario);
		
		for (User u : users) {
			u.putRandomImages();
		}

		return users;
	}
	
	public static User getUser(int userId) throws MalformedURLException {
		if (users == null) {
			getUsers();
		}
		for (User user : users) {
			if (userId == user.getUserId())
				return user;
		}
		return null;
	}
	
	
}
