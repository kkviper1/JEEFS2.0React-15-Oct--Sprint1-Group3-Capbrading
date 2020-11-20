/**
 * 
 */
package com.cg.capbrading.service;

import java.util.List;

import com.cg.capbrading.entity.Vendor;

/**
 * This VendorService will perform all the business logic
 * like: addVendor, deleteVendor, updateVendor , viewAllVendor
 * @author karan
 *
 */
public interface VendorService {
	
	/**
	 * Passes vendor object to the repository layer to add to database
	 * @param vendor
	 */
	public void addVendor(Vendor vendor);
	
	/**
	 * Passes vendor object to the repository layer to delete from database
	 * @param vendor
	 */
	public void deleteVendor(Vendor vendor);
	
	/**
	 * Passes vendor object to the repository layer to update in database
	 * @param vendor
	 */
	public void updateVendor(Vendor vendor);
	
	/**
	 * Returns a list of all the vendors from the DAO layer
	 * @return
	 */
	public List<Vendor> viewAllVendors();

}
