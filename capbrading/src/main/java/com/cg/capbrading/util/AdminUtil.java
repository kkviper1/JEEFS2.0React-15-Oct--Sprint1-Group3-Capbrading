package com.cg.capbrading.util;

import java.util.Scanner;

import com.cg.capbrading.repository.AdminDAOImpl;
import com.cg.capbrading.entity.Admin;



public class AdminUtil extends AdminDAOImpl {
		private static final String Admin = null;
		Admin admin=new Admin(1,"Lovely","Lovely988");
		public void showMenu()
		{
			System.out.println("1. Add Admin");
			System.out.println("2. Update Admin");
			System.out.println("3. Delete Admin");
			System.out.println("4. View all Admin");
		}
		public void start() {
		// TODO Auto-generated method stub
		int choice;
		String continueChoice = "yes";
		Scanner sc=new Scanner(System.in);
		do {
			showMenu();
			System.out.println("Enter your choice: ");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				addAdmin(Admin);
				break;				
			}
			
		}while(continueChoice.equalsIgnoreCase("yes"));
		
	}
		private void addAdmin(String admin2) {
			// TODO Auto-generated method stub
			
		}

}
