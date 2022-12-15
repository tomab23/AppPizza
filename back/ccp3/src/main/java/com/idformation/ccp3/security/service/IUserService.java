/**
 * 
 */
package com.idformation.ccp3.security.service;

import com.idformation.ccp3.security.models.User;

/**
 * @author Stagiaire
 *
 */

public interface IUserService {

	User saveUser(User entity);

	User findByPhonenumber(String phonenumber);

}
