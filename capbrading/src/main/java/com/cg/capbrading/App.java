package com.cg.capbrading;



import java.util.Scanner;

import com.cg.capbrading.util.ProductUtil;
import com.cg.capbrading.util.VendorUtil;

/**
 * Driver Class for the Application; Runs the menu for the two Entities
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("1.Vendor");
    	System.out.println("2.Product");
    	System.out.println("Enter your choice");
    	Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		if(choice == 1)
		{	VendorUtil vendorUtil = new VendorUtil();
    	vendorUtil.start();
		}
		if(choice ==2)
		{
			ProductUtil productUtil = new ProductUtil();
			productUtil.start();
		}
		else
		{
			System.out.println("Wrong choice");
		}
		sc.close();
    }
}
