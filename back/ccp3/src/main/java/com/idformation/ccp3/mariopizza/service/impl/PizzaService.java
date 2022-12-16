/**
 * 
 */
package com.idformation.ccp3.mariopizza.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idformation.ccp3.mariopizza.models.Pizza;
import com.idformation.ccp3.mariopizza.repository.IPizzaRepository;
import com.idformation.ccp3.mariopizza.service.IPizzaService;

/**
 * @author Stagiaire
 *
 */

@Service("PizzaService")
public class PizzaService implements IPizzaService {

	/**
	 * call Interface Pizza repository.
	 */
	@Autowired
	private IPizzaRepository pizzaRepo;


	/**
	 * get list of pizzas.
	 */
	@Override
	public List<Pizza> getPizzas() {
		return pizzaRepo.findAll();
	}

}
