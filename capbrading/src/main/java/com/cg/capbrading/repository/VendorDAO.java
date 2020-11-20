/**
 * 
 */
package com.cg.capbrading.repository;

import java.util.List;

import com.cg.capbrading.entity.Vendor;

/**
 * This VendorDAO will perform all the CRUD operation on Vendor Entity using Database
 * @author karan
 *
 */
public interface VendorDAO {

	/**
	 * Adds vendor to the database
	 * @param vendor
	 */
	public void addVendor(Vendor vendor);
	
	/**
	 * Deletes vendor from the database
	 * @param vendor
	 */
	public void deleteVendor(Vendor vendor);
	
	/**
	 * Updates vendor from the database
	 * @param vendor
	 */
	public void updateVendor(Vendor vendor);
	
	/**
	 * Returns a list of all vendors from the database
	 * @return
	 */
	public List<Vendor> viewAllVendors();
}
