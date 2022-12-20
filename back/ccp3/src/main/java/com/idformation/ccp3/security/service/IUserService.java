/**
 *  interface for UserService
 */
package com.idformation.ccp3.security.service;

import java.util.Optional;

import com.idformation.ccp3.security.models.User;

/**
 * @author Stagiaire
 *
 */

public interface IUserService {

	/**
	 * @param entity
	 * @return User entity
	 */
	User saveUser(User entity);

	/**
	 * @param username
	 * @return phonenumber of User
	 */
	Optional<User> findByUsername(String username);

}
