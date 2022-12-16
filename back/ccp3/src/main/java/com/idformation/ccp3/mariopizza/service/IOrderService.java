package com.idformation.ccp3.mariopizza.service;

import com.idformation.ccp3.mariopizza.models.Order;

public interface IOrderService {

	/**
	 * @param order
	 * @return entity Order
	 */
	Order saveOrder(Order order);

}
