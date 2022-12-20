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
	 * @param pUsername the username to set
	 */
	public void setUsername(final String pUsername) {
		this.username = pUsername;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param pPassword the password to set
	 */
	public void setPassword(final String pPassword) {
		this.password = pPassword;
	}

}
