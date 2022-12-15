/**
 * 
 */
package com.idformation.ccp3.mariopizza.mapper;

import java.util.ArrayList;
import java.util.List;

import com.idformation.ccp3.mariopizza.dto.OrderLineDTO;
import com.idformation.ccp3.mariopizza.models.OrderLine;

/**
 * @author Stagiaire
 *
 */
public class OrderLineMapper {

	/**
	 * 
	 * @param orderLine, OrderLine entity
	 * @return dto, OrderLine to OrderLineDTO
	 */
	public static OrderLineDTO toDto(OrderLine orderLine) {
		OrderLineDTO dto = null;



		if (orderLine != null) {
			dto = new OrderLineDTO();
		dto.setId(orderLine.getId());
		dto.setQuantity(orderLine.getQuantity());
//		dto.setPizza(PizzaMapper.toDto(orderLine.getPizza()));
//		dto.setOrder(OrderMapper.toDto(orderLine.getOrder()));

	}
		return dto;
	}

	/**
	 * 
	 * @param dto, OrderLineDTO
	 * @return orderLine, OrderLineDTO to orderLine entity
	 */
	public static OrderLine toEntity(OrderLineDTO dto) {
		OrderLine orderLine = null;

		if (dto != null) {
		orderLine = new OrderLine();
		orderLine.setId(dto.getId());
		orderLine.setQuantity(dto.getQuantity());
//		orderLine.setPizza(PizzaMapper.toEntity(dto.getPizza()));
//		orderLine.setOrder(OrderMapper.toEntity(dto.getOrder()));
	}
		return orderLine;
	}

	/**
	 * 
	 * @param orderLines, List of OrderLine entity
	 * @return dtos, List of OrderLine to list of OrderLineDTO
	 */
	public static List<OrderLineDTO> ListToListDto(List<OrderLine> orderLines) {
		List<OrderLineDTO> dtos = null;

		if (orderLines != null && !orderLines.isEmpty()) {
			dtos = new ArrayList<>();

			for (OrderLine ol : orderLines) {
				dtos.add(toDto(ol));
			}
		}

		return dtos;
	}
	
	
	

}
