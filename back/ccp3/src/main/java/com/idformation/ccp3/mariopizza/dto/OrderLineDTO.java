/**
 * 
 */
package com.idformation.ccp3.mariopizza.dto;

/**
 * @author Stagiaire
 *
 */
public class OrderLineDTO {

	/**
	 * the id.
	 */
	private Long id;

	/**
	 * the quantity.
	 */
	private Short quantity;

	/**
	 * the Order.
	 */
	private OrderDTO order;

	/**
	 * the Pizza.
	 */
	private PizzaDTO pizza;

	/**
	 * OrderLine Constructor.
	 */
	public OrderLineDTO() {
		super();
	}

	/**
	 * @param i
	 * @param id       the id
	 * @param quantity the quantity
	 */
	public OrderLineDTO(final long i, final long id, final short quantity) {
		super();
		this.id = id;
		this.quantity = quantity;
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
	 * @return the quantity
	 */
	public Short getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(final Short quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the order
	 */
	public OrderDTO getOrder() {
		return order;
	}

	/**
	 * @param order the order to set
	 */
	public void setOrder(final OrderDTO order) {
		this.order = order;
	}

	/**
	 * @return the pizza
	 */
	public PizzaDTO getPizza() {
		return pizza;
	}

	/**
	 * @param pizza the pizza to set
	 */
	public void setPizza(final PizzaDTO pizza) {
		this.pizza = pizza;
	}



}
