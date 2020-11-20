/**
 * 
 */
package com.cg.capbrading.util;

import java.util.Scanner;

import javax.persistence.EntityManager;

import com.cg.capbrading.entity.Product;
import com.cg.capbrading.entity.Vendor;
import com.cg.capbrading.service.ProductService;
import com.cg.capbrading.service.ProductServiceImpl;


/**
 * Utility Menu class for Product
 * @author karan
 *
 */
public class ProductUtil {
	
	ProductService productService = new ProductServiceImpl();
	EntityManager em = JPAUtil.getEntityManager();
	
	/**
	 * Method to display options
	 */
	public void showMenu()
	{
		System.out.println("1.Add Product");
		System.out.println("2.Remove Product");
		System.out.println("3.Update Product");
		System.out.println("4.View Products by Category");
		System.out.println("5.View Products by Brand ");
		System.out.println("6.View Products by Vendor");
		System.out.println("7.View All Products");
		System.out.println("8.Exit");
		
	}
	
	public void start()
	{
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		int i = 0;
		while(i == 0)
		{
			showMenu();
			System.out.println("Enter your choice : ");
			choice = sc.nextInt();
			switch(choice)
			{
			/**
			 * Case for Add Product
			 */
			case 1:
				{
					System.out.println("Enter Product's Name,brand,price,category");
					String input = sc.next();
					String[] arr = input.split(",");
					String name = arr[0];
					String brand = arr[1];
					double price = Double.parseDouble(arr[2]);
					String category = arr[3];
					Product product = new Product(name, brand, price, category);
					productService.addProduct(product);
					
				}
				break;
			
				/**
				 * Case for Removing product
				 */
			case 2:
			{
				System.out.println("Enter Product's ID");
				int id = sc.nextInt();
				Product product = em.getReference(Product.class, id);
				em.close();
				productService.deleteProduct(product);
			}
			break;
			
			/**
			 * Case for updating product
			 */
			case 3:
			{
				System.out.println("Enter Product's Name,brand,price,category");
				String input = sc.next();
				String[] arr = input.split(",");
				String name = arr[0];
				String brand = arr[1];
				double price = Double.parseDouble(arr[2]);
				String category = arr[3];
				Product product = new Product(name, brand, price, category);
				productService.updateProduct(product);
				
			}
			break;
			
			
			/**
			 * Case for getting list of products from a categpry
			 */
			case 4:
			{
				System.out.println("Enter category");
				String category = sc.next();
				System.out.println(productService.viewProductsByCategory(category));
			}
			break;
			
			/**
			 * Case for getting list of products from a brand
			 */
			case 5:
			{
				System.out.println("Enter brand");
				String brand = sc.next();
				System.out.println(productService.viewProductsByBrand(brand));
			}
			break;
			
			/**
			 * Case for getting list of products from a Vendor
			 */
			case 6:
			{
				System.out.println("Enter Vendor id");
				int id = sc.nextInt();
				EntityManager em = JPAUtil.getEntityManager();
				Vendor vendor = em.getReference(Vendor.class, id);
				System.out.println(productService.viewProductsByVendor(vendor));
			}
			break;
			
			/**
			 * Case for getting list of all products
			 */
			case 7:
				System.out.println(productService.viewAllProducts());
				break;
				
				
			/**
			 * Case for exiting the program
			 */
			case 8:
				i=1;
				em.close();
				break;
				
			default:
				System.out.println("Wrong choice");
				break;
			}
		}
		sc.close();
	}

}
