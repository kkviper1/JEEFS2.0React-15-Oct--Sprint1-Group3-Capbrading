/**
 * 
 */
package com.cg.capbrading.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;

import com.cg.capbrading.entity.Product;
import com.cg.capbrading.entity.Vendor;
import com.cg.capbrading.service.VendorService;
import com.cg.capbrading.service.VendorServiceImpl;

/**
 * Utility Menu class for VendorUtility
 * @author karan
 *
 */
public class VendorUtil {
	
	VendorService vendorService = new VendorServiceImpl();
	EntityManager em = JPAUtil.getEntityManager();
	
	/**
	 * Method to display the menu
	 */
	public void showMenu()
	{
		System.out.println("1. Add Vendor");
		System.out.println("2.Remove Vendor");
		System.out.println("3.Update Vendor");
		System.out.println("4.View All Vendors");
		System.out.println("5.Exit");
		
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
			 * Case for adding vendor
			 */
			case 1:
				{
					System.out.println("Enter Vendor's ID,Name,Password");
					String input = sc.next();
					String[] arr = input.split(",");
					int id = Integer.parseInt(arr[0]);
					String name = arr[1];
					String password = arr[2];
					List<Product> products = new ArrayList<>();
					Vendor vendor = new Vendor(id, name, password, products);
					vendorService.addVendor(vendor);
					
			}
				break;
				
			/**
			 * Case for removing vendor
			 */
			case 2:
				{
					System.out.println("Enter vendor's ID");
					int id = sc.nextInt();
					Vendor vendor = em.getReference(Vendor.class, id);
					em.close();
					vendorService.deleteVendor(vendor);
					
				}
				break;
				
			/**
			 * Case for updating vendor
			 */
			case 3:
				{
					System.out.println("Enter Vendor's ID,Name,Password");
					String input = sc.next();
					String[] arr = input.split(",");
					int id = Integer.parseInt(arr[0]);
					String name = arr[1];
					String password = arr[2];
					List<Product> products = new ArrayList<>();
					Vendor vendor = new Vendor(id, name, password, products);
					vendorService.updateVendor(vendor);
				}
				break;
			
			/**
			 * Case for viewing all vendors
			 */
			case 4:
				{
					List<Vendor> vendors = vendorService.viewAllVendors();
					System.out.println(vendors);
				}
				break;
				
			/**
			 * Case for exiting the program
			 */
			case 5:
				i = 1;
				JPAUtil.getEntityManager().close();
				break;
				
			default:
				System.out.println("Wrong choice");
				break;
			}
		}
		sc.close();
	}

}
