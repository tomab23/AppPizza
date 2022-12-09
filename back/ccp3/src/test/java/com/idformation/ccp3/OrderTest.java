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
import com.idformation.ccp3.mariopizza.mapper.OrderMapper;
import com.idformation.ccp3.mariopizza.models.Order;
import com.idformation.ccp3.mariopizza.models.OrderLine;
import com.idformation.ccp3.security.dto.UserDTO;
import com.idformation.ccp3.security.models.User;

/**
 * @author Stagiaire
 *
 */
@SpringBootTest
public class OrderTest {

	/**
	 * test for Order constructor
	 */
	@Test
	void OrderConstructor() {
		// given

		// when
		Object m = new OrderMapper();

		// then
		assertEquals(m.getClass(), OrderMapper.class);
	}

	/**
	 * test for Order entity to OrderDTO
	 */
	@Test
	public void OrderToDto() {
		// given
		Order order = new Order();

		order.setId((long) 1);
		order.setDate(null);
		order.setTotalAmount((double) 25);
		order.setUser(new User((long) 1, "0605998899", "445566", "prenom", "nom", "rue du test"));
		List<OrderLine> lines = new ArrayList<>();
		for (long i = 0; i < 2; i++) {
			lines.add(new OrderLine(i, (long) 1, (short) 25));
		}
		
		order.setLines(lines);

		// when
		OrderDTO dto = OrderMapper.toDto(order);

		// then
		assertThat(order.getId()).isEqualTo(dto.getId());
		assertThat(order.getDate()).isEqualTo(dto.getDate());
		assertThat(order.getTotalAmount()).isEqualTo(dto.getTotalAmount());


	}

	/**
	 * test for OrderDTO to Order entity
	 */
	@Test
	public void OrderToEntity() {
		// given
		OrderDTO dto = new OrderDTO();

		dto.setId((long) 1);
		dto.setDate(null);
		dto.setTotalAmount((double) 25);
		dto.setUser(new UserDTO((long) 1, "0605558899", "0258963", "nom", "prenom", "address"));
		List<OrderLineDTO> lines = new ArrayList<>();
		for (long i = 0; i < 2; i++) {
			lines.add(new OrderLineDTO(i, (long) 1, (short) 25));
		}
		
		dto.setLines(null);


		// when
		Order order = OrderMapper.toEntity(dto);

		// then
		assertThat(dto.getId()).isEqualTo(order.getId());
		assertThat(dto.getDate()).isEqualTo(order.getDate());
		assertThat(dto.getTotalAmount()).isEqualTo(order.getTotalAmount());

	}

	/**
	 * test for a List of Order entity null to List of OrderDTO
	 */
	@Test
	public void listOrderNullToOrderDto() {
		// given
		List<Order> order = null;

		// when
		List<OrderDTO> dtos = OrderMapper.ListToListDto(order);

		// then
		assertThat(dtos).isNull();
	}

	/**
	 * test for a List of Order entity empty to List of OrderDTO
	 */
	@Test
	public void listOrderEmptyToOrderDto() {
		// given
		List<Order> order = new ArrayList<>();
		order.isEmpty();

		// when
		List<OrderDTO> dtos = OrderMapper.ListToListDto(order);

		// then
		assertThat(dtos).isNull();
	}

	/**
	 * test for a List of Order entity to List of OrderDTO
	 */
	@Test
	public void listOrdertoListOrderDto() {
		// given
		List<Order> orders = new ArrayList<>();
		List<OrderLine> lines = new ArrayList<>();
		User user = new User((long) 1, "0605558899", "0258963", "nom", "prenom", "address");

		for (Short i = 0; i < 2; i++) {
			lines.add(new OrderLine((long) 1));
		}

		for (long i = 0; i < 2; i++) {
			orders.add(new Order((long) 1, null, (double) 25, lines, user));
		}

		// when
		List<OrderDTO> dtos = OrderMapper.ListToListDto(orders);

		// then
		assertThat(dtos).isNotNull().hasSameSizeAs(orders);
	}

}
