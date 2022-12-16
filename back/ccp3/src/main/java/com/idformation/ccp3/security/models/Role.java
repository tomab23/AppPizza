package com.idformation.ccp3.security.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "roles")
public class Role {

	/**
	 * the id.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	/**
	 * the name.
	 */
	@Enumerated(EnumType.STRING)
	@Column(length = 20)
	private RoleName name;

	/**
	 * Role constructor.
	 */
	public Role() {
	}

	/**
	 * @param name
	 */
	public Role(final RoleName name) {
		this.name = name;
	}

	/**
	 * @return id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @return name
	 */
	public RoleName getName() {
		return name;
	}

	/**
	 * @param id
	 */
	public void setId(final Integer id) {
		this.id = id;
	}

	/**
	 * @param name
	 */
	public void setName(final RoleName name) {
		this.name = name;
	}

}
