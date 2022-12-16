/**
 * 
 */
package com.idformation.ccp3.mariopizza.service;

import com.idformation.ccp3.mariopizza.models.OrderLine;

/**
 * @author Stagiaire
 *
 */
public interface IOrderLineService {

	/**
	 * @param entity OrderLine
	 * @return entity Orderline
	 */
	OrderLine saveLine(OrderLine entity);

}
