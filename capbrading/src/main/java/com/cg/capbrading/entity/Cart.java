package com.cg.capbrading.entity;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="CART")
/**
 * This Cart Component is used as a data traveler object from layer to layer
 * 
 * @author Sushma
 *
 */
public class Cart{
	/**
	 * id of the cart, that is to find which products has choosen
	 * id is set has a primary key
	 */
	@Id
	@GeneratedValue
	private int cartId;
	
	@OneToMany
	private List<Product> products;
	/**
	 * Total Price of the Products
	 */
	@Column
	private double totalPrice;
	/**
	 * Imports object of Employee class to get Employee details in the cart
	 */
	@ManyToOne
	@JoinColumn(name = "id")
	private Employee employee;
	
	/**
	 * 
	 * @param products
	 * @param totalPrice
	 * @param employee
	 */
public Cart(List<Product> products, double totalPrice, Employee employee) {
		super();
		this.products = products;
		this.totalPrice = totalPrice;
		this.employee = employee;
	}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((employee == null) ? 0 : employee.hashCode());
	result = prime * result + ((products == null) ? 0 : products.hashCode());
	long temp;
	temp = Double.doubleToLongBits(totalPrice);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Cart other = (Cart) obj;
	if (employee == null) {
		if (other.employee != null)
			return false;
	} else if (!employee.equals(other.employee))
		return false;
	if (products == null) {
		if (other.products != null)
			return false;
	} else if (!products.equals(other.products))
		return false;
	if (Double.doubleToLongBits(totalPrice) != Double.doubleToLongBits(other.totalPrice))
		return false;
	return true;
}

@Override
public String toString() {
	return "Cart [products=" + products + ", totalPrice=" + totalPrice + ", employee=" + employee + "]";
}
/**
 * @return cartId
 */
public int getCartId() {
	return cartId;
}
/**
 * @param cartId, set to the cartId
 */

/**
 * @return List of products
 */
public List<Product> getProducts() {
	return products;
}
/**
 * @param products, To set to the products 
 */
public void setProducts(List<Product> products) {
	this.products = products;
}
/**
 * @return totalPrice
 */
public double getTotalPrice() {
	return totalPrice;
}
/**
 * 
 * @param totalPrice, To set to the totalPrice
 */
public void setTotalPrice(double totalPrice) {
	this.totalPrice = totalPrice;
}
/**
 * 
 * @return the Employee
 */
public Employee getEmployee() {
	return employee;
}
/**
 * 
 * @param employee set to Employee
 */
public void setEmployee(Employee employee) {
	this.employee = employee;
}
}
