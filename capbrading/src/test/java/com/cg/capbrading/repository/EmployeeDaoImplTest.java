package com.cg.capbrading.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.cg.capbrading.entity.Employee;


class EmployeeDaoImplTest {
	
	EmployeeDaoImpl employeedao;
	Employee emp=new Employee();
	@BeforeEach
	void setUp() throws Exception {
		employeedao=new EmployeeDaoImpl();
	}
 
	@AfterEach
	void tearDown() throws Exception {
		employeedao=null;
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
	
	}

