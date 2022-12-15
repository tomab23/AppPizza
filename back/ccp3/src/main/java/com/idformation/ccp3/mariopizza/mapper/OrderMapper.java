/**
 * 
 */
package com.idformation.ccp3.mariopizza.mapper;

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
	 * 
	 * @param order, Order entity
	 * @return dto, Order entity to OrderDTO
	 */
	public static OrderDTO toDto(Order order) {
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
	 * 
	 * @param dto, OrderDTO
	 * @return order, OrderDTO to Order entity
	 */
	public static Order toEntity(OrderDTO dto) {
		Order order = null;


		if (dto != null) {
			order = new Order();
		order.setId(dto.getId());
		order.setDate(dto.getDate());
		order.setTotalAmount(dto.getTotalAmount());
//		order.setUser(UserMapper.toEntity(dto.getUser()));

		for (Long line : dto.getLines()) {
			order.addLine(new OrderLine(line));
		}
	}

		return order;
	}

	/**
	 * 
	 * @param orders, List of Order entity
	 * @return dtos, List of Order entity to Order dto
	 */
	public static List<OrderDTO> ListToListDto(List<Order> orders) {
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
