package com.exam.model;

public class JwtRequest {
	
	String username;
	String password;
	/**
	 * 
	 */
	public JwtRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param username
	 * @param password
	 */
	public JwtRequest(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
}
