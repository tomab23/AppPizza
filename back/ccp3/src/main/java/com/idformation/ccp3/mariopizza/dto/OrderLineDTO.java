package com.idformation.ccp3.mariopizza.dto;

/**
 * @author Stagiaire
 *
 */
public class OrderLineDTO {

	/**
	 * the Pizza in the OrderLine.
	 */
	private Long pizza;

	/**
	 * the quantity of Pizza in the OrderLine.
	 */
	private Short quantity;

//	/**
//	 * the Order of OrderLineDTO.
//	 */
//	private Order order;
//
//	/**
//	 * the Pizza of OrderLineDTO.
//	 */
//	private Pizza pizza;

	/**
	 * OrderLineDTO Constructor.
	 */
	public OrderLineDTO() {
		super();
	}

//	/**
//	 * @return the id
//	 */
//	public Long getId() {
//		return id;
//	}
//
//	/**
//	 * @param pId the id to set
//	 */
//	public void setId(final Long pId) {
//		this.id = pId;
//	}

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

//	/**
//	 * @return the order
//	 */
//	public Order getOrder() {
//		return order;
//	}
//
//	/**
//	 * @param pOrder the order to set
//	 */
//	public void setOrder(final Order pOrder) {
//		this.order = pOrder;
//	}

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
