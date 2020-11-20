/**
 * 
 */
package com.cg.capbrading.entity;

import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * This Product Component is used as a data traveler object from layer to layer
 * @author karan
 *
 */

@Entity
@Table(name="VENDOR")
public class Vendor extends Account {
	
	//@OneToMany( mappedBy="vendorId")
	@ManyToMany(cascade = {CascadeType.ALL})
	private List<Product> products;

	/**
	 * @param id
	 * @param name
	 * @param password
	 * @param products
	 */
	public Vendor(int id, String name, String password, List<Product> products) {
		super(id, name, password);
		this.products = products;
	}
	
	public Vendor()
	{
		super();
	}


	/**
	 * @return the products
	 */
	public List<Product> getProducts() {
		return this.products;
	}

	/**
	 * @param products the products to set
	 */
	public void setProducts(List<Product> products) {
		this.products = products;
	}


	@Override
	public String toString() {
		return "Vendor [products=" + products + ", id=" + id + ", name=" + name + ", password=" + password + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(products);
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vendor other = (Vendor) obj;
		return Objects.equals(products, other.products);
	}

	
	
}
	
	
	
	
	
	
	
	
	


