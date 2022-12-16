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

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name="ord_id", referencedColumnName = "id", nullable = false)
	private Order order;

	@ManyToOne
	@JoinColumn(name="piz_id", referencedColumnName = "id", nullable = false)
	private Pizza pizza;

	@Column(name="quantity")
	private Short quantity;

	public OrderLine() {
		super();
	}

	/**
	 * @param line
	 *
	 */
	public OrderLine(Long id) {
		super();
		this.id = id;
	}

	public OrderLine(long i, long id, short quantity) {
		super();
		this.id = id;
		this.quantity = quantity;
	}

	public OrderLine(long id, short s, Pizza pizza, Order order) {
		super();
		this.id = id;
		this.quantity = s;
		this.pizza = pizza;
		this.order = order;
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
	 * @param id the id to set
	 */
	public void setId(final Long id) {
		this.id = id;
	}

	/**
	 * @param order the order to set
	 */
	public void setOrder(final Order order) {
		this.order = order;
	}

	/**
	 * @param pizza the pizza to set
	 */
	public void setPizza(final Pizza pizza) {
		this.pizza = pizza;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(final Short quantity) {
		this.quantity = quantity;
	}



}
