package com.idformation.ccp3.security.service.utils;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.authority.SimpleGrantedAuthority;

import com.idformation.ccp3.security.models.User;

public class UserMapper {

	/**
	 * Return User entity to UserPrincipal entity.
	 * @param user User entity
	 * @return userp UserPrincipal entity
	 */
	public static UserPrincipal userToPrincipal(final User user) {
		UserPrincipal userp = new UserPrincipal();
		List<SimpleGrantedAuthority> authorities = user.getRoles().stream()
				.map(role -> new SimpleGrantedAuthority(
						"ROLE_" + role.getName())).collect(Collectors.toList());

		userp.setUsername(user.getPhonenumber());
		userp.setPassword(user.getPassword());
		userp.setEnabled(true);
		userp.setAuthorities(authorities);
		return userp;
	}

}
