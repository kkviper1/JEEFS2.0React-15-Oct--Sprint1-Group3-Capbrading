package com.cg.capbrading.service;

	import java.util.List;

import com.cg.capbrading.entity.Order;
import com.cg.capbrading.repository.OrderDAO;
	import com.cg.capbrading.repository.OrderDAOImpl;

	/**
	 * @author Lakshmi
	 *
	 */
	public class OrderServiceImpl implements OrderService {

		OrderDAO orderDAO = new OrderDAOImpl();
		@Override
		public void addOrder(Order order) {
			orderDAO.addOrder(order);

		}

		@Override
		public void deleteOrder(Order order) {
			orderDAO.deleteOrder(order);

		}

		@Override
		public void updateOrder(Order order) {
			OrderDAO.updateOrder(order);

		}
		@Override
		public void getOrder(Order order) {
			OrderDAO.getOrder(order);
		}
		
		

		@Override
		public List<Order> viewAllOrders() {	
			return orderDAO.viewAllOrders();
		}

	}


