package com.idformation.ccp3.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.idformation.ccp3.security.models.User;
import com.idformation.ccp3.security.repository.UserRepository;
import com.idformation.ccp3.security.service.utils.UserMapper;

@Service
@Transactional
public class UserDetailsServiceImpl implements UserDetailsService {

	/**
	 * call User repository.
	 */
	@Autowired
	private UserRepository userRepository;

	/**
	 * Mathod for find User with is username.
	 * @param username about User
	 * @return UserPrincipal entity
	 */
	@Override
	public UserDetails loadUserByUsername(final String username) throws UsernameNotFoundException {
		User user = userRepository.findByUsername(username)
				.orElseThrow(() -> new UsernameNotFoundException("User NOT Found"));
		return UserMapper.userToPrincipal(user);
	}

}
