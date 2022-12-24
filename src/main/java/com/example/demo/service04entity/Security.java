package com.example.demo.service04entity;

public class Security {
	private String password;
	private String username;

	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Override
	public String toString() {
		return "Security [password=" + password + ", username=" + username + "]";
	}
	public Security(String password, String username) {
		super();
		this.password = password;
		this.username = username;
	}
	
	

}
