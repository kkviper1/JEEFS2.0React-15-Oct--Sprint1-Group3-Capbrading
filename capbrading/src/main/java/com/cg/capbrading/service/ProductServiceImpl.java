/**
 * 
 */
package com.cg.capbrading.service;

import java.util.List;

import com.cg.capbrading.entity.Product;
import com.cg.capbrading.entity.Vendor;
import com.cg.capbrading.repository.ProductDAO;
import com.cg.capbrading.repository.ProductDAOImpl;

/**
 * ProductServiceImpl implements ProductService
 * @author karan
 *
 */
public class ProductServiceImpl implements ProductService {

	ProductDAO productDAO = new ProductDAOImpl();
	
	@Override
	public void addProduct(Product product) {
		productDAO.addProduct(product);

	}

	@Override
	public void deleteProduct(Product product) {
		productDAO.deleteProduct(product);

	}

	@Override
	public void updateProduct(Product product) {
		productDAO.updateProduct(product);

	}

	@Override
	public List<Product> viewProductsByCategory(String category) {
		
		return productDAO.viewProductsByCategory(category);
	}

	@Override
	public List<Product> viewProductsByBrand(String brand) {
		return productDAO.viewProductsByBrand(brand);
	}

	@Override
	public List<Product> viewProductsByVendor(Vendor vendor) {
		return productDAO.viewProductsByVendor(vendor);
	}

	@Override
	public List<Product> viewAllProducts() {
		return productDAO.viewAllProducts();
	}

}
