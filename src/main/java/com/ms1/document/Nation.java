package com.ms1.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Nation {
	@Id
	private String id;
	private String nationalityName;
	
	public Nation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Nation(String nationalityName) {
		super();
		this.nationalityName = nationalityName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNationalityName() {
		return nationalityName;
	}

	public void setNationalityName(String nationalityName) {
		this.nationalityName = nationalityName;
	}

}
