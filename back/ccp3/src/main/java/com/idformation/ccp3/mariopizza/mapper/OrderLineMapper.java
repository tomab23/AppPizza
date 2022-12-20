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

///**
//	 * Transform OrderLine entity to OrderLineDTO.
//	 * @param orderLine OrderLine entity.
//	 * @return dto OrderLine to OrderLineDTO
//	 */
//	public static OrderLineDTO toDto(final OrderLine orderLine) {
//		OrderLineDTO dto = null;
//
//
//
//		if (orderLine != null) {
//			dto = new OrderLineDTO();
//			dto.setId(orderLine.getId());
//			dto.setQuantity(orderLine.getQuantity());
//			dto.setPizza(orderLine.getPizza());
//			dto.setOrder(orderLine.getOrder());
//
//	}
//		return dto;
//	}

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
			orderLine.setOrder(order);
			orderLine.setPizza(new Pizza(dto.getPizza()));
			orderLine.setQuantity(dto.getQuantity());

	}
		return orderLine;
	}

//	/**
//	 * Transform a list of OrderLine entity to list of OrderLineDTO.
//	 * @param lines List of OrderLine entity
//	 * @return dtos list of OrderLineDTO
//	 */
//	public static List<OrderLineDTO> listToListDto(final List<OrderLine> lines) {
//		List<OrderLineDTO> dtos = null;
//
//		if (lines != null && !lines.isEmpty()) {
//			dtos = new ArrayList<>();
//
//			for (OrderLine ol : lines) {
//				dtos.add(toDto(ol));
//			}
//		}
//
//		return dtos;
//	}

	/**
	 * Transform a list of OrderLineDTO to list of OrderLine entity.
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
