/**
 * 
 */
package com.idformation.ccp3.mariopizza.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.idformation.ccp3.mariopizza.dto.PizzaDTO;
import com.idformation.ccp3.mariopizza.mapper.PizzaMapper;
import com.idformation.ccp3.mariopizza.service.IPizzaService;

/**
 * @author Stagiaire
 *
 */

@RestController
@RequestMapping("/pizza")
@CrossOrigin(origins = "http://localhost:19006", maxAge = 3600)
public class PizzaController {

	@Autowired
	IPizzaService pizzaService;

	/**
	 * 
	 * @return List of all Pizza
	 */
	@GetMapping("/")
	public List<PizzaDTO> getAllPizzas() {
		return PizzaMapper.ListToListDto(pizzaService.getPizzas());
	}

}
