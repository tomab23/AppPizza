/**
 * 
 */
package com.idformation.ccp3.mariopizza.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idformation.ccp3.mariopizza.models.OrderLine;
import com.idformation.ccp3.mariopizza.repository.IOrderLineRepository;
import com.idformation.ccp3.mariopizza.service.IOrderLineService;

/**
 * @author tomab
 *
 */
@Service
public class OrderLineService implements IOrderLineService {
	
	@Autowired
	IOrderLineRepository lineRepo;

	@Override
	public OrderLine saveOrderLine(OrderLine entity) {
		return lineRepo.saveAndFlush(entity);
	}

}
