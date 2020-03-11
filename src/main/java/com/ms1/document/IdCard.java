package com.ms1.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class IdCard {
	@Id
	private String id;
	private String locationName;
	private String nationalityName;
	private String idNum;
	
	public IdCard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IdCard(String locationName, String nationalityName, String idNum) {
		super();
		this.locationName = locationName;
		this.nationalityName = nationalityName;
		this.idNum = idNum;
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

	public String getNationalityName() {
		return nationalityName;
	}

	public void setNationalityName(String nationalityName) {
		this.nationalityName = nationalityName;
	}

	public String getIdNum() {
		return idNum;
	}

	public void setIdNum(String idNum) {
		this.idNum = idNum;
	}

}
