package com.cg.capbrading.repository;

import static org.junit.Assert.assertNotNull;
//import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;
import org.junit.Assert;
import org.junit.Rule;
import com.cg.capbrading.entity.Cart;
import com.cg.capbrading.entity.Employee;
import com.cg.capbrading.entity.Product;
//import com.cg.capbrading.service.CartServiceImpl;
import org.junit.contrib.java.lang.system.SystemOutRule;
public class CartDaoImplTest {	
	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
	@Test
	public void getCart() {
		Employee employee=new Employee(1,"Sushma","Sushm688","9846789","sushma@gmail.com","Bangalore");
		EmployeeDaoImpl emp = new EmployeeDaoImpl();
		emp.addEmployee(employee);
		CartDaoImpl cartDaoImpl = new CartDaoImpl();
		Cart cart = cartDaoImpl .getCart(employee);
		assertNotNull("cart cannot be null", cart);
	}

	/**
	 *
	 * @see com.cg.capbrading.repository.CartDaoImpl#addToCart(Cart,Product)
	 */
	@Test
	public void addToCart() {
		List<Product> products = new ArrayList<>();
		Employee employee=new Employee(1,"Sushma","Sushm688","9846789","sushma@gmail.com","Bangalore");
		Cart cart = new Cart(products, 1, employee);
		Product product = new Product(0, null, null, 0, null);
		CartDaoImpl cartDaoImpl = new CartDaoImpl();
		cartDaoImpl .addToCart(cart,product);
		String[] arr  = systemOutRule.getLogWithNormalizedLineSeparator().split("\n");
		String result = arr[arr.length-1];
		Assert.assertEquals("Cart Details Updated successfully", result);
	}
	

}
