package com.cg.capbrading.service;

import java.util.List;

import com.cg.capbrading.entity.Cart;
import com.cg.capbrading.entity.Employee;
import com.cg.capbrading.entity.Product;
import com.cg.capbrading.repository.CartDaoImpl;

public class CartServiceImpl implements CartService {
	CartDaoImpl cartDao=new CartDaoImpl();
	/**
	 * This addCart method will add the cart to the DataBase
	 */
	@Override
	public void addCart(Cart cart)
	{
	 cartDao.addCart(cart);
	}
	/**
	 * This deletecart method will delete the cart from DataBase
	 */
	@Override
	public void deleteCart(Cart cart)
	{
		cartDao.deleteCart(cart);
	}
	/**
	 * Thhis updateCart method will update the details of cart to the Data Base
	 */
	@Override
	public void updateCart(Cart cart)
	{
		cartDao.updateCart(cart);
	}
	/**
	 * This getCart method will get the Cart
	 */
	@Override
	public Cart getCart(Employee employee)
	{
		return cartDao.getCart(employee);
	}
	/**
	 * This aadToCart method will add the product to the cart in Data Base
	 */
	@Override
	public void addToCart(Cart cart,Product product)
	{
		cartDao.addToCart(cart, product);
	}
	/**
	 * This deleteFromCart method will delete the product from Cart 
	 */
	@Override
	public void deleteFromCart(Cart cart,Product product)
	{
		cartDao.deleteFromCart(cart, product);
	}
	/**
	 * This viewAllCarts method will gives the list of Carts
	 */
	@Override
	public List<Cart> viewAllCarts()
	{
		return cartDao.viewAllCarts();
	}
	@Override
	public double totalPrice(List<Product> products) {
		double total=0;
		for(Product product : products)
		{
			total = total + product.getPrice();
		}
		return total;
	}
}
