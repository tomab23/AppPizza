/**
 * 
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
	 * 
	 * @param password, {@link User} password
	 * @return method to crypt password
	 */
	public static String encoder(String password) {
		PasswordEncoder passwordEncoder = new BCryptPasswordEncoder(); 
		return passwordEncoder.encode(password);
	}
	

	/**
	 * 
	 * @param use, {@link User} entity
	 * @return dto, {@link UserDTO}
	 */
	public static UserDTO toDto(User use) {
		UserDTO dto = new UserDTO();

		dto.setId(use.getId());
		dto.setFirstname(use.getFirstname());
		dto.setLastname(use.getLastname());
		dto.setPassword(use.getPassword());
		dto.setPhonenumber(use.getPhonenumber());
		dto.setAddress(use.getAddress());

		return dto;
	}

	/**
	 * 
	 * @param dto, {@link UserDTO}
	 * @return use, {@link User} entity
	 */
	public static User toEntity(UserDTO dto) {
		User use = new User();

		use.setId(dto.getId());
		use.setFirstname(dto.getFirstname());
		use.setLastname(dto.getLastname());
		use.setPassword(encoder(dto.getPassword()));
		use.setPhonenumber(dto.getPhonenumber());
		use.setAddress(dto.getAddress());

		return use;
	}

}
