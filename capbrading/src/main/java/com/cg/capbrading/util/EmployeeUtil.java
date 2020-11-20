package com.cg.capbrading.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;

import com.cg.capbrading.entity.Employee;
import com.cg.capbrading.service.EmployeeService;
import com.cg.capbrading.service.EmployeeServiceImpl;
/**
 * 
 * @author Sushma
 *
 */
public class EmployeeUtil {
	EmployeeService employeeService = new EmployeeServiceImpl();
	EntityManager em = JPAUtil.getEntityManager();
	/**
	 * The showMenu method is used to show the Menu for the Employee
	 */
	public void showMenu()
	{
		System.out.println("1. Add Employee");
		System.out.println("2. Delete Employee");
		System.out.println("3. Update Employee");
		System.out.println("4. List of Employees");
		System.out.println("5. Exit");
	}
	/**
	 * Creating start method to start the execution of Employees whether to add or delete or update
	 */
	public void start()
	{
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		int i = 0;
		while(i == 0)
		{
			/**
			 * It is used to call showMenu method
			 */
			showMenu();
			System.out.println("Enter your choice : ");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				{
					System.out.println("Enter Employee's ID,Name,Password,PhoneNo,Email,Location");
					String input = sc.next();//Taking Input from user to add details of Employee
					String[] arr = input.split(",");//By using split operator we used to split details of Employee
					int id = Integer.parseInt(arr[0]);
					String name = arr[1];
					String password = arr[2];
					String empPhone=arr[3];
					String empEmail=arr[4];
					String empLocation=arr[5];
					List<Employee> employees = new ArrayList<>();//Creating List to store details of Employees
					Employee employee = new Employee(id, name, password, empPhone, empEmail, empLocation);
					employeeService.addEmployee(employee);					
				}
				break;
			case 2:
				{		
					System.out.println("Enter Employee's ID");
					int id = sc.nextInt();
					Employee employee = em.getReference(Employee.class, id);//To delete details of Employee based on ID
					em.close();
					employeeService.deleteEmployee(employee);
					
				}
				break;
				/**
				 * This Case is used to update the details of Employee
				 */
			case 3:
				{
					System.out.println("Enter Employee's Id,Name,Password,PhoneNo,Email,Location");
					String input = sc.next();
					String[] arr = input.split(",");
					int id = Integer.parseInt(arr[0]);
					String name = arr[1];
					String password = arr[2];
					String empPhone=arr[3];
					String empEmail=arr[4];
					String empLocation=arr[5];
					List<Employee> employees = new ArrayList<>();
					Employee employee = new Employee(id, name, password, empPhone, empEmail, empLocation);
					employeeService.updateEmployee(employee);
				}
				break;
			case 4:
				{
					List<Employee> employees = employeeService.viewAllEmployees();//Creating the list to store Employees
					System.out.println(employees);
				}
				break;
			case 5:
				{
					i = 1;
					JPAUtil.getEntityManager().close();//To close EntityManager
					break;
				}
			default:
				System.out.println("----Wrong choice-----");//In default case it will show this message
				break;
				
			}
		}
	}
}