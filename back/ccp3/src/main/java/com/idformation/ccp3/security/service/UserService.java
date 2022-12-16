/**
 * 
 */
package com.idformation.ccp3.security.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idformation.ccp3.security.models.User;
import com.idformation.ccp3.security.repository.UserRepository;

/**
 * @author Stagiaire
 *
 */
@Service("UserService")
public class UserService implements IUserService {

	/**
	 * call User Repository.
	 */
	@Autowired
	private UserRepository userRepo;

	/**
	 * return new User.
	 */
	@Override
	public User saveUser(final User entity) {
		return userRepo.saveAndFlush(entity);
	}

	/**
	 * return phonenumber of User.
	 */
	@Override
	public Optional<User> findByPhonenumber(final String phonenumber) {
		return userRepo.findByPhonenumber(phonenumber);
	}

}
