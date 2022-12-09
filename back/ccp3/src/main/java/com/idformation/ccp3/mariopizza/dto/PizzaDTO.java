/**
 * 
 */
package com.idformation.ccp3.mariopizza.dto;

/**
 * @author Stagiaire
 *
 */
public class PizzaDTO {

	private Long id;
	private String name;
	private String description;
	private String image;
	private Double price;

	public PizzaDTO() {
		super();
	}

	/**
	 * 
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
	public void setId(Long id) {
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
	public void setName(String name) {
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
	public void setDescription(String description) {
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
	public void setImage(String image) {
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
	public void setPrice(Double price) {
		this.price = price;
	}

}
