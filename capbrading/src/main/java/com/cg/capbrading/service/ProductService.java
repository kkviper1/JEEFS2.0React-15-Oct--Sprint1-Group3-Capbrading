/**
 * 
 */
package com.cg.capbrading.service;

import java.util.List;

import com.cg.capbrading.entity.Product;
import com.cg.capbrading.entity.Vendor;

/**
 * This ProductService will perform all the business logic
 * like: addProduct, deleteProduct, updateProduct, viewProductsByCategory, viewProductsByBrand, viewProductsByVendor, viewAllProducts
 * @author karan
 *
 */
public interface ProductService {
	
	/**
	 * Passes the product to the repository layer to be added
	 * 
	 * @param product
	 */
	public void addProduct(Product product);
	
	/**
	 * Passes the product to the repository layer to be removed
	 * 
	 * @param product
	 */
	public void deleteProduct(Product product);
	
	/**
	 * Passes the product to the repository layer to be updated
	 * 
	 * @param product
	 */
	public void updateProduct(Product product);
	
	/**
	 * 
	 * Gets a list of all products from a categroy
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
	 * Gets a list of all products from the repository layer
	 * @return
	 */
	public List<Product> viewAllProducts();
}
