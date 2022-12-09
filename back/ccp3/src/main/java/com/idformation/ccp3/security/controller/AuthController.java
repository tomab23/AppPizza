package com.idformation.ccp3.security.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.idformation.ccp3.security.controller.dto.JwtResponse;
import com.idformation.ccp3.security.controller.dto.LoginRequest;
import com.idformation.ccp3.security.dto.UserDTO;
import com.idformation.ccp3.security.jwt.JwtProvider;
import com.idformation.ccp3.security.mapper.UserMapper;
import com.idformation.ccp3.security.models.User;
import com.idformation.ccp3.security.service.IUserService;

@RestController
@CrossOrigin(origins = "http://localhost:19006/", maxAge = 3600)
@RequestMapping("/auth")
public class AuthController {

	@Value("${app.jwtTokenHeader}")
	private String tokenHeader;

	@Autowired
	AuthenticationManager authenticationManager;

	@Autowired
	JwtProvider tokenProvider;

	@Autowired
	IUserService userService;

	/**
	 * 
	 * @param loginRequest, LoginRequest
	 * @return new JwtResponse
	 */
	@PostMapping("/signin")
	public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {

		Authentication authentication = authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));

		SecurityContextHolder.getContext().setAuthentication(authentication);

		String jwt = tokenProvider.generateToken(authentication);

		return ResponseEntity.ok(new JwtResponse(jwt, tokenHeader));
	}

	/**
	 * 
	 * @param user, UserDTO
	 * @return User entity
	 */
	@PostMapping("/add")
	public User setUser(@RequestBody UserDTO user) {
		return userService.saveUser(UserMapper.toEntity(user));
	}

}
