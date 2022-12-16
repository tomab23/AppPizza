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
	/**
	 * the id.
	 */

	private Long id;
	/**
	 * the date.
	 */

	private Date date;

	/**
	 * the total.
	 */
	private Double totalAmount;

	/**
	 * the User.
	 */
	private UserDTO user;

	/**
	 * List of OrderLine.
	 */
	private List<Long> lines;

	/**
	 * OrderDTO constructor.
	 */
	public OrderDTO() {
		super();
	}

	/**
	 * @param id    the id
	 * @param date  the date
	 * @param total the total
	 * @param user  the user
	 */
	public OrderDTO(final long id, final Date date, final double total, final UserDTO user) {
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
	public void setId(final Long id) {
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
	public void setDate(final Date date) {
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
	public void setTotalAmount(final Double totalAmount) {
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
	public void setUser(final UserDTO userDTO) {
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
	public void setLines(final List<Long> lines) {
		this.lines = lines;
	}


}
