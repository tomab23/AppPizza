/**
 * 
 */
package com.idformation.ccp3.security.dto;

import java.util.HashSet;
import java.util.Set;

import com.idformation.ccp3.security.models.Role;

/**
 * @author Stagiaire
 *
 */
public class UserDTO {

	/**
	 * the id.
	 */
	private Long id;

	/**
	 * the phonenumber.
	 */
	private String phonenumber;

	/**
	 * the password.
	 */
	private String password;

	/**
	 * the firstname.
	 */
	private String firstname;

	/**
	 * the lastname.
	 */
	private String lastname;

	/**
	 * the address.
	 */
	private String address;

	/**
	 * the role of User.
	 */
	private Set<Role> roles = new HashSet<>();

	/**
	 * UserDTO constructor.
	 */
	public UserDTO() {
		super();
	}

	/**
	 * @param id          the id
	 * @param phonenumber the phonenumber
	 * @param password    the password
	 * @param firstname   the firstname
	 * @param lastname    the lastname
	 * @param address     the address
	 */
	public UserDTO(long id, String phonenumber, String password, String firstname, String lastname, String address) {
		super();
		this.id = id;
		this.phonenumber = phonenumber;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
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
	 * @return the phonenumber
	 */
	public String getPhonenumber() {
		return phonenumber;
	}

	/**
	 * @param phonenumber the phonenumber to set
	 */
	public void setPhonenumber(final String phonenumber) {
		this.phonenumber = phonenumber;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(final String lastname) {
		this.lastname = lastname;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(final String address) {
		this.address = address;
	}

	/**
	 * @return the roles
	 */
	public Set<Role> getRoles() {
		return roles;
	}

	/**
	 * @param roles the roles to set
	 */
	public void setRoles(final Set<Role> roles) {
		this.roles = roles;
	}

}
