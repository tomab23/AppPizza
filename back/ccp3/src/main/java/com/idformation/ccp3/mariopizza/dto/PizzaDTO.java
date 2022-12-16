/**
 * 
 */
package com.idformation.ccp3.mariopizza.dto;

/**
 * @author Stagiaire
 *
 */
public class PizzaDTO {

	/**
	 * the id.
	 */
	private Long id;

	/**
	 * the name.
	 */
	private String name;

	/**
	 * the description.
	 */
	private String description;

	/**
	 * the image.
	 */
	private String image;

	/**
	 * the price.
	 */
	private Double price;

	/**
	 * PizzaDTO constructor.
	 */
	public PizzaDTO() {
		super();
	}

	/**
	 * @param id    the id
	 * @param name  the name
	 * @param desc  the description
	 * @param img   the image
	 * @param price the price
	 */
	public PizzaDTO(long id, String name, String desc, String img, double price) {
		super();
		this.id = id;
		this.name = name;
		this.description = desc;
		this.image = img;
		this.price = price;
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(final String name) {
		this.name = name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(final String description) {
		this.description = description;
	}

	/**
	 * @return the image
	 */
	public String getImage() {
		return image;
	}

	/**
	 * @param image the image to set
	 */
	public void setImage(final String image) {
		this.image = image;
	}

	/**
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(final Double price) {
		this.price = price;
	}

}
