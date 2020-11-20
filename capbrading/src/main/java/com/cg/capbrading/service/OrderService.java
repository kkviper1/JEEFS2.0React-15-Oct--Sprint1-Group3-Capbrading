/**
 * 
 */
package com.cg.capbrading.service;

import java.util.List;


import com.cg.capbrading.entity.Order;

/**
 * @author Lakshmi
 *
 */
public interface OrderService {
	
	/**
	 * Passes the order to the repository layer to be added
	 * 
	 * @param order
	 */
	public void addOrder(Order order);
	
	/**
	 * Passes the order to the repository layer to be removed
	 * 
	 * @param order
	 */
	public void deleteOrder(Order order);
	
	/**
	 * Passes the order to the repository layer to be updated
	 * 
	 * @param order
	 */
	public void updateOrder(Order order);
	/**
	 * Passes the order to the repository layer to be ordered
	 * 
	 * @param order
	 */
	public void getOrder(Order order);
	
	/**
	 * Gets a list of all orders from the repository layer
	 * @return
	 */
	public List<Order> viewAllOrders();
}
