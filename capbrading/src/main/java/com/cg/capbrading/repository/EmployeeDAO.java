package com.cg.capbrading.repository;
/**
 * This EmployeeDAO will perform all the CRUD operation on Employee Note : In this
 * application we are not using DB, so data will be avialable in LocalRepository
 * 
 * @author Sushma
 *
 */


import java.util.List;

import com.cg.capbrading.entity.Employee;


public interface EmployeeDAO {
	/**
	 * This addEmployee method will add the Employees 
	 * @param employee
	 */
	public void addEmployee(Employee employee);
	/**
	 * This deleteEmployee method will delete Employee from list
	 * @param employee
	 */
	public void deleteEmployee(Employee employee);
	/**
	 * This UpdateEmployee method will update the Employee in List
	 * @param employee
	 */
	public void updateEmployee(Employee employee);
	/**
	 * This viewAllEmployee method will show all the Employees in the List
	 * @return
	 */
	public List<Employee> viewAllEmployees();
}
