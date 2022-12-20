package com.idformation.ccp3.mariopizza.mapper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.idformation.ccp3.mariopizza.dto.OrderDTO;
import com.idformation.ccp3.mariopizza.dto.OrderLineDTO;
import com.idformation.ccp3.mariopizza.models.Order;
import com.idformation.ccp3.mariopizza.models.OrderLine;

/**
 * @author Stagiaire
 *
 */
public class OrderMapper {
	/**
	 * Transform a Order entity to a OrderDTO.
	 * @param order Order entity
	 * @return dto Order entity to OrderDTO
	 */
	public static OrderDTO toDto(final Order order) {
		OrderDTO dto = null;

		if (order != null) {
		dto = new OrderDTO();
		List<OrderLineDTO> lines = OrderLineMapper.listToListDto(order.getLines());

		dto.setId(order.getId());
		dto.setDate(order.getDate());
		dto.setTotalAmount(order.getTotalAmount());
		dto.setLines(lines);
	}

		return dto;
	}

	/**
	 * Transform a OrderDTO to a Order entity.
	 * @param dto OrderDTO
	 * @return order, OrderDTO to Order entity
	 */
	public static Order toEntity(final OrderDTO dto) {
		Order order = null;


		if (dto != null) {
			order = new Order();
			List<OrderLine>lines  = OrderLineMapper.listDtoToListEntity(dto.getLines());

			order.setId(dto.getId());
			order.setDate(new Date());
			order.setUser(dto.getUser());
			order.setTotalAmount(dto.getTotalAmount());
			order.setLines(lines);
	}

		return order;
	}

	/**
	 * Transform a list of Order entity to a list of OrderDTO.
	 * @param orders List of Order entity
	 * @return dtos, List of OrderDTO
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
