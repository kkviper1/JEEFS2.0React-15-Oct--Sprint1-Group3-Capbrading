/**
 * 
 */
package com.cg.capbrading.entity;

import java.util.Objects;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Account superclass defines fields for Employee, Vendor and Admin classes to inherit from
 * Account class does not have it's own table as it is a Mapped Superclass
 * @author karan
 *
 */
@MappedSuperclass
public class Account {
	
	/**
	 * id of the Employee or Vendor or Admin
	 */
	@Id
	protected int id;
	
	/**
	 * Name of the Employee or Vendor or Admin
	 */
	protected String name;
	
	/**
	 * Password of the Employee or Vendor or Admin
	 */
	protected String password;

	/**
	 * @param id 
	 * @param name
	 * @param password
	 */
	public Account(int id, String name, String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
	}
	
	public Account()
	{
		super();
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
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

	@Override
	public int hashCode() {
		return Objects.hash(id, name, password);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return id == other.id && Objects.equals(name, other.name) && Objects.equals(password, other.password);
	}
	
	
	
	
	
	
	

}
