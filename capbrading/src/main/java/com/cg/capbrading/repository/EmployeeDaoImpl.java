package com.cg.capbrading.repository;


import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.cg.capbrading.entity.Employee;
import com.cg.capbrading.util.JPAUtil;
/**
 * This EmployeeDaoImpl class will implements all methods which are declared in EMployeeDao class
 * @author Sushma
 *
 */
public class EmployeeDaoImpl implements EmployeeDAO {
	static Logger logger = Logger.getLogger(EmployeeDaoImpl.class.getName());
	EntityManager em = JPAUtil.getEntityManager();
	/**
	 * This addEmployee Method is overriden and it adds the details of Employee to DataBase
	 */
	@Override
	public void addEmployee(Employee employee) {
		em.getTransaction().begin();
		em.persist(employee);
		em.getTransaction().commit();
		System.out.println("Data Added successfully");
		logger.log(Level.INFO,  "Data Added successfully");

	}
	/**
	 * This deleteEmployee Method is overriden and it deletes the details of Employee to DataBase
	 */
	@Override
	public void deleteEmployee(Employee employee) {
		Employee deleteEmployee = em.find(Employee.class, employee.getId());
		try {
			em.getTransaction().begin();
			em.remove(deleteEmployee);
			em.getTransaction().commit();
			System.out.println("Employee Data Removed successfully");
			logger.log(Level.INFO,  "Employee Data Removed successfully");
		}
		catch(Exception e)
		{
			System.out.println("Not found");
		}

	}
	/**
	 * This updateEmployee Method is overriden and it updates the details of Employee to DataBase
	 */
	@Override
	public void updateEmployee(Employee employee) {
		Employee updateEmployee = em.find(Employee.class, employee.getId());
		
		em.getTransaction().begin();
		em.merge(employee);
		em.getTransaction().commit();
		System.out.println("Data Updated successfully");
		logger.log(Level.INFO,  "Data Updated successfully");

	}
	/**
	 * This viewAllEmployees method is overriden and it gives the list of employees in the DataBase
	 */
	@Override
	public List<Employee> viewAllEmployees() {
		 CriteriaBuilder cb = em.getCriteriaBuilder();
		 CriteriaQuery<Employee> cq = cb.createQuery(Employee.class);
		 Root<Employee> rootEntry = cq.from(Employee.class);
		 CriteriaQuery<Employee> all = cq.select(rootEntry);
	 
		 TypedQuery<Employee> allQuery = em.createQuery(all);
		 return allQuery.getResultList();
	}

}
