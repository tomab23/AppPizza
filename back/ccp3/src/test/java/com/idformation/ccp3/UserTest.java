/**
 * 
 */
package com.idformation.ccp3;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.idformation.ccp3.security.dto.UserDTO;
import com.idformation.ccp3.security.mapper.UserMapper;
import com.idformation.ccp3.security.models.User;

/**
 * @author Stagiaire
 *
 */
@SpringBootTest
public class UserTest {

	/**
	 * test for User constructor
	 */
	@Test
	void UserConstructor() {
		// given

		// when
		Object m = new UserMapper();

		// then
		assertEquals(m.getClass(), UserMapper.class);
	}

	/**
	 * test for User entity to UserDTO
	 */
	@Test
	public void UserToDto() {
		// given
		User user = new User();

		user.setId((long) 1);
		user.setLastname("nom");
		user.setFirstname("prenom");
		user.setPassword("motdepasse");
		user.setPhonenumber("0606060606");
		user.setAddress("address");

		// when
		UserDTO dto = UserMapper.toDto(user);

		// then
		assertThat(user.getId()).isEqualTo(dto.getId());
		assertThat(user.getLastname()).isEqualTo(dto.getLastname());
		assertThat(user.getFirstname()).isEqualTo(dto.getFirstname());
		assertThat(user.getPassword()).isEqualTo(dto.getPassword());
		assertThat(user.getPhonenumber()).isEqualTo(dto.getPhonenumber());
		assertThat(user.getAddress()).isEqualTo(dto.getAddress());
	}

	/**
	 * test for UserDTO to User entity
	 */
	@Test
	public void UserToEntity() {
		// given
		UserDTO dto = new UserDTO();

		dto.setId((long) 1);
		dto.setLastname("nom");
		dto.setFirstname("prenom");
		dto.setPassword("motdepasse");
		dto.setPhonenumber("0606060606");
		dto.setAddress("address");

		// when
		User user = UserMapper.toEntity(dto);

		// then
		assertThat(dto.getId()).isEqualTo(user.getId());
		assertThat(dto.getLastname()).isEqualTo(user.getLastname());
		assertThat(dto.getFirstname()).isEqualTo(user.getFirstname());
		assertThat(dto.getPhonenumber()).isEqualTo(user.getPhonenumber());
		assertThat(dto.getAddress()).isEqualTo(user.getAddress());
	}

}
