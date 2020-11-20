/**
 * 
 */
package com.cg.capbrading.repository;

import java.util.List;

import com.cg.capbrading.entity.Product;
import com.cg.capbrading.entity.Vendor;

/**
 * This ProductDAO will perform all the CRUD operation on Product Entity using Database
 * @author karan
 *
 */
public interface ProductDAO {
	
	/**
	 * Adds product to the database
	 * @param product
	 */
	public void addProduct(Product product);
	
	/**
	 * Deletes product from the database
	 * @param product
	 */
	public void deleteProduct(Product product);
	
	/**
	 * Updates product in the database
	 * @param product
	 */
	public void updateProduct(Product product);
	
	/**
	 * Gets a list of all products in a certain category
	 * @param category
	 * @return
	 */
	public List<Product> viewProductsByCategory(String category);
	
	/**
	 * Gets a list of all products from a certain Brand
	 * @param brand
	 * @return
	 */
	public List<Product> viewProductsByBrand(String brand);
	
	/**
	 * Gets a list of all products from a certain Vendor
	 * @param vendor
	 * @return
	 */
	public List<Product> viewProductsByVendor(Vendor vendor);
	
	/**
	 * Gets a list of all products in the database
	 * @return
	 */
	public List<Product> viewAllProducts();

}
