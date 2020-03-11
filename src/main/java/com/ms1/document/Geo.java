package com.ms1.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


public class Geo {
	@Id
	private String id;
	private String locationName;
	
	public Geo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Geo(String locationName) {
		super();
		this.locationName = locationName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

}
