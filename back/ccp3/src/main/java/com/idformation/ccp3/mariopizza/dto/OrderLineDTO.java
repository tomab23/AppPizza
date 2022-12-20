package com.idformation.ccp3.mariopizza.dto;

import com.idformation.ccp3.mariopizza.models.Order;
import com.idformation.ccp3.mariopizza.models.Pizza;

/**
 * @author Stagiaire
 *
 */
public class OrderLineDTO {

	/**
	 * the id of OrderLineDTO.
	 */
	private Long id;

	/**
	 * the quantity of OrderLineDTO.
	 */
	private Short quantity;

	/**
	 * the Order of OrderLineDTO.
	 */
	private Order order;

	/**
	 * the Pizza of OrderLineDTO.
	 */
	private Pizza pizza;

	/**
	 * OrderLineDTO Constructor.
	 */
	public OrderLineDTO() {
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
	 * @return the order
	 */
	public Order getOrder() {
		return order;
	}

	/**
	 * @param pOrder the order to set
	 */
	public void setOrder(final Order pOrder) {
		this.order = pOrder;
	}

	/**
	 * @return the pizza
	 */
	public Pizza getPizza() {
		return pizza;
	}

	/**
	 * @param pPizza the pizza to set
	 */
	public void setPizza(final Pizza pPizza) {
		this.pizza = pPizza;
	}
}
