/**
 * 
 */
package com.idformation.ccp3.mariopizza.dto;

/**
 * @author Stagiaire
 *
 */
public class OrderLineDTO {

	private Long id;
	private Short quantity;

	private OrderDTO order;

	private PizzaDTO pizza;

	public OrderLineDTO() {
		super();
	}

	/**
	 * 
	 * @param i
	 * @param id       the id
	 * @param quantity the quantity
	 */
	public OrderLineDTO(long i, long id, short quantity) {
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
	public void setId(Long id) {
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
	public void setQuantity(Short quantity) {
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
	public void setOrder(OrderDTO order) {
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
	public void setPizza(PizzaDTO pizza) {
		this.pizza = pizza;
	}



}
