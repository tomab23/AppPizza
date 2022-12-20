/**
 *  interface PizzaService
 */
package com.idformation.ccp3.mariopizza.service;

import java.util.List;

import com.idformation.ccp3.mariopizza.models.Pizza;

/**
 * @author Stagiaire
 *
 */

public interface IPizzaService {

	/**
	 * @return list of pizzas
	 */
	List<Pizza> getPizzas();

}
