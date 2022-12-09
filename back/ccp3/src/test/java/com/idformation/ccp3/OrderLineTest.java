/**
 * 
 */
package com.idformation.ccp3;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.idformation.ccp3.mariopizza.dto.OrderDTO;
import com.idformation.ccp3.mariopizza.dto.OrderLineDTO;
import com.idformation.ccp3.mariopizza.dto.PizzaDTO;
import com.idformation.ccp3.mariopizza.mapper.OrderLineMapper;
import com.idformation.ccp3.mariopizza.models.Order;
import com.idformation.ccp3.mariopizza.models.OrderLine;
import com.idformation.ccp3.mariopizza.models.Pizza;
import com.idformation.ccp3.security.dto.UserDTO;
import com.idformation.ccp3.security.models.User;

/**
 * @author Stagiaire
 *
 */
@SpringBootTest
public class OrderLineTest {


	/**
	 * test for OrderLine constructor
	 */
	@Test
	void OrderLineConstructor() {
		// given

		// when
		Object m = new OrderLineMapper();

		// then
		assertEquals(m.getClass(), OrderLineMapper.class);
	}

	/**
	 * test for OrderLine entity to OrderLineDTO
	 */
	@Test
	public void lineToDto() {
		// given
		OrderLine line = new OrderLine();

		line.setId((long) 1);
		line.setQuantity((short) 2);
		line.setPizza(new Pizza((long) 1, "hawaienne", "plein de choses", "image", (double) 10));
		line.setOrder(new Order((long) 1));


		// when
		OrderLineDTO dto = OrderLineMapper.toDto(line);

		// then
		assertThat(line.getId()).isEqualTo(dto.getId());
		assertThat(line.getQuantity()).isEqualTo(dto.getQuantity());

	}

	/**
	 * test for OrderLineDTO to OrderLine entity
	 */
	@Test
	public void lineDtoToEntity() {
		// given
		OrderLineDTO dto = new OrderLineDTO();
		UserDTO user = new UserDTO((long) 1, "0605998899", "445566", "prenom", "nom", "rue du test");

		dto.setId((long) 1);
		dto.setQuantity((short) 2);
		dto.setPizza(new PizzaDTO((long) 1, "hawaienne", "plein de choses", "image", (double) 10));
		dto.setOrder(new OrderDTO((long) 1, null, 25, user));

		// when
		OrderLine line = OrderLineMapper.toEntity(dto);

		// then
		assertThat(dto.getId()).isEqualTo(line.getId());
		assertThat(dto.getQuantity()).isEqualTo(line.getQuantity());

	}

	/**
	 * test for a List of OrderLine entity null to List of OrderLineDTO
	 */
	@Test
	public void listOrderLineNullToOrderLineDto() {
		// given
		List<OrderLine> ols = null;

		// when
		List<OrderLineDTO> dtos = OrderLineMapper.ListToListDto(ols);

		// then
		assertThat(dtos).isNull();
	}

	/**
	 * test for a List of OrderLine entity empty to List of OrderLineDTO
	 */
	@Test
	public void listOrderLineEmptyToOrderLineDto() {
		// given
		List<OrderLine> ols = new ArrayList<>();
		ols.isEmpty();

		// when
		List<OrderLineDTO> dtos = OrderLineMapper.ListToListDto(ols);

		// then
		assertThat(dtos).isNull();
	}

	/**
	 * test for a List of OrderLine entity to List of OrderLineDTO
	 */
	@Test
	public void listOrderLineToListOrderLineDto() {
		// given
		List<OrderLine> ols = new ArrayList<>();
		Pizza pizza = new Pizza((long) 1, "pizza", "description", "image", (double) 10);
		User user = new User((long) 1, "0605998899", "445566", "prenom", "nom", "rue du test");
		Order order = new Order((long) 1, null, 25, user);



		for (long i = 0; i < 2; i++) {
			ols.add(new OrderLine((long) 1, (short) 2, pizza, order));
		}

		// when
		List<OrderLineDTO> dtos = OrderLineMapper.ListToListDto(ols);

		// then
		assertThat(dtos).isNotNull().hasSameSizeAs(ols);
	}


}
