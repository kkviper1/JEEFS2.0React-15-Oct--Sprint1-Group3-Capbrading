package com.cg.capbrading.repository;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;


import com.cg.capbrading.entity.Cart;
import com.cg.capbrading.entity.Employee;
import com.cg.capbrading.entity.Product;
import com.cg.capbrading.util.JPAUtil;
/**
 * This CartDaoImpl class implements all methods which are declared in CartDao class
 * @author Sushma
 *
 */
public class CartDaoImpl implements CartDAO {
	static Logger logger = Logger.getLogger(EmployeeDaoImpl.class.getName());
	EntityManager em = JPAUtil.getEntityManager();
	/**
	 * This addcart Method will add the cart
	 */
	@Override
	
	public void addCart(Cart cart)
	{
		em.getTransaction().begin();
		em.persist(cart);
		em.getTransaction().commit();
		System.out.println("Cart Added successfully");
		logger.log(Level.INFO,  "Cart Added successfully");
	}
	/**
	 * This deletecart method will delete the cart from the DataBase
	 */
	@Override
	public void deleteCart(Cart cart)
	{
		Cart deleteCart = em.find(Cart.class, cart.getCartId());
		try {
			em.getTransaction().begin();
			em.remove(deleteCart);
			em.getTransaction().commit();
			System.out.println("Cart Removed successfully");
			logger.log(Level.INFO,  "Cart Removed successfully");
			
		}
		catch(Exception e)
		{
			System.out.println("Not found");
		}

	}
	/**
	 * This updateCart method will update the details of the cart in the Data Base
	 */
	@Override
	public void updateCart(Cart cart)
	{
		Cart updateCart = em.find(Cart.class, cart.getCartId());
		
		em.getTransaction().begin();
		updateCart = cart;
		em.getTransaction().commit();
		System.out.println("Cart Details Updated successfully");
		logger.log(Level.INFO,  "Cart Details Updated successfully");
	}
	/**
	 * This getCart method gives the details of cart 
	 * @return cart
	 */
	@Override
	public Cart getCart(Employee employee)
	{
		Query query = em.createQuery("SELECT c FROM Cart c WHERE c.id=:empid");
		query.setParameter("empid", employee.getId());	
		List<Cart> list = query.getResultList();
		Cart cart = new Cart(null, 0, employee);
		for(Cart obj : list)
		{
			cart = obj;
		}
		return cart;
	}
	/**
	 * This addToCart method is used add the product to Cart and call updateCart methods
	 */
	@Override
	public void addToCart(Cart cart,Product product)
	{
		cart.getProducts().add(product);
		updateCart(cart);
	}
	/**
	 * This deleteFromCart method will delete the product from cart
	 *  and updates the cart by calling updateCart method
	 */
	@Override
	public void deleteFromCart(Cart cart,Product product)
	{
		cart.getProducts().remove(product);
		updateCart(cart);
	}
	/**
	 * This viewAllCarts methods will provides the list of carts
	 * @return List of Carts
	 */
	@Override 
	public List<Cart> viewAllCarts()
	{
		 CriteriaBuilder cb = em.getCriteriaBuilder();
		 CriteriaQuery<Cart> cq = cb.createQuery(Cart.class);
		 Root<Cart> rootEntry = cq.from(Cart.class);
		 CriteriaQuery<Cart> all = cq.select(rootEntry);
	 
		 TypedQuery<Cart> allQuery = em.createQuery(all);
		 return allQuery.getResultList();
	}
}
