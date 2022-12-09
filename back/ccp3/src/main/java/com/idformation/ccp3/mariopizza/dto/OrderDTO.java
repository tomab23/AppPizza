/**
 * 
 */
package com.idformation.ccp3.mariopizza.dto;

import java.util.Date;
import java.util.List;

import com.idformation.ccp3.security.dto.UserDTO;

/**
 * @author Stagiaire
 *
 */
public class OrderDTO {

	private Long id;
	private Date date;
	private Double totalAmount;
	private UserDTO user;

	private List<Long> lines;

	public OrderDTO() {
		super();
	}

	/**
	 * 
	 * @param id    the id
	 * @param date  the date
	 * @param total the total
	 * @param user  the user
	 */
	public OrderDTO(long id, Date date, double total, UserDTO user) {
		super();
		this.id = id;
		this.date = date;
		this.totalAmount = total;
		this.user = user;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * @return the totalAmount
	 */
	public Double getTotalAmount() {
		return totalAmount;
	}

	/**
	 * @param totalAmount the totalAmount to set
	 */
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	/**
	 * @return the user
	 */
	public UserDTO getUser() {
		return user;
	}

	/**
	 * @param userDTO the user to set
	 */
	public void setUser(UserDTO userDTO) {
		this.user = userDTO;
	}

	/**
	 * @return the lines
	 */
	public List<Long> getLines() {
		return lines;
	}

	/**
	 * @param lines the lines to set
	 */
	public void setLines(List<Long> lines) {
		this.lines = lines;
	}


}
