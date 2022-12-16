package com.idformation.ccp3.mariopizza.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.idformation.ccp3.security.models.User;

@Entity
@Table(name = "`order`")
public class Order {

	/**
	 * the id.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/**
	 * the date.
	 */
	@Column(name = "`date`")
	@Temporal(TemporalType.DATE)
	private Date date;

	/**
	 * the total.
	 */
	@Column(name = "total_amount")
	private Double totalAmount = 0.;

	/**
	 * the User.
	 */
	@ManyToOne
	@JoinColumn(name = "usr_id", referencedColumnName = "id")
	private User user;

	/**
	 * the list of OrderLine.
	 */
	@OneToMany(mappedBy = "order", cascade = CascadeType.PERSIST)
	private List<OrderLine> lines;

	/**
	 *
	 */
	public Order() {
		super();
	}

	/**
	 * @param id    the id
	 * @param date  the date
	 * @param total the total
	 * @param lines the lines
	 * @param user  the user
	 */
	public Order(long id, Date date, double total, List<OrderLine> lines, User user) {
		super();
		this.id = id;
		this.date = date;
		this.totalAmount = total;
		this.lines = lines;
		this.user = user;
	}


	/**
	 * @param id the id
	 */
	public Order(final long id) {
		super();
		this.id = id;
	}

	/**
	 * @param id    the id
	 * @param date  the date
	 * @param total the total
	 * @param user  the user
	 */
	public Order(long id, Date date, double total, User user) {
		super();
		this.id = id;
		this.date = date;
		this.totalAmount = total;
		this.user = user;
	}

	/**
	 * @param line the lines to set
	 */
	public void addLine(final OrderLine line) {
		if (lines == null) {
			lines = new ArrayList<>();
		}

		line.setOrder(this);
		lines.add(line);
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @return the lines
	 */
	public List<OrderLine> getLines() {
		return lines;
	}

	/**
	 * @return the totalAmount
	 */
	public Double getTotalAmount() {
		return totalAmount;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(final Date date) {
		this.date = date;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(final Long id) {
		this.id = id;
	}

	/**
	 * @param lines the lines to set
	 */
	public void setLines(final List<OrderLine> lines) {
		this.lines = lines;
	}

	/**
	 * @param totalAmount the totalAmount to set
	 */
	public void setTotalAmount(final Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(final User user) {
		this.user = user;
	}



}