package com.cg.capbrading.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;

import com.cg.capbrading.entity.Cart;
import com.cg.capbrading.entity.Employee;
import com.cg.capbrading.entity.Product;
import com.cg.capbrading.service.CartService;
import com.cg.capbrading.service.CartServiceImpl;

public class CartUtil {
	CartService cartService = new CartServiceImpl();
	EntityManager em = JPAUtil.getEntityManager();//Creating object for EntityManager
	/**
	 * The showMenu in CartUtil is to display the menu of cart
	 */
	public void showMenu()
	{
		System.out.println("1. Add Cart");
		System.out.println("2. delete Cart");
		System.out.println("3. update Cart");
		System.out.println("4. Get Cart");
		System.out.println("5. Add product to Cart");
		System.out.println("6. Delete product from Cart");
		System.out.println("7. View Cart Details");
		System.out.println("8. Exit");
	}
	/**
	 * This start method is used to start the cart methods 
	 */
	public void start()
	{
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		int i = 0;
		while(i == 0)
		{
			/**
			 * Calling the showmenu method
			 */
			showMenu();
			System.out.println("Enter your choice : ");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1:
			{
				/**
				 * Creating Object for CartService class
				 */
				CartService cartService=new CartServiceImpl();
				List<Product> products = new ArrayList<>();
				System.out.println("Enter Employee's ID,Name,Password,PhoneNo,Email,Location");
				/**
				 * Taking Input from user and splitting into Employee Details and same for product Details
				 */
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
				System.out.println("Enter Product's Id,Name,Brand,Price,Category");
				String input1=sc.next();
				String[] arr1=input1.split(",");
				int Id=Integer.parseInt(arr1[0]);
				String productName=arr1[1];
				String brand=arr1[2];
				int price=Integer.parseInt(arr1[3]);
				String category=arr1[4];
				Product product = new Product(productName,brand,price,category);
				products.add(product);
				Cart cart=new Cart(products,cartService.totalPrice(products), employee);
				cartService.addCart(cart);
				
			}
			break;
			/**
			 * To delete the cart, we want to find cart based on cart ID
			 */
			case 2:
			{
				System.out.println("Enter Cart's ID");
				int id = sc.nextInt();
				Cart cart = em.getReference(Cart.class, id);
				cartService.deleteCart(cart);
			}
			break;
			/**
			 * This case is used to update the cart based Employee details and Product Details
			 */
			case 3:
			{
				CartService cartService=new CartServiceImpl();
				List<Product> products = new ArrayList<>();
				System.out.println("Enter Employee's ID,Name,Password,PhoneNo,Email,Location");
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
				System.out.println("Enter Product's Id,Name,Brand,Price,Category");
				String input1=sc.next();
				String[] arr1=input.split(",");
				int Id=Integer.parseInt(arr1[0]);
				String productName=arr1[1];
				String brand=arr1[2];
				int price=Integer.parseInt(arr1[3]);
				String category=arr1[4];
				Cart cart=new Cart(products, 900, employee);
				cartService.updateCart(cart);
			}
			break;
			/**
			 * This case is used for getCart based on cart ID
			 */
			case 4:
			{
				CartService cartService=new CartServiceImpl();
				System.out.println("Enter Employee's ID");
				int id = sc.nextInt();
				Employee employee = em.getReference(Employee.class, id);
				System.out.println(cartService.getCart(employee));
			}
			break;
			/**
			 * This is used to add product to cart
			 */
			case 5:
			{
				System.out.println("Enter Product's Id");
				int id=sc.nextInt();
				Product product=em.getReference(Product.class,id);
				Cart cart=new Cart(null, id, null);
				cart.getProducts().add(product);
				cartService.updateCart(cart);
				
				
			}
			break;
			/**
			 * This is used to delete the product from the cart
			 */
			case 6:
			{
				System.out.println("Enter Product's Id");
				int id=sc.nextInt();
				Product product=em.getReference(Product.class,id);
				Cart cart=new Cart(null, id, null);
				cart.getProducts().remove(product);
				cartService.updateCart(cart);
				
				
			}
			break;
			/**
			 * This is used to view all the carts
			 */
			case 7:{
				List<Cart> carts = cartService.viewAllCarts();
				System.out.println(carts);
			}
			break;
			case 8:
			{
				i = 1;
				JPAUtil.getEntityManager().close();//used  to close EntityManager
				break;
			}
			default:
				System.out.println("-----Wrong Choice-----");//In default case it shows this message
				break;
		}
	  }
	}
	
}
