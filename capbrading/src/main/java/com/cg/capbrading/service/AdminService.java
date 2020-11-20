	package com.cg.capbrading.service;

	import java.util.List;

import com.cg.capbrading.entity.Admin;

	
	/**
	 * @author Lakshmi
	 *
	 */
	public interface AdminService {
		
		/**
		 * Passes admin object to the repository layer to add to database
		 * @param admin
		 */
		public void addAdmin(Admin admin);
		
		/**
		 * Passes admin object to the repository layer to delete from database
		 * @param admin
		 */
		public void deleteAdmin(Admin admin);
		
		/**
		 * Passes admin object to the repository layer to update in database
		 * @param admin
		 */
		public void updateAdmin(Admin admin);
		
		/**
		 * Returns a list of all the admin from the DAO layer
		 * @return
		 */
		public List<Admin> viewAllAdmin();

	}


