package com.idformation.ccp3.security.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.idformation.ccp3.mariopizza.helpers.MagicNumber;

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
	@Column(length = MagicNumber.SIZESMALL)
	private RoleName name;

	/**
	 * Role constructor.
	 */
	public Role() {
	}

	/**
	 * @param pName
	 */
	public Role(final RoleName pName) {
		this.name = pName;
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
	 * @param pId
	 */
	public void setId(final Integer pId) {
		this.id = pId;
	}

	/**
	 * @param pName
	 */
	public void setName(final RoleName pName) {
		this.name = pName;
	}

}
