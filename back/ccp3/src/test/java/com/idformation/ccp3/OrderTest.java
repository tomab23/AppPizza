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

//	/**
//	 * test for Order entity to OrderDTO.
//	 */
//	@Test
//	public void orderToDto() {
//		// given
//		Order order = new Order();
//
//		order.setId((long) 1);
//		order.setDate(new Date());
//		order.setTotalAmount((double) MagicNumber.SIZESMALL);
//		order.setUser(new User());
//		order.setLines(null);
//
//
//		// when
//		OrderDTO dto = OrderMapper.toDto(order);
//
//		// then
//		assertThat(order.getId()).isEqualTo(dto.getId());
//		assertThat(order.getDate()).isEqualTo(dto.getDate());
//		assertThat(order.getTotalAmount()).isEqualTo(dto.getTotalAmount());
////		assertThat(order.getUser()).isEqualTo(dto.getUser());
////		assertThat(order.getLines()).isEqualTo(dto.getLines());
//
//
//	}

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

	}

//	/**
//	 * Test for Order null entity to a OrderDTO.
//	 */
//	@Test
//	void orderNullToDto() {
//		// given
//		Order order = null;
//
//		// when
//		OrderDTO dto = OrderMapper.toDto(order);
//
//		// then
//		assertEquals(order, dto);
//	}

	/**
	 * Test for Order null entity to a OrderDTO.
	 */
	@Test
	void orderNulltoOrderDTO() {
		// given
		OrderDTO dto = null;

		// when
		Order order = OrderMapper.toEntity(dto);

		// then
		assertEquals(dto, order);
	}


//	/**
//	 * test for a List of Order entity null to List of OrderDTO.
//	 */
//	@Test
//	public void listOrderNullToOrderDto() {
//		// given
//		List<Order> order = null;
//
//		// when
//		List<OrderDTO> dtos = OrderMapper.listToListDto(order);
//
//		// then
//		assertThat(dtos).isNull();
//		assertEquals(order, dtos);
//	}
//
//	/**
//	 * test for a List of Order entity empty to List of OrderDTO.
//	 */
//	@Test
//	public void listOrderEmptyToOrderDto() {
//		// given
//		List<Order> order = new ArrayList<>();
//		order.isEmpty();
//
//		// when
//		List<OrderDTO> dtos = OrderMapper.listToListDto(order);
//
//		// then
//		assertThat(dtos).isNull();
//	}
//
//	/**
//	 * test for a List of Order entity to List of OrderDTO.
//	 */
//	@Test
//	public void listOrdertoListOrderDto() {
//		// given
//		List<Order> orders = new ArrayList<>();
//		List<OrderLine> lines = new ArrayList<>();
//		User user = new User((long) 1, "0605558899", "0258963", "nom", "prenom", "address");
//
//		for (Short i = 0; i < 2; i++) {
//			lines.add(new OrderLine((long) 1));
//		}
//
//		for (long i = 0; i < 2; i++) {
//			orders.add(new Order((long) 1, null, (double) MagicNumber.SIZESMALL, lines, user));
//		}
//
//		// when
//		List<OrderDTO> dtos = OrderMapper.listToListDto(orders);
//
//		// then
//		assertThat(dtos).isNotNull().hasSameSizeAs(orders);
//	}

}
