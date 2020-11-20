/**
 * 
 */
package com.cg.capbrading.service;

import java.util.List;

import com.cg.capbrading.entity.Vendor;
import com.cg.capbrading.repository.VendorDAO;
import com.cg.capbrading.repository.VendorDAOImpl;

/**
 * VendorServiceImpl implements VendorService
 * @author karan
 *
 */
public class VendorServiceImpl implements VendorService {

	VendorDAO vendorDAO = new VendorDAOImpl();
	@Override
	public void addVendor(Vendor vendor) {
		vendorDAO.addVendor(vendor);

	}

	@Override
	public void deleteVendor(Vendor vendor) {
		vendorDAO.deleteVendor(vendor);

	}

	@Override
	public void updateVendor(Vendor vendor) {
		vendorDAO.updateVendor(vendor);

	}

	@Override
	public List<Vendor> viewAllVendors() {	
		return vendorDAO.viewAllVendors();
	}

}
