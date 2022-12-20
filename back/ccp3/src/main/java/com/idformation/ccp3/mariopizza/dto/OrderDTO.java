package com.idformation.ccp3.mariopizza.dto;

import java.util.Date;
import java.util.List;

import com.idformation.ccp3.security.models.User;

/**
 * @author Stagiaire
 *
 */
public class OrderDTO {
	/**
	 * the id of OrderDTO.
	 */

	private Long id;
	/**
	 * the date of OrderDTO.
	 */

	private Date date;

	/**
	 * the total of OrderDTO.
	 */
	private Double totalAmount;

	/**
	 * the User of OrderDTO.
	 */
	private User user;

	/**
	 * List of OrderLineDTO of OrderDTO.
	 */
	private List<OrderLineDTO> lines;

	/**
	 * OrderDTO constructor.
	 */
	public OrderDTO() {
		super();
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param pId the id to set
	 */
	public void setId(final Long pId) {
		this.id = pId;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param pDate the date to set
	 */
	public void setDate(final Date pDate) {
		this.date = pDate;
	}

	/**
	 * @return the totalAmount
	 */
	public Double getTotalAmount() {
		return totalAmount;
	}

	/**
	 * @param pTotalAmount the totalAmount to set
	 */
	public void setTotalAmount(final Double pTotalAmount) {
		this.totalAmount = pTotalAmount;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param userDTO the user to set
	 */
	public void setUser(final User userDTO) {
		this.user = userDTO;
	}

	/**
	 * @return the lines
	 */
	public List<OrderLineDTO> getLines() {
		return lines;
	}

	/**
	 * @param pLines the lines to set
	 */
	public void setLines(final List<OrderLineDTO> pLines) {
		this.lines = pLines;
	}
}
