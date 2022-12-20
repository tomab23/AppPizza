/**
 *  UserDTO dto about User
 */
package com.idformation.ccp3.security.dto;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Stagiaire
 *
 */
public class UserDTO {

	/**
	 * the id of UserDTO.
	 */
	private Long id;

	/**
	 * the phonenumber of UserDTO.
	 */
	private String phonenumber;

	/**
	 * the password of UserDTO.
	 */
	private String password;

	/**
	 * the firstname of UserDTO.
	 */
	private String firstname;

	/**
	 * the lastname of UserDTO.
	 */
	private String lastname;

	/**
	 * the address of UserDTO.
	 */
	private String address;

	/**
	 * the role of User.
	 */
	private Set<RoleDTO> roles = new HashSet<>();

	/**
	 * UserDTO constructor.
	 */
	public UserDTO() {
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
	 * @return the phonenumber
	 */
	public String getPhonenumber() {
		return phonenumber;
	}

	/**
	 * @param pPhonenumber the phonenumber to set
	 */
	public void setPhonenumber(final String pPhonenumber) {
		this.phonenumber = pPhonenumber;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param pPassword the password to set
	 */
	public void setPassword(final String pPassword) {
		this.password = pPassword;
	}

	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * @param pFirstname the firstname to set
	 */
	public void setFirstname(final String pFirstname) {
		this.firstname = pFirstname;
	}

	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * @param pLastname the lastname to set
	 */
	public void setLastname(final String pLastname) {
		this.lastname = pLastname;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param pAddress the address to set
	 */
	public void setAddress(final String pAddress) {
		this.address = pAddress;
	}

	/**
	 * @return the roles
	 */
	public Set<RoleDTO> getRoles() {
		return roles;
	}

	/**
	 * @param pRoles the roles to set
	 */
	public void setRoles(final Set<RoleDTO> pRoles) {
		this.roles = pRoles;
	}
}
