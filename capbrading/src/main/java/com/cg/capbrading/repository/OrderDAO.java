	package com.cg.capbrading.repository;

	import java.util.List;

import com.cg.capbrading.entity.Order;

	
	/**
	 * @author Lakshmi
	 *
	 */
	public interface OrderDAO {
		
		/**
		 * Adds order from the database
		 * @param order
		 */
	
		public void addOrder(Order order);
		/**
		 * Deletes order from the database
		 * @param order
		 */
		
		public void deleteOrder(Order order);
		
		/**
		 * Updates order in the database
		 * @param order
		 */
		public static void updateOrder(Order order) {
			// TODO Auto-generated method stub
			
		}
		/**
		 * get order in the database
		 * @param order
		 */
		
		public static void getOrder(Order order) {
			// TODO Auto-generated method stub
			
		}
		/**
		 * Gets a list of all orders in the database
		 * @return
		 */

		
		
		public List<Order> viewAllOrders();

	}


