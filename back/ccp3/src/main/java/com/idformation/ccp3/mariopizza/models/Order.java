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
	 * @param pId   the id of Order
	 * @param pDate  the date of Order
	 * @param total the total of Order
	 * @param pLines the lines of Order
	 * @param pUser  the User of Order
	 */
	public Order(final long pId, final Date pDate, final double total,
			final List<OrderLine> pLines, final User pUser) {
		super();
		this.id = pId;
		this.date = pDate;
		this.totalAmount = total;
		this.lines = pLines;
		this.user = pUser;
	}


	/**
	 * @param pId the id of Order.
	 */
	public Order(final long pId) {
		super();
		this.id = pId;
	}

	/**
	 * @param pId    the id
	 * @param pDate  the date
	 * @param total the total
	 * @param pUser  the user
	 */
	public Order(final long pId,final Date pDate, final double total, final User pUser) {
		super();
		this.id = pId;
		this.date = pDate;
		this.totalAmount = total;
		this.user = pUser;
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
	 * @param pDate the date to set
	 */
	public void setDate(final Date pDate) {
		this.date = pDate;
	}

	/**
	 * @param pId the id to set
	 */
	public void setId(final Long pId) {
		this.id = pId;
	}

	/**
	 * @param pLines the lines to set
	 */
	public void setLines(final List<OrderLine> pLines) {
		this.lines = pLines;
	}

	/**
	 * @param pTotalAmount the totalAmount to set
	 */
	public void setTotalAmount(final Double pTotalAmount) {
		this.totalAmount = pTotalAmount;
	}

	/**
	 * @param pUser the user to set
	 */
	public void setUser(final User pUser) {
		this.user = pUser;
	}
}

