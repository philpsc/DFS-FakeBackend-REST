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
		User raph = new User("raph", "Raphaela", "raph123", new ArrayList<Image>());
		User tobi = new User("tobi", "Tobias", "tobi123", new ArrayList<Image>());
		User benni = new User("benni", "Benjamin", "benni123", new ArrayList<Image>());
		User juli = new User("juli", "Julian", "juli123", new ArrayList<Image>());
		User phil = new User("phil", "Phillip", "phil123", new ArrayList<Image>());
		User aude = new User("aude", "Aude", "aude123", new ArrayList<Image>());
		User mario = new User("mario", "Mario", "mario123", new ArrayList<Image>());
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
	
	public static User getUser(String userId) throws MalformedURLException {
		if (users == null) {
			getUsers();
		}
		for (User user : users) {
			if (userId.equals(user.getUserId()))
				return user;
		}
		return null;
	}
	
	
}
