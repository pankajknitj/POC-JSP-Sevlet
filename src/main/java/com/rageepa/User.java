package com.rageepa;

public class User {
	private String name;
	private String gender;
	private String userName;
	private String password;
	
	
	public User() {
		super();
	}
	public User(String name, String gender, String userName, String password) {
		super();
		this.name = name;
		this.gender = gender;
		this.userName = userName;
		this.password = password;
	}

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}	
}
