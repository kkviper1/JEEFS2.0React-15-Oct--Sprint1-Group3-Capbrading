package com.cg.capbrading.entity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CartTest {
	Cart cart;
	@BeforeEach
	void setUp() throws Exception {
	cart=new Cart(null, 0, null);	
	}

	@AfterEach
	void tearDown() throws Exception {
		cart=null;
	}

	@Test
	void testGetCartId() {
		cart.setCartId(1234);
		assertEquals(cart.getCartId(),1234);
	}
	

	@Test
	void testGetTotalPrice() {
		cart.setTotalPrice(200);
		assertEquals(cart.getTotalPrice(),200);
	}
}
