package com.idformation.ccp3.mariopizza.mapper;

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
	 * Transform a OrderDTO to a Order entity.
	 * @param dto OrderDTO
	 * @return order, OrderDTO to Order entity
	 */
	public static Order toEntity(final OrderDTO dto) {
		Order order = null;


		if (dto != null) {
			order = new Order();
			List<OrderLine>lines  = OrderLineMapper.listDtoToListEntity(dto.getLines(), order);

			order.setId(dto.getId());
			order.setTotalAmount(dto.getTotalAmount());
			order.setLines(lines);
	}

		return order;
	}

}
