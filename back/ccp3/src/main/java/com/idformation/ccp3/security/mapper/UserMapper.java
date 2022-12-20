/**
 *  Mapper for User
 */
package com.idformation.ccp3.security.mapper;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.idformation.ccp3.security.dto.UserDTO;
import com.idformation.ccp3.security.models.User;

/**
 * @author Stagiaire
 *
 */
public class UserMapper {

	/**
	 * @param password User password.
	 * @return method to crypt password
	 */
	public static String encoder(final String password) {
		PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		return passwordEncoder.encode(password);
	}

	/**
	 * Transform UserDTO to User entity.
	 * @param dto UserDTO
	 * @return use User entity
	 */
	public static User toEntity(final UserDTO dto) {
		User use = null;

		if (dto != null) {
			use = new User();
			use.setId(dto.getId());
			use.setFirstname(dto.getFirstname());
			use.setLastname(dto.getLastname());
			use.setPassword(encoder(dto.getPassword()));
			use.setPhonenumber(dto.getPhonenumber());
			use.setAddress(dto.getAddress());
	}
		return use;
	}

}
