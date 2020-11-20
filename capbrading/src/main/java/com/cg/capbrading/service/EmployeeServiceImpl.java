package com.cg.capbrading.service;

import java.util.List;

import com.cg.capbrading.entity.Employee;
import com.cg.capbrading.repository.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {
	EmployeeDaoImpl employeeDao=new EmployeeDaoImpl();
	/**
	 * This addEmployee method will add employee details
	 */
	@Override
	 public void addEmployee(Employee employee) {
			employeeDao.addEmployee(employee);
		}
	/**
	 * This deleteEmployee method will delete employee Details
	 */
	@Override
	public void deleteEmployee(Employee employee) {
		employeeDao.deleteEmployee(employee);
	}
	/**
	 * This updateEmployee will update Detailsof Employee
	 */
	@Override
	public void updateEmployee(Employee employee) {
		employeeDao.updateEmployee(employee);
	}
	/**
	 * This viewAllEmployees will list the Employees
	 * @return List of Employees
	 */
	@Override
	public List<Employee> viewAllEmployees() {
		return employeeDao.viewAllEmployees();
	}
}
