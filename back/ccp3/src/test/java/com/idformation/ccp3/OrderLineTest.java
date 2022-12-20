/**
 * OrderLine test
 */
package com.idformation.ccp3;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.idformation.ccp3.mariopizza.dto.OrderLineDTO;
import com.idformation.ccp3.mariopizza.helpers.MagicNumber;
import com.idformation.ccp3.mariopizza.mapper.OrderLineMapper;
import com.idformation.ccp3.mariopizza.models.Order;
import com.idformation.ccp3.mariopizza.models.OrderLine;
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
		assertThat(dto.getPizza()).isNotNull();

	}


	/**
	 * Test for convert a OrderLineDTO null to a OrderLine entity.
	 */
	@Test
	void orderLineDtoNulToEntity() {
		// given
		OrderLineDTO dto = null;

		Order order = new Order((long) 1);

		// when
		OrderLine line = OrderLineMapper.toEntity(dto, order);

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
		for (long i = 0; i < 2; i++) {
			dtos.add(new OrderLineDTO((long) 1, (short) 2 ));
		}

		List<OrderLine> line = new ArrayList<>();

		Order order = new Order((long) 1, new Date(), (double) MagicNumber.SIZESMALL, line, new User());

		// when
		List<OrderLine> lines = OrderLineMapper.listDtoToListEntity(dtos, order);

		// then
		assertThat(lines).isNotNull().hasSameSizeAs(dtos);

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
