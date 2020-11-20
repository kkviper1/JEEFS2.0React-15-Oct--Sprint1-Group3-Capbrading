package com.cg.capbrading.service;

import static org.junit.Assert.assertNotNull;

import org.junit.Rule;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.jupiter.api.Test;

import com.cg.capbrading.entity.Cart;
import com.cg.capbrading.entity.Employee;
import com.cg.capbrading.repository.EmployeeDaoImpl;

class CartServiceImplTest {
	

	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
	@Test
	public void getCart() {
		Employee employee=new Employee(1,"Sushma","Sushm688","9846789","sushma@gmail.com","Bangalore");
		EmployeeDaoImpl emp = new EmployeeDaoImpl();
		emp.addEmployee(employee);
		CartServiceImpl cartServiceImpl = new CartServiceImpl();
		Cart cart = cartServiceImpl .getCart(employee);
		assertNotNull("cart cannot be null", cart);
	}

	

}
