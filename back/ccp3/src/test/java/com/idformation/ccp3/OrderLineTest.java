/**
 * OrderLine test
 */
package com.idformation.ccp3;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.idformation.ccp3.mariopizza.dto.OrderLineDTO;
import com.idformation.ccp3.mariopizza.helpers.MagicNumber;
import com.idformation.ccp3.mariopizza.mapper.OrderLineMapper;
import com.idformation.ccp3.mariopizza.models.Order;
import com.idformation.ccp3.mariopizza.models.OrderLine;
import com.idformation.ccp3.mariopizza.models.Pizza;
import com.idformation.ccp3.security.models.User;

/**
 * @author Stagiaire
 *
 */
@SpringBootTest
public class OrderLineTest {


	/**
	 * test for OrderLine constructor.
	 */
	@Test
	void orderLineConstructor() {
		// given

		// when
		Object m = new OrderLineMapper();

		// then
		assertEquals(m.getClass(), OrderLineMapper.class);
	}

	/**
	 * test for OrderLine entity to OrderLineDTO.
	 */
	@Test
	public void lineToDto() {
		// given
		OrderLine line = new OrderLine();

		line.setId((long) 1);
		line.setQuantity((short) 2);
		line.setPizza(new Pizza((long) 1, "hawaienne", "plein de choses", "image", (
				double) MagicNumber.SIZESMALL));
		line.setOrder(new Order((long) 1));


		// when
		OrderLineDTO dto = OrderLineMapper.toDto(line);

		// then
		assertThat(line.getId()).isEqualTo(dto.getId());
		assertThat(line.getQuantity()).isEqualTo(dto.getQuantity());
		assertEquals(line.getOrder(), dto.getOrder());
		assertEquals(line.getPizza(), dto.getPizza());

	}

	/**
	 * test for OrderLineDTO to OrderLine entity.
	 */
	@Test
	public void lineDtoToEntity() {
		// given
		OrderLineDTO dto = new OrderLineDTO();

		dto.setId((long) 1);
		dto.setQuantity((short) 2);
		dto.setPizza(new Pizza((long) 1, "hawaienne", "plein de choses", "image", (
				double) MagicNumber.SIZESMALL));
		dto.setOrder(new Order((long) 1));

		// when
		OrderLine line = OrderLineMapper.toEntity(dto);

		// then
		assertThat(dto.getId()).isEqualTo(line.getId());
		assertThat(dto.getQuantity()).isEqualTo(line.getQuantity());
		assertEquals(dto.getOrder(), line.getOrder());
		assertEquals(dto.getPizza(), line.getPizza());

	}

	/**
	 * Test for convert a OrderLine null entity to a OrderLineDTO.
	 */
	@Test
	void orderLineNullToDto() {
		// given
		OrderLine line = null;

		// when
		OrderLineDTO dto = OrderLineMapper.toDto(line);

		// then
		assertEquals(line, dto);
	}

	/**
	 * Test for convert a OrderLine null entity to a OrderLineDTO.
	 */
	@Test
	void orderLineDtoNulToEntity() {
		// given
		OrderLineDTO dto = null;

		// when
		OrderLine line = OrderLineMapper.toEntity(dto);

		// then
		assertEquals(line, dto);
	}

	/**
	 * test for a List of OrderLine entity null to List of OrderLineDTO.
	 */
	@Test
	public void listOrderLineNullToOrderLineDto() {
		// given
		List<OrderLine> ols = null;

		// when
		List<OrderLineDTO> dtos = OrderLineMapper.listToListDto(ols);

		// then
		assertThat(dtos).isNull();
	}

	/**
	 * test for a List of OrderLine entity empty to List of OrderLineDTO.
	 */
	@Test
	public void listOrderLineEmptyToOrderLineDto() {
		// given
		List<OrderLine> ols = new ArrayList<>();
		ols.isEmpty();

		// when
		List<OrderLineDTO> dtos = OrderLineMapper.listToListDto(ols);

		// then
		assertThat(dtos).isNull();
	}

	/**
	 * test for a List of OrderLine entity to List of OrderLineDTO.
	 */
	@Test
	public void listOrderLineToListOrderLineDto() {
		// given
		List<OrderLine> lines = new ArrayList<>();
		Pizza pizza = new Pizza((long) 1, "pizza", "description", "image", (double) MagicNumber.SIZESMALL);
		User user = new User((long) 1, "0605998899", "445566", "prenom", "nom", "rue du test");
		Order order = new Order((long) 1, null, MagicNumber.SIZESMALL, user);



		for (long i = 0; i < 2; i++) {
			lines.add(new OrderLine((long) 1, (short) 2, pizza, order));
		}


		// when
		List<OrderLineDTO> dtos = OrderLineMapper.listToListDto(lines);

		// then
		assertThat(dtos).isNotNull().hasSameSizeAs(lines);
	}
}
