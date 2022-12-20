/**
 *  Order test
 */
package com.idformation.ccp3;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.idformation.ccp3.mariopizza.dto.OrderDTO;
import com.idformation.ccp3.mariopizza.helpers.MagicNumber;
import com.idformation.ccp3.mariopizza.mapper.OrderMapper;
import com.idformation.ccp3.mariopizza.models.Order;
import com.idformation.ccp3.security.models.User;

/**
 * @author Stagiaire
 *
 */
@SpringBootTest
public class OrderTest {

	/**
	 * test for Order constructor.
	 */
	@Test
	void orderConstructor() {
		// given

		// when
		Object m = new OrderMapper();

		// then
		assertEquals(m.getClass(), OrderMapper.class);
	}


	/**
	 * test for OrderDTO to Order entity.
	 */
	@Test
	public void orderToEntity() {
		// given
		OrderDTO dto = new OrderDTO();

		dto.setId((long) 1);
		dto.setDate(new Date());
		dto.setTotalAmount((double) MagicNumber.SIZESMALL);
		dto.setUser(new User((long) 1, "010203040506", "password", "firstname",
				"lastname", "address"));
		dto.setLines(null);


		// when
		Order order = OrderMapper.toEntity(dto);

		// then
		assertThat(dto.getId()).isEqualTo(order.getId());
		assertThat(dto.getLines()).isEqualTo(order.getLines());
//		assertThat(dto.getDate()).isNotNull();
//		assertThat(dto.getUser()).isNotNull();


	}

	/**
	 * Test for OrderDTO null to a Order entity.
	 */
	@Test
	void orderDTONulltoOrder() {
		// given
		OrderDTO dto = null;

		// when
		Order order = OrderMapper.toEntity(dto);

		// then
		assertEquals(dto, order);
	}
}
