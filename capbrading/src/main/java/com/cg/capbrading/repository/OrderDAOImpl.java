	package com.cg.capbrading.repository;

	import java.util.List;

	import javax.persistence.EntityManager;
	import javax.persistence.TypedQuery;
	import javax.persistence.criteria.CriteriaBuilder;
	import javax.persistence.criteria.CriteriaQuery;
	import javax.persistence.criteria.Root;

	import org.hibernate.exception.ConstraintViolationException;

import com.cg.capbrading.util.JPAUtil;
import com.cg.capbrading.entity.Order;

	
	/**
	 * @author Lakshmi
	 *
	 */
	public class OrderDAOImpl implements OrderDAO {
		
		EntityManager em = JPAUtil.getEntityManager();
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Order> cq = cb.createQuery(Order.class);
		Root<Order> rootEntry = cq.from(Order.class);

		@Override
		public void addOrder(Order order) {
			try {
				em.getTransaction().begin();
				em.persist(order);
				em.getTransaction().commit();
				System.out.println("Data Added successfully");
			} catch (ConstraintViolationException e) {
				System.out.println(e.getConstraintName());
				e.printStackTrace();
			}

		}

		@Override
		public void deleteOrder(Order order) {
			try {
				em.getTransaction().begin();
				em.remove(order);
				em.getTransaction().commit();
				System.out.println("Data Removed successfully");
			}
			catch(IllegalArgumentException e)
			{
				System.out.println("Not found");
			}

		}

		public void updateOrder(Order order) {
			Order updateOrder = em.find(Order.class, order);
			
			em.getTransaction().begin();
			updateOrder = order;
			em.getTransaction().commit();
			System.out.println("Data Updated successfully");

		}
		public void getOrder(Order order) {
			Order getOrder = em.find(Order.class, order);
			
			em.getTransaction().begin();
			getOrder = order;
			em.getTransaction().commit();
			System.out.println("getorder successfully");

		}

		
		

		@Override
		public List<Order> viewAllOrders() {
			 CriteriaQuery<Order> all = cq.select(rootEntry);
		 
			 TypedQuery<Order> allQuery = em.createQuery(all);
			 return allQuery.getResultList();
		}

	}


