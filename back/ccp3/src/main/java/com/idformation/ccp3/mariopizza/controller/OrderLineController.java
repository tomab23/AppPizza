/**
 * 
 */
package com.idformation.ccp3.mariopizza.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.idformation.ccp3.mariopizza.dto.OrderLineDTO;
import com.idformation.ccp3.mariopizza.mapper.OrderLineMapper;
import com.idformation.ccp3.mariopizza.models.OrderLine;
import com.idformation.ccp3.mariopizza.service.IOrderLineService;

/**
 * @author tomab
 *
 */
@RestController
@RequestMapping("/line")
@CrossOrigin(origins = "http://localhost:19006", maxAge = 3600)
public class OrderLineController {
	
	@Autowired
	IOrderLineService lineService;
	
	/**
	 * 
	 * @param line, OrderLineDTO
	 * @return OrderLine entity
	 */
	@PostMapping("/add")
	public OrderLine setOrderLine(@RequestBody OrderLineDTO line) {
//		return userService.saveUser(UserMapper.toEntity(user));
		return lineService.saveOrderLine(OrderLineMapper.toEntity(line));
	}


}
