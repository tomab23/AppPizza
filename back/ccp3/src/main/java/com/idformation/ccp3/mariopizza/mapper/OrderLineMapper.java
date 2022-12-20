package com.idformation.ccp3.mariopizza.mapper;

import java.util.ArrayList;
import java.util.List;

import com.idformation.ccp3.mariopizza.dto.OrderLineDTO;
import com.idformation.ccp3.mariopizza.models.Order;
import com.idformation.ccp3.mariopizza.models.OrderLine;
import com.idformation.ccp3.mariopizza.models.Pizza;

/**
 * @author Stagiaire
 *
 */
public class OrderLineMapper {

	/**
	 * Transform OrderLineDTO to OrderLine entity.
	 * @param dto OrderLineDTO.
	 * @param order Order entity
	 * @return orderLine orderLine entity
	 */
	public static OrderLine toEntity(final OrderLineDTO dto, final Order order) {
		OrderLine orderLine = null;

		if (dto != null) {
			orderLine = new OrderLine();
			orderLine.setPizza(new Pizza(dto.getPizza()));
			orderLine.setQuantity(dto.getQuantity());
			orderLine.setOrder(order);

	}
		return orderLine;
	}

	/**
	 * Transform a list of OrderLineDTO to a list of OrderLine entity.
	 * @param dtos List of OrderLineDTO
	 * @param order Order entity
	 * @return lines List of OrderLine entity
	 */
	public static List<OrderLine> listDtoToListEntity(final List<OrderLineDTO> dtos, final Order order) {
		List<OrderLine> lines = null;

		if (dtos != null && !dtos.isEmpty()) {
			lines = new ArrayList<>();

			for (OrderLineDTO ol : dtos) {
				lines.add(toEntity(ol, order));
			}
		}
		return lines;
	}

}
