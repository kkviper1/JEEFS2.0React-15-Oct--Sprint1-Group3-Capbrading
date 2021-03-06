package com.cg.capbrading.service;

import java.util.List;

import com.cg.capbrading.entity.Cart;
import com.cg.capbrading.entity.Employee;
import com.cg.capbrading.entity.Product;
import com.cg.capbrading.repository.CartDAO;

public interface CartService {
	/**
	 * This addCart method will add the cart
	 * @param cart
	 */
	public void addCart(Cart cart);
	/**
	 * This deleteCart will delete the cart
	 * @param cart
	 */
	public void deleteCart(Cart cart);
	/**
	 * This updateCart will update the cart while adding products
	 * @param cart
	 */
	public void updateCart(Cart cart);
	/**
	 * This getCart method will get cart details
	 * @param cart
	 */
	public Cart getCart(Employee employee);
	/**
	 * This addToCart method will add product to cart
	 * @param cart
	 * @param product
	 */
	public void addToCart(Cart cart,Product product);
	/**
	 * This deleteFromCart method will delete the product from the cart 
	 * @param cart
	 * @param product
	 */
	public void deleteFromCart(Cart cart,Product product);
	/**
	 * This viewAllCarts method is used th display the list of carts
	 * @return List of Carts
	 */
	public List<Cart> viewAllCarts();
	public double totalPrice(List<Product> products);
}
