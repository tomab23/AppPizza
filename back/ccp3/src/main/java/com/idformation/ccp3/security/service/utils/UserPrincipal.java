package com.idformation.ccp3.security.service.utils;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class UserPrincipal implements UserDetails {

	private static final long serialVersionUID = 928073442559839991L;

	/**
	 * the username of UserPrincipal.
	 */
	private String username;
	/**
	 * the password of UserPrincipal.
	 */
	private String password;

	/**
	 *  enabled of UserPrincipal.
	 */
	private boolean enabled;
	/**
	 *  of UserPrincipal.
	 */
	private Collection<? extends GrantedAuthority> authorities;

	/**
	 * @return authorities
	 */
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}

	/**
	 * @return password
	 */
	@Override
	public String getPassword() {
		return password;
	}

	/**
	 * @return username
	 */
	@Override
	public String getUsername() {
		return username;
	}

	/**
	 * @return boolean
	 */
	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	/**
	 * @return boolean
	 */
	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	/**
	 * @return boolean
	 */
	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	/**
	 * @return enabled
	 */
	@Override
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * @param pUsername is username of UserPrincipal
	 */
	public void setUsername(final String pUsername) {
		this.username = pUsername;
	}

	/**
	 * @param pPassword is password of UserPrincipal
	 */
	public void setPassword(final String pPassword) {
		this.password = pPassword;
	}

	/**
	 * @param pEnabled of enabled of UserPrincipal
	 */
	public void setEnabled(final boolean pEnabled) {
		this.enabled = pEnabled;
	}

	/**
	 * @param pAuthorities of authorities of UserPrincipal
	 */
	public void setAuthorities(final Collection<? extends GrantedAuthority> pAuthorities) {
		this.authorities = pAuthorities;
	}

}
