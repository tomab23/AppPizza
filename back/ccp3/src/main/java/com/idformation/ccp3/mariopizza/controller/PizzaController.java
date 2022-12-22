/**
 *  Controller principal
 */
package com.idformation.ccp3.mariopizza.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.idformation.ccp3.mariopizza.dto.OrderDTO;
import com.idformation.ccp3.mariopizza.dto.PizzaDTO;
import com.idformation.ccp3.mariopizza.helpers.MagicNumber;
import com.idformation.ccp3.mariopizza.mapper.OrderMapper;
import com.idformation.ccp3.mariopizza.mapper.PizzaMapper;
import com.idformation.ccp3.mariopizza.models.Order;
import com.idformation.ccp3.mariopizza.service.IOrderService;
import com.idformation.ccp3.mariopizza.service.IPizzaService;
import com.idformation.ccp3.security.jwt.JwtAuthenticationFilter;
import com.idformation.ccp3.security.jwt.JwtProvider;
import com.idformation.ccp3.security.models.User;
import com.idformation.ccp3.security.service.IUserService;

/**
 * @author Stagiaire
 *
 */

@RestController
@RequestMapping("/pizza")
@CrossOrigin(origins = "http://localhost:19006", maxAge = MagicNumber.ORIGIN)
public class PizzaController {

	/**
	 * call Interface Pizza service.
	 */
	@Autowired
	private IPizzaService pizzaService;

	/**
	 * call Interface Order service.
	 */
	@Autowired
	private IOrderService orderService;

	/**
	 * call JwtProvider.
	 */
	@Autowired
	private JwtProvider jwtProvider;

	/**
	 * call JwtAuthenticationFilter.
	 */
	@Autowired
	private JwtAuthenticationFilter jwtAuthenticationFilter;

	/**
	 * call User service.
	 */
	@Autowired
	private IUserService userService;




	/**
	 * @author Stagiaire
	 * @return List of all Pizza
	 */
	@GetMapping("/")
	public List<PizzaDTO> getAllPizzas() {
		return PizzaMapper.listToListDto(pizzaService.getPizzas());
	}

	/**
	 * @author Stagiaire
	 * @param orders
	 * @param request
	 */
	@PostMapping("/userOrder")
	void saveOrder(@RequestBody final OrderDTO orders, final HttpServletRequest request) {

		// 1: identify the User with Jwt
		User user = userService.findByUsername(
				jwtProvider.getUserUsernameFromJWT(
						jwtAuthenticationFilter.getJwtFromRequest(request))).get();

		// 2: creation order for the requestBody
		Order order = OrderMapper.toEntity(orders);
		order.setUser(user);
		order.setDate(new Date());

//		 3: save order
		orderService.saveOrder(order);
	}
}
