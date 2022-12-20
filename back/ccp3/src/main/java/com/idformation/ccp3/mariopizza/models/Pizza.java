package com.idformation.ccp3.mariopizza.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pizza")
public class Pizza {

	/**
	 * the id of the Pizza.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/**
	 * the name of the Pizza.
	 */
	@Column
	private String name;

	/**
	 * the description of the Pizza.
	 */
	@Column
	private String description;

	/**
	 * the image of the Pizza.
	 */
	@Column
	private String image;

	/**
	 * the price of the Pizza.
	 */
	@Column
	private Double price;


	/**
	 * Pizza constructor.
	 */
	public Pizza() {
		super();
	}

	/**
	 * @param id2 is the id of the Pizza
	 */
	public Pizza(final Long id2) {
		super();
		this.id = id2;
	}

	/**
	 * @param pId is the id of the Pizza
	 * @param pName is the name of the Pizza
	 * @param pDescription is the description of the Pizza
	 * @param pImage is the image of the Pizza
	 * @param pPrice is the price of the Pizza
	 */
	public Pizza(final Long pId, final String pName, final String pDescription,
			final String pImage, final Double pPrice) {
		super();
		this.id = pId;
		this.name = pName;
		this.description = pDescription;
		this.image = pImage;
		this.price = pPrice;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @return the image
	 */
	public String getImage() {
		return image;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}

	/**
	 * @param pDescription the description to set
	 */
	public void setDescription(final String pDescription) {
		this.description = pDescription;
	}

	/**
	 * @param pId the id to set
	 */
	public void setId(final Long pId) {
		this.id = pId;
	}

	/**
	 * @param pImage the image to set
	 */
	public void setImage(final String pImage) {
		this.image = pImage;
	}

	/**
	 * @param pName the name to set
	 */
	public void setName(final String pName) {
		this.name = pName;
	}

	/**
	 * @param pPrice the price to set
	 */
	public void setPrice(final Double pPrice) {
		this.price = pPrice;
	}
}
