/**
 *  Order service
 */
package com.idformation.ccp3.mariopizza.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idformation.ccp3.mariopizza.models.Order;
import com.idformation.ccp3.mariopizza.repository.IOrderRepository;
import com.idformation.ccp3.mariopizza.service.IOrderService;

/**
 * @author Stagiaire
 *
 */
@Service("OrderService")
public class OrderService implements IOrderService {

	/**
	 * call interface Order repository.
	 */
	@Autowired
	private IOrderRepository orderRepo;

	/**
	 * new Order.
	 */
	@Override
	public Order saveOrder(final Order order) {
		return orderRepo.saveAndFlush(order);
	}
}
