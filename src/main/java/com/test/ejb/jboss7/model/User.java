package com.test.ejb.jboss7.model;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = -6973837495849752063L;

	private Long id;
	
	private String name;
	
	public User() {
		// Empty constructor
	}
	
	public User(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
