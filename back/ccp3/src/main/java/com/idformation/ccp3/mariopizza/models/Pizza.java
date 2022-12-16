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
	 * the id.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/**
	 * the name.
	 */
	@Column
	private String name;

	/**
	 * the description.
	 */
	@Column
	private String description;

	/**
	 * the image.
	 */
	@Column
	private String image;

	/**
	 * the price.
	 */
	@Column
	private Double price;


	/**
	 *
	 */
	public Pizza() {
		super();
	}

	/**
	 * @param id
	 * @param name
	 * @param description
	 * @param image
	 * @param price
	 */
	public Pizza(Long id, String name, String description, String image, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.image = image;
		this.price = price;
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
	 * @param description the description to set
	 */
	public void setDescription(final String description) {
		this.description = description;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(final Long id) {
		this.id = id;
	}

	/**
	 * @param image the image to set
	 */
	public void setImage(final String image) {
		this.image = image;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(final String name) {
		this.name = name;
	}


	/**
	 * @param price the price to set
	 */
	public void setPrice(final Double price) {
		this.price = price;
	}


}
