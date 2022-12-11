/**
 * 
 */
package com.idformation.ccp3.mariopizza.service;

import com.idformation.ccp3.mariopizza.models.OrderLine;

/**
 * @author tomab
 *
 */
public interface IOrderLineService {

	OrderLine saveOrderLine(OrderLine entity);

}
