package com.idformation.ccp3.security.jwt;

import java.security.Key;
import java.util.Base64;
import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import com.idformation.ccp3.security.service.utils.UserPrincipal;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.UnsupportedJwtException;
import io.jsonwebtoken.security.Keys;
import io.jsonwebtoken.security.SignatureException;

@Component
public class JwtProvider {

	/**
	 * secret for JwtProvider.
	 */
	@Value("${app.jwtSecretKey}")
	private String secret;

	/**
	 * jwtExpirationInMs for JwtProvider.
	 */
	@Value("${app.jwtExpirationInMs}")
	private int jwtExpirationInMs;

	/**
	 * key for JwtProvider.
	 */
	private Key key;

//	/**
//	 * logger for JwtProvider.
//	 */
//	private final Log logger = LogFactory.getLog(getClass());

	/**
	 * @return Key
	 */
	private Key getSigningKey() {
		if (key == null) {
			byte[] keyBytes = Base64.getUrlDecoder().decode(this.secret);
			key = Keys.hmacShaKeyFor(keyBytes);
		}
		return key;
	}

	/**
	 * @param authentication
	 * @return Jwts
	 */
	public String generateToken(final Authentication authentication) {
		UserPrincipal userPrincipal = (UserPrincipal) authentication.getPrincipal();
		Date now = new Date();
		Date expiryDate = new Date(now.getTime() + jwtExpirationInMs);

		return Jwts.builder().setSubject(userPrincipal.getUsername())
				.setIssuedAt(new Date()).setExpiration(expiryDate)
				.signWith(getSigningKey(), SignatureAlgorithm.HS512).compact();
	}

	/**
	 * @param token
	 * @return Claims
	 */
	public String getUserUsernameFromJWT(final String token) {
		Claims claims = Jwts.parserBuilder()
				.setSigningKey(getSigningKey()).build().parseClaimsJws(token).getBody();
		return claims.getSubject();
	}

	/**
	 * @param authToken
	 * @return boolean
	 */
	public boolean validateToken(final String authToken) {
		try {
			Jwts.parserBuilder().setSigningKey(getSigningKey()).build().parseClaimsJws(authToken);
			return true;
		} catch (SignatureException ex) {
		} catch (MalformedJwtException ex) {
		} catch (ExpiredJwtException ex) {
		} catch (UnsupportedJwtException ex) {
		} catch (IllegalArgumentException ex) {
		}
		return false;
	}

}
