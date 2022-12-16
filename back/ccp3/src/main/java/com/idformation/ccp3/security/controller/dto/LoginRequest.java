package com.idformation.ccp3.security.controller.dto;

public class LoginRequest {

	/**
	 * the username.
	 */
	private String username;

	/**
	 * the password.
	 */
	private String password;

	/**
	 *
	 */
	public LoginRequest() {
		super();
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
	public void setUsername(final String username) {
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
	public void setPassword(final String password) {
		this.password = password;
	}

}
