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
 * @author Stagiaire
 *
 */
@Service("OrderLineService")
public class OrderLineService implements IOrderLineService {

	@Autowired
	private IOrderLineRepository lineRepo;

	@Override
	public OrderLine saveLine(OrderLine entity) {
		return lineRepo.saveAndFlush(entity);
	}

}
