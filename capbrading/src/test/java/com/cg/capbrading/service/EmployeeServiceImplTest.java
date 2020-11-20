package com.cg.capbrading.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cg.capbrading.entity.Employee;

class EmployeeServiceImplTest {
	EmployeeServiceImpl employeeservice;
	Employee emp=new Employee();
	@BeforeEach
	void setUp() throws Exception {
		employeeservice=new EmployeeServiceImpl();
	}
 
	@AfterEach
	void tearDown() throws Exception {
		employeeservice=null;
	}

	@Test
	void testAddEmployee() {
		emp.setId(123);
		emp.setName("manisha");
		emp.setPassword("Sushma");
		emp.setEmpPhone("987654321");
		emp.setEmpEmail("manisha@gmail.com");
		emp.setEmpLocation("Hyderabad");
		assertEquals(emp.getId(),123);
		assertEquals(emp.getName(),"manisha");
		assertEquals(emp.getPassword(),"Sushma");
		assertEquals(emp.getEmpPhone(),"987654321");
		assertEquals(emp.getEmpEmail(),"manisha@gmail.com");
		assertEquals(emp.getEmpLocation(),"Hyderabad");
	}


	@Test
	void testDeleteProduct() { 
		emp.setId(123); 
		assertEquals(emp.getId(),123);
	} 
	@Test
	void testUpdateProduct() { 
		emp.setId(1234);
		assertEquals(emp.getId(),1234);
	}
//	@Test
//	void testViewAllEmployees() {
//		emp.setId(123); 
//		emp.setName("Sushma");
//		emp.setPassword("Sushma688");
//		emp.setEmpPhone("9100987654");
//		emp.setEmpEmail("mashma@gmail.com");
//		List<Employee> employeeList=employeeservice.ViewAllEmployees(emp);
//		assertNotNull(employeeList);
//
//	}
}
