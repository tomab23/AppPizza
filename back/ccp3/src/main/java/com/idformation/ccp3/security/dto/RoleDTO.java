/**
 *  RoleDTO dto about Role
 */
package com.idformation.ccp3.security.dto;

import com.idformation.ccp3.security.models.RoleName;

/**
 * @author Stagiaire
 *
 */
public class RoleDTO {

	/**
	 * the id of the RoleDTO.
	 */
	private Integer id;

	/**
	 * the name of the RoleDTO.
	 */
	private RoleName name;

	/**
	 * RoleDTO constructor.
	 */
	public RoleDTO() {
		super();
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param pId the id to set
	 */
	public void setId(final Integer pId) {
		this.id = pId;
	}

	/**
	 * @return the name
	 */
	public RoleName getName() {
		return name;
	}

	/**
	 * @param pName the name to set
	 */
	public void setName(final RoleName pName) {
		this.name = pName;
	}
}
