package com.idformation.ccp3.security.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.springframework.lang.NonNull;

import com.idformation.ccp3.mariopizza.helpers.MagicNumber;

@Entity
@Table(name = "users")
public class User {

	/**
	 * the id.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/**
	 * the phonenumber.
	 */
	@NonNull
	@Size(max = MagicNumber.SIZESMALL)
	private String phonenumber;

	/**
	 * the password.
	 */
	@NonNull
	@Size(max = MagicNumber.SIZELONG)
	private String password;

	/**
	 * the firstname.
	 */
	@NonNull
	@Size(max = MagicNumber.SIZELONG)
	private String firstname;

	/**
	 * the lastname.
	 */
	@NonNull
	@Size(max = MagicNumber.SIZELONG)
	private String lastname;

	/**
	 * the address.
	 */
	@NonNull
	@Size(max = MagicNumber.SIZELONG)
	private String address;

	/**
	 * the role of User.
	 */
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "user_roles", joinColumns =
	@JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<Role> roles = new HashSet<>();



	/**
	 *
	 */
	public User() {
		super();
	}

	/**
	 * @param pId the id
	 * @param pPhonenumber the phonenumber
	 * @param pPassword the password
	 * @param pFirstname the firstname
	 * @param pLastname the lastname
	 * @param pAddress the adress
	 */
	public User(final Long pId, final @Size(max = MagicNumber.SIZESMALL)
	String pPhonenumber, final @Size(max = MagicNumber.SIZELONG)
	String pPassword,
			final @Size(max = MagicNumber.SIZELONG) String pFirstname,
			final @Size(max = MagicNumber.SIZELONG) String pLastname,
			final @Size(max = MagicNumber.SIZELONG) String pAddress) {
		super();
		this.id = pId;
		this.phonenumber = pPhonenumber;
		this.password = pPassword;
		this.firstname = pFirstname;
		this.lastname = pLastname;
		this.address = pAddress;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @return the phonenumber
	 */
	public String getPhonenumber() {
		return phonenumber;
	}

	/**
	 * @return the roles
	 */
	public Set<Role> getRoles() {
		return roles;
	}

	/**
	 * @param pAddress the address to set
	 */
	public void setAddress(final String pAddress) {
		this.address = pAddress;
	}

	/**
	 * @param pFirstname the firstname to set
	 */
	public void setFirstname(final String pFirstname) {
		this.firstname = pFirstname;
	}

	/**
	 * @param pId the id to set
	 */
	public void setId(final Long pId) {
		this.id = pId;
	}

	/**
	 * @param pLastname the lastname to set
	 */
	public void setLastname(final String pLastname) {
		this.lastname = pLastname;
	}

	/**
	 * @param pPassword the password to set
	 */
	public void setPassword(final String pPassword) {
		this.password = pPassword;
	}

	/**
	 * @param pPhonenumber the phonenumber to set
	 */
	public void setPhonenumber(final String pPhonenumber) {
		this.phonenumber = pPhonenumber;
	}

	/**
	 * @param pRoles the roles to set
	 */
	public void setRoles(final Set<Role> pRoles) {
		this.roles = pRoles;
	}
}
