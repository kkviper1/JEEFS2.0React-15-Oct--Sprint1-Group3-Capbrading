package com.cg.capbrading.service;

import java.util.List;

import com.cg.capbrading.entity.Employee;

public interface EmployeeService {
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
