/**
 * User test
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
	 * test for User constructor.
	 */
	@Test
	void userConstructor() {
		// given

		// when
		Object m = new UserMapper();

		// then
		assertEquals(m.getClass(), UserMapper.class);
	}


	/**
	 * test for UserDTO to User entity.
	 */
	@Test
	public void userToEntity() {

		// given
		UserDTO dto = new UserDTO();

		dto.setId((long) 1);
		dto.setLastname("nom");
		dto.setFirstname("prenom");
		dto.setPassword("motdepasse");
		dto.setPhonenumber("0606060606");
		dto.setAddress("address");
		dto.setRoles(null);

		// when
		User user = UserMapper.toEntity(dto);

		// then
		assertThat(dto.getId()).isEqualTo(user.getId());
		assertThat(dto.getLastname()).isEqualTo(user.getLastname());
		assertThat(dto.getFirstname()).isEqualTo(user.getFirstname());
		assertThat(dto.getPhonenumber()).isEqualTo(user.getPhonenumber());
		assertThat(dto.getAddress()).isEqualTo(user.getAddress());
	}

	/**
	 * Test for UserDTO null to a User entity.
	 */
	@Test
	void userDtoNullToUserEntity() {
		// given
		UserDTO dto = null;

		// when
		User user = UserMapper.toEntity(dto);

		// then
		assertEquals(user, dto);
	}

}
