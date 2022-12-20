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
import com.idformation.ccp3.mariopizza.mapper.OrderLineMapper;
import com.idformation.ccp3.mariopizza.models.Order;
import com.idformation.ccp3.mariopizza.models.OrderLine;

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
	 * test for OrderLineDTO to OrderLine entity.
	 */
	@Test
	public void lineDtoToEntity() {
		// given
		OrderLineDTO dto = new OrderLineDTO();

		dto.setPizza((long) 1);
		dto.setQuantity((short) 2);


		// when
		OrderLine line = OrderLineMapper.toEntity(dto, new Order());

		// then
		assertThat(dto.getQuantity()).isEqualTo(line.getQuantity());
//		assertThat(dto.getPizza()).isEqualTo(line.getPizza());

	}


	/**
	 * Test for convert a OrderLineDTO null to a OrderLine entity.
	 */
	@Test
	void orderLineDtoNulToEntity() {
		// given
		OrderLineDTO dto = null;

		// when
		OrderLine line = OrderLineMapper.toEntity(dto, new Order());

		// then
		assertEquals(line, dto);
	}

	/**
	 * test for a list OrderLineDTO to a list OrderLine entity.
	 */
	@Test
	public void listOrderLineDtoToListOrderLineEntity() {
		// given
		List<OrderLineDTO> dtos = new ArrayList<>();
		Order order = new Order();

		// when
		List<OrderLine> lines = OrderLineMapper.listDtoToListEntity(dtos, order);

		// then
		assertThat(dtos).isNotNull().hasSameSizeAs(lines);

	}

	/**
	 * test for a List of OrderLine entity null to List of OrderLineDTO.
	 */
	@Test
	public void listOrderLineDtoNullToOListEntity() {
		// given
		List<OrderLineDTO> dtos = null;

		// when
		List<OrderLine> lines = OrderLineMapper.listDtoToListEntity(dtos, new Order());

		// then
		assertThat(lines).isNull();
	}

	/**
	 * test for a List of OrderLine entity null to List of OrderLineDTO.
	 */
	@Test
	public void listOrderLineDtoEmptyToOListEntity() {
		// given
		List<OrderLineDTO> dtos = new ArrayList<>();
		dtos.isEmpty();

		// when
		List<OrderLine> lines = OrderLineMapper.listDtoToListEntity(dtos, new Order());

		// then
		assertThat(lines).isNull();
	}
}
