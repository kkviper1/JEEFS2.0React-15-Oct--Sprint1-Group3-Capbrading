package com.cg.capbrading.entity;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeTest {
	Employee emp;

	@BeforeEach
	void setUp() throws Exception {
		emp=new Employee(0, null, null, null, null, null);
	}

	@AfterEach
	void tearDown() throws Exception {
		emp=null;
	}

	@Test
	void testGetEmpId() {
		emp.setId(123);
		assertEquals(emp.getId(),123);
	}

	@Test
	void testGetEmpName() {
		emp.setName("Sushma");
		assertEquals(emp.getName(),"Sushma");
	}

	@Test
	void testGetEmpPhone() {
		emp.setEmpPhone("9123456678");
		assertEquals(emp.getEmpPhone(),"9123456678");
	}

	@Test
	void testGetEmpEmail() {
		emp.setEmpEmail("sushma@gmail.com");
		assertEquals(emp.getEmpEmail(),"sushma@gmail.com");
	}
 
	@Test   
	void testGetEmpLocation() {
		emp.setEmpLocation("chennai");
		assertEquals(emp.getEmpLocation(),"chennai");

}
}

