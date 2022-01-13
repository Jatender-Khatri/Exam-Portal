package com.exam.model;

public class JwtResponse {

	String token;

	/**
	 * 
	 */
	public JwtResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param token
	 */
	public JwtResponse(String token) {
		super();
		this.token = token;
	}

	/**
	 * @return the token
	 */
	public String getToken() {
		return token;
	}

	/**
	 * @param token the token to set
	 */
	public void setToken(String token) {
		this.token = token;
	}
	
}
