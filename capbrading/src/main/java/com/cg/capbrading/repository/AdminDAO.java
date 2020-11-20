package com.cg.capbrading.repository;

import java.util.List;

import com.cg.capbrading.entity.Admin;

/**
 * @author Lakshmi
 *
 */

public interface AdminDAO {
	/**
	 * Adds admin to the database
	 * 
	 * @param admin
	 */

	public void addAdmin(Admin admin);

	/**
	 * Deletes admin from the database
	 * @param admin
	 */
	public void deleteAdmin(Admin admin);
	/**
	 * Updates admin from the database
	 * @param admin
	 */
	

	public void updateAdmin(Admin admin);
	/**
	 * Returns a list of all admin from the database
	 * @return
	 */


	public List<Admin> viewAllAdmin();

}
