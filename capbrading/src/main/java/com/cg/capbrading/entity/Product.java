/**
 * 
 */
package com.cg.capbrading.entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;

/**
 * This Product Component is used as a data traveler object from layer to layer
 * 
 * @author karan
 *
 */
@Entity
@Table(name="PRODUCT")
public class Product {
	
	/**
	 * Auto-generated Id as primary key
	 */
	@Id
	@GeneratedValue
	private int productId;
	
	/**
	 * Name of the product
	 */
	private String productName;
	
	/**
	 * Brand of the product
	 */
	private String brand;
	
	/**
	 * Price of the product
	 */
	private double price;
	
	/**
	 * Category of the product
	 */
	private String category;
	
	
	
	
	/**
	 * 
	 * @param productName
	 * @param brand
	 * @param price
	 * @param category
	 */
	public Product(String productName, String brand, double price, String category) {
		super();
		this.productName = productName;
		this.brand = brand;
		this.price = price;
		this.category = category;
	}
	
	public Product()
	{
		super();
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return productId;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.productId = id;
	}

	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

//
	@Override
	public String toString() {
		return "Product [id=" + productId + ", productName=" + productName + ", brand=" + brand + ", price=" + price
				+ ", category=" + category + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(brand, category, productId, price, productName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(brand, other.brand) && Objects.equals(category, other.category) && productId == other.productId
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(productName, other.productName);
	}
	
	
	
}
