/**
 * 
 */
package com.cg.capbrading.repository;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.*;
import com.cg.capbrading.repository.VendorDAOImpl;
import com.cg.capbrading.entity.Product;
import com.cg.capbrading.entity.Vendor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author karan
 *
 */
public class VendorDAOImplTest {

	VendorDAOImpl vendorDAOImpl = new VendorDAOImpl();
	List<Product> products = new ArrayList<Product>();
	@Before
	public void init() throws Exception {
		// TODO add setup code.
		
	
	}
	
	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

	/**
	 *
	 * @see com.cg.capbrading.repository.VendorDAOImpl#addVendor(Vendor)
	 */
	@Test
	public void addVendor() {
		List<Product> products = new ArrayList<Product>();
		Vendor vendor = new Vendor(100, "name", "brand", products);
		vendorDAOImpl.addVendor(vendor);
		String[] arr  = systemOutRule.getLogWithNormalizedLineSeparator().split("\n");
		String result = arr[arr.length-1];
		Assert.assertEquals("Data Added successfully", result);
	
	}

	

	/**
	 *
	 * @see com.cg.capbrading.repository.VendorDAOImpl#deleteVendor(Vendor)
	 */
	@Test
	public void deleteVendor() {
		Vendor vendor = new Vendor(100, "name", "brand", products);
		vendorDAOImpl.deleteVendor(vendor);
		String[] arr  = systemOutRule.getLogWithNormalizedLineSeparator().split("\n");
		String result = arr[arr.length-1];
		Assert.assertEquals("Data Removed successfully", result);
	}

	/**
	 *
	 * @see com.cg.capbrading.repository.VendorDAOImpl#updateVendor(Vendor)
	 */
	@Test
	public void updateVendor() {
		Vendor vendor = new  Vendor(100, "name", "brand", products);
		vendorDAOImpl.updateVendor(vendor);
		String[] arr  = systemOutRule.getLogWithNormalizedLineSeparator().split("\n");
		String result = arr[arr.length-1];
		Assert.assertEquals("Data Updated successfully", result);
	}

	/**
	 *
	 * @see com.cg.capbrading.repository.VendorDAOImpl#viewAllVendors()
	 */
	@Test
	public void viewAllVendors() {
		Vendor vendor = new Vendor(100, "name", "brand", products);
		vendorDAOImpl.addVendor(vendor);
		List<Vendor> result = vendorDAOImpl.viewAllVendors();
		
				
							assertTrue("result should be not null and not empty", result != null && !result.isEmpty());
	}

}
