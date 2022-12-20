package com.idformation.ccp3.security.controller.dto;

public class JwtResponse {

	/**
	 * the token of JwtResponse.
	 */
	private String token;

	/**
	 * the tokenHeader of JwtResponse.
	 */
	private String tokenHeader;

	/**
	 *
	 */
	public JwtResponse() {
		super();
	}

	/**
	 * @param pToken is token of JwtReponse
	 * @param pTokenHeader is tokenHeader of JwtReponse
	 */
	public JwtResponse(final String pToken, final String pTokenHeader) {
		super();
		this.token = pToken;
		this.tokenHeader = pTokenHeader;
	}

	/**
	 * @return the token
	 */
	public String getToken() {
		return token;
	}

	/**
	 * @param pToken the token to set
	 */
	public void setToken(final String pToken) {
		this.token = pToken;
	}

	/**
	 * @return the tokenHeader
	 */
	public String getTokenHeader() {
		return tokenHeader;
	}

	/**
	 * @param pTokenHeader the tokenHeader to set
	 */
	public void setTokenHeader(final String pTokenHeader) {
		this.tokenHeader = pTokenHeader;
	}

}
