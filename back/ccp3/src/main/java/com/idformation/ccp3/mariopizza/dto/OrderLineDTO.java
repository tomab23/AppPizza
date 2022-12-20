package com.idformation.ccp3.mariopizza.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Stagiaire
 *
 */
public class OrderLineDTO {

	/**
	 * the Pizza in the OrderLine.
	 */
	@JsonProperty("id")
	private Long pizza;

	/**
	 * the quantity of Pizza in the OrderLine.
	 */
	private Short quantity;

	/**
	 * OrderLineDTO Constructor.
	 */
	public OrderLineDTO() {
		super();
	}

	/**
	 * @param pId is pizza
	 * @param pQuantity is quantity
	 */
	public OrderLineDTO(final long pId, final short pQuantity) {
		super();
		this.pizza = pId;
		this.quantity = pQuantity;
	}

	/**
	 * @return the quantity
	 */
	public Short getQuantity() {
		return quantity;
	}

	/**
	 * @param pQuantity the quantity to set
	 */
	public void setQuantity(final Short pQuantity) {
		this.quantity = pQuantity;
	}

	/**
	 * @return the pizza
	 */
	public Long getPizza() {
		return pizza;
	}

	/**
	 * @param pPizza the pizza to set
	 */
	public void setPizza(final Long pPizza) {
		this.pizza = pPizza;
	}
}
