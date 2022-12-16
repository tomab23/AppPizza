/**
 * 
 */
package com.idformation.ccp3.mariopizza.controller;

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
import com.idformation.ccp3.mariopizza.dto.OrderLineDTO;
import com.idformation.ccp3.mariopizza.dto.PizzaDTO;
import com.idformation.ccp3.mariopizza.mapper.OrderLineMapper;
import com.idformation.ccp3.mariopizza.mapper.OrderMapper;
import com.idformation.ccp3.mariopizza.mapper.PizzaMapper;
import com.idformation.ccp3.mariopizza.models.Order;
import com.idformation.ccp3.mariopizza.models.OrderLine;
import com.idformation.ccp3.mariopizza.service.IOrderService;
import com.idformation.ccp3.mariopizza.service.IPizzaService;
import com.idformation.ccp3.mariopizza.service.impl.OrderLineService;
import com.idformation.ccp3.security.jwt.JwtAuthenticationFilter;
import com.idformation.ccp3.security.jwt.JwtProvider;
import com.idformation.ccp3.security.models.User;
import com.idformation.ccp3.security.service.UserService;

/**
 * @author Stagiaire
 *
 */

@RestController
@RequestMapping("/pizza")
@CrossOrigin(origins = "http://localhost:19006", maxAge = 3600)
public class PizzaController {

	/**
	 * @author Stagiaire call Interface Pizza service.
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

//	@Autowired
//	private UserDetailsServiceImpl userService;

	/**
	 * call User service.
	 */
	@Autowired
	private UserService useService;

	/**
	 * call OrderLine service.
	 */
	@Autowired
	private OrderLineService lineService;



	/**
	 * @author Stagiaire
	 * @return List of all Pizza
	 */
	@GetMapping("/")
	public List<PizzaDTO> getAllPizzas() {
		return PizzaMapper.ListToListDto(pizzaService.getPizzas());
	}

	/**
	 * @author Stagiaire
	 * @param orders
	 * @param request
	 */
	@PostMapping("/userOrder")
	void saveOrder(@RequestBody final OrderDTO orders, final HttpServletRequest request) {

		// 1: On identifie le user par le jwt
		User user = useService.findByPhonenumber(
				jwtProvider.getUserUsernameFromJWT(jwtAuthenticationFilter.getJwtFromRequest(request))).get();

		// 2: creation order pour le requestBody
		Order order = OrderMapper.toEntity(orders);
		order.setUser(user);

//		 3: sauvegarder order
		orderService.saveOrder(order);
	}

	/**
	 * @author Stagiaire
	 * @param dto OrderLineDTO
	 * @return entity Orderline
	 */
	@PostMapping("/add/line")
	public OrderLine addLines(@RequestBody final OrderLineDTO dto) {
		return lineService.saveLine(OrderLineMapper.toEntity(dto));
	}

	/**
	 * @author Stagiaire
	 * @param dto OrderDTO
	 * @return entity Order entity
	 */
	@PostMapping("/add/order")
	public Order addOrder(@RequestBody final OrderDTO dto) {
		return orderService.saveOrder(OrderMapper.toEntity(dto));
	}

}
