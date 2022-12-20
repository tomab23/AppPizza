/**
 *  PizzaDTO a dto about Pizza entity
 */
package com.idformation.ccp3.mariopizza.dto;

/**
 * @author Stagiaire
 *
 */
public class PizzaDTO {

	/**
	 * the id of the PizzaDTO.
	 */
	private Long id;

	/**
	 * the name of the PizzaDTO.
	 */
	private String name;

	/**
	 * the description of the PizzaDTO.
	 */
	private String description;

	/**
	 * the image of the PizzaDTO.
	 */
	private String image;

	/**
	 * the price of the PizzaDTO.
	 */
	private Double price;

	/**
	 * PizzaDTO constructor.
	 */
	public PizzaDTO() {
		super();
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param pId the id to set
	 */
	public void setId(final Long pId) {
		this.id = pId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param pName the name to set
	 */
	public void setName(final String pName) {
		this.name = pName;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param pDescription the description to set
	 */
	public void setDescription(final String pDescription) {
		this.description = pDescription;
	}

	/**
	 * @return the image
	 */
	public String getImage() {
		return image;
	}

	/**
	 * @param pImage the image to set
	 */
	public void setImage(final String pImage) {
		this.image = pImage;
	}

	/**
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}

	/**
	 * @param pPrice the price to set
	 */
	public void setPrice(final Double pPrice) {
		this.price = pPrice;
	}

}
