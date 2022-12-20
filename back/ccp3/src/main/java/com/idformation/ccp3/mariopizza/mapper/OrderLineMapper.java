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
	 * Transform OrderLine entity to OrderLineDTO.
	 * @param orderLine OrderLine entity.
	 * @return dto OrderLine to OrderLineDTO
	 */
	public static OrderLineDTO toDto(final OrderLine orderLine) {
		OrderLineDTO dto = null;



		if (orderLine != null) {
			dto = new OrderLineDTO();
			dto.setId(orderLine.getId());
			dto.setQuantity(orderLine.getQuantity());
			dto.setPizza(orderLine.getPizza());
			dto.setOrder(orderLine.getOrder());

	}
		return dto;
	}

	/**
	 * Transform OrderLineDTO to OrderLine entity.
	 * @param dto OrderLineDTO.
	 * @return orderLine orderLine entity
	 */
	public static OrderLine toEntity(final OrderLineDTO dto) {
		OrderLine orderLine = null;

		if (dto != null) {
			orderLine = new OrderLine();
			orderLine.setId(dto.getId());
			orderLine.setQuantity(dto.getQuantity());
			orderLine.setPizza(dto.getPizza());
			orderLine.setOrder(dto.getOrder());
	}
		return orderLine;
	}

	/**
	 * Transform a list of OrderLine entity to list of OrderLineDTO.
	 * @param lines List of OrderLine entity
	 * @return dtos list of OrderLineDTO
	 */
	public static List<OrderLineDTO> listToListDto(final List<OrderLine> lines) {
		List<OrderLineDTO> dtos = null;

		if (lines != null && !lines.isEmpty()) {
			dtos = new ArrayList<>();

			for (OrderLine ol : lines) {
				dtos.add(toDto(ol));
			}
		}

		return dtos;
	}

	/**
	 * Transform a list of OrderLineDTO to list of OrderLine entity.
	 * @param dtos List of OrderLineDTO
	 * @return lines List of OrderLine entity
	 */
	public static List<OrderLine> listDtoToListEntity(final List<OrderLineDTO> dtos) {
		List<OrderLine> lines = null;

		if (dtos != null && !dtos.isEmpty()) {
			lines = new ArrayList<>();

			for (OrderLineDTO ol : dtos) {
				lines.add(toEntity(ol));
			}
		}

		return lines;
	}

}
