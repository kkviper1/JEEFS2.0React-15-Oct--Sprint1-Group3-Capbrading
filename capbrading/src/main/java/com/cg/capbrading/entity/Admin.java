/**
 * 
 */
package com.cg.capbrading.entity;

/**
 * @author karan
 *
 */
public class Admin extends Account {

	/**
	 * @param id
	 * @param name
	 * @param password
	 */
	public Admin(int id, String name, String password) {
		super(id, name, password);
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Admin [id=" + id + ", name=" + name + ", password=" + password + "]";
	}

	
}
