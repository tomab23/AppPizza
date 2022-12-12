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
import com.idformation.ccp3.mariopizza.service.IOrderService;
import com.idformation.ccp3.mariopizza.service.IPizzaService;
import com.idformation.ccp3.security.jwt.JwtAuthenticationFilter;
import com.idformation.ccp3.security.jwt.JwtProvider;
import com.idformation.ccp3.security.service.UserDetailsServiceImpl;

/**
 * @author Stagiaire
 *
 */

@RestController
@RequestMapping("/pizza")
@CrossOrigin(origins = "http://localhost:19006", maxAge = 3600)
public class PizzaController {

	@Autowired
	private IPizzaService pizzaService;

	@Autowired
	private IOrderService orderService;

	@Autowired
	private JwtProvider jwtProvider;

	@Autowired
	private JwtAuthenticationFilter jwtAuthenticationFilter;

	@Autowired
	private UserDetailsServiceImpl userService;
	


	/**
	 * 
	 * @return List of all Pizza
	 */
	@GetMapping("/")
	public List<PizzaDTO> getAllPizzas() {
		return PizzaMapper.ListToListDto(pizzaService.getPizzas());
	}

//	@PostMapping
//	void saveOrder(@RequestBody List<OrderDTO> orders, HttpServletRequest request) {
//
//		// 1: On identifie le user par le jwt
//	(loadUserByUsername ? )
//		User user = userService.loadUserByUsername(
//				jwtProvider.getUserUsernameFromJWT(jwtAuthenticationFilter.getJwtFromRequest(request)));
//
//		// 2: creation order pour le requestBody
//		Order order = OrderMapper.toEntity(orders);
//		order.setUser(user)
//
//		// 3: sauvegarder order
//		orderService.saveOrder(order);
//	}

}
