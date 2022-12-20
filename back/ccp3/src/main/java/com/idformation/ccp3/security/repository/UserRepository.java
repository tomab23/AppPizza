package com.idformation.ccp3.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.idformation.ccp3.security.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	/**
	 * @param username
	 * @return phonenumer of User
	 */
	@Query(value = "select u from User u where phoneNumber = :username")
	Optional<User> findByUsername(String username);

	/**
	 * @param phonenumber
	 * @return phonenumber of User
	 */
	Optional<User> findByPhonenumber(String phonenumber);
}
