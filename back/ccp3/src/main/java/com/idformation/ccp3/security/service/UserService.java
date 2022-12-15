/**
 * 
 */
package com.idformation.ccp3.security.service;

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

	@Autowired
	UserRepository userRepo;

	@Override
	public User saveUser(User entity) {
		return userRepo.saveAndFlush(entity);
	}

	@Override
	public User findByPhonenumber(String phonenumber) {
		return userRepo.findByPhonenumber(phonenumber);
	}

}
