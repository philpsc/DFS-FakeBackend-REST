package com.ppersch.dfs.fakeBackend;
import java.util.Random;

public class Metadata {
	private String owner;
	private String date;
	private String location;
	private String[] tagList;
	
	private String[] owners = {"Peter Pan", "Peter Maffay", "Peer Mertesacker", "Paul Panzer", "Pele","Pablo Picasso", "Panz vom Pauly", "Peter Parker"};
	private int numOfOwners = owners.length;
	
	private String[] dates = {"25.04.2019", "10.05.2017", "26.09.2010", "02.12.1998"};
	private int numOfDates = dates.length;
	
	private String[] locations = {"Buxdehude", "Saarbruecken", "Palma", "Menge-Bolche", "Wadgassen"};
	private int numOfLocations = locations.length;
	
	private String[] tags = {"picOfTheDay", "Selbstdarstellung", "Urlaub Thailand", "Weihnachtsfeier", "BossenUndBimsen"};
	private int numOfTags = tags.length;
	
	Random random = new Random();
	
	public Metadata() {
		this.owner = owners[random.nextInt(numOfOwners)];
		this.date = dates[random.nextInt(numOfDates)];
		this.location = locations[random.nextInt(numOfLocations)];
		
		int numOfTagsForImage = random.nextInt(3);
		this.tagList = new String[numOfTagsForImage];		

		for (int i = 0; i < numOfTagsForImage; i++) {
			tagList[i] = tags[random.nextInt(numOfTags)];
		}
	
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String[] getTagList() {
		return tagList;
	}

	public void setTagList(String[] tagList) {
		this.tagList = tagList;
	}






	
	
	
}
