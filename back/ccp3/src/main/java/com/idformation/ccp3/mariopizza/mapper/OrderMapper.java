/**
 * 
 */
package com.idformation.ccp3.mariopizza.mapper;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.idformation.ccp3.mariopizza.dto.OrderDTO;
import com.idformation.ccp3.mariopizza.models.Order;
import com.idformation.ccp3.mariopizza.models.OrderLine;

/**
 * @author Stagiaire
 *
 */
public class OrderMapper {


	/**
	 * @author Stagiaire
	 * @param order Order entity
	 * @return dto Order entity to OrderDTO
	 */
	public static OrderDTO toDto(final Order order) {
		OrderDTO dto = null;

		if (order != null) {
		dto = new OrderDTO();
		dto.setId(order.getId());
		dto.setDate(order.getDate());
		dto.setTotalAmount(order.getTotalAmount());
//		dto.setUser(UserMapper.toDto(order.getUser()));

		List<Long> orderlines = new ArrayList<Long>();
		for (OrderLine ol : order.getLines()) {
			orderlines.add(ol.getId());
		}

		dto.setLines(orderlines);
	}

		return dto;
	}

	/**
	 * @author Stagiaire
	 * @param dto OrderDTO
	 * @return order, OrderDTO to Order entity
	 */
	public static Order toEntity(final OrderDTO dto) {
		Order order = null;


		if (dto != null) {
			order = new Order();
//		order.setId(dto.getId());
			order.setDate(new Date(0));
//		order.setTotalAmount(dto.getTotalAmount());

		for (Long line : dto.getLines()) {
			order.addLine(new OrderLine(line));
		}
	}

		return order;
	}

	/**
	 * @author Stagiaire
	 * @param orders List of Order entity
	 * @return dtos, List of Order entity to Order dto
	 */
	public static List<OrderDTO> listToListDto(final List<Order> orders) {
		List<OrderDTO> dtos = null;

		if (orders != null && !orders.isEmpty()) {
			dtos = new ArrayList<>();

			for (Order o : orders) {
				dtos.add(toDto(o));
			}
		}

		return dtos;
	}

}
