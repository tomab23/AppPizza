package com.idformation.ccp3.mariopizza.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "order_line")
public class OrderLine {

	/**
	 * the id of OrderLine.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/**
	 * the Order of OrderLine.
	 */
	@ManyToOne
	@JoinColumn(name="ord_id", referencedColumnName = "id", nullable = false)
	private Order order;

	/**
	 * the Pizza of OrderLine.
	 */
	@ManyToOne
	@JoinColumn(name="piz_id", referencedColumnName = "id", nullable = false)
	private Pizza pizza;

	/**
	 * the quantity of OrderLine.
	 */
	@Column(name="quantity")
	private Short quantity;

	/**
	 * OrderLine constructor.
	 */
	public OrderLine() {
		super();
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @return the order
	 */
	public Order getOrder() {
		return order;
	}

	/**
	 * @return the pizza
	 */
	public Pizza getPizza() {
		return pizza;
	}

	/**
	 * @return the quantity
	 */
	public Short getQuantity() {
		return quantity;
	}

	/**
	 * @param pId the id to set
	 */
	public void setId(final Long pId) {
		this.id = pId;
	}

	/**
	 * @param pOrder the order to set
	 */
	public void setOrder(final Order pOrder) {
		this.order = pOrder;
	}

	/**
	 * @param pPizza the pizza to set
	 */
	public void setPizza(final Pizza pPizza) {
		this.pizza = pPizza;
	}

	/**
	 * @param pQuantity the quantity to set
	 */
	public void setQuantity(final Short pQuantity) {
		this.quantity = pQuantity;
	}
}
