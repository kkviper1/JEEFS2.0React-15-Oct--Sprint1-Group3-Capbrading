/**
 * 
 */
package com.cg.capbrading.repository;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.exception.ConstraintViolationException;

import com.cg.capbrading.entity.Product;
import com.cg.capbrading.entity.Vendor;
import com.cg.capbrading.util.JPAUtil;

/**
 * ProductDAOImpl implements ProductDAO
 * @author karan
 *
 */
public class ProductDAOImpl implements ProductDAO {
	
	EntityManager em = JPAUtil.getEntityManager();
	private final static Logger logger = Logger.getLogger(ProductDAOImpl.class.getName());
	CriteriaBuilder cb = em.getCriteriaBuilder();
	CriteriaQuery<Product> cq = cb.createQuery(Product.class);
	Root<Product> rootEntry = cq.from(Product.class);

	@Override
	public void addProduct(Product product) {
		try {
			em.getTransaction().begin();
			em.persist(product);
			em.getTransaction().commit();
			System.out.println("Data Added successfully");
			logger.log(Level.INFO,"Data Added successfully");
		} catch (ConstraintViolationException e) {
			System.out.println(e.getConstraintName());
			e.printStackTrace();
		}

	}

	@Override
	public void deleteProduct(Product product) {
		try {
			em.getTransaction().begin();
			em.remove(product);
			em.getTransaction().commit();
			System.out.println("Data Removed successfully");
			logger.log(Level.INFO, "Data Removed successfully");
		}
		catch(IllegalArgumentException e)
		{
			e.printStackTrace();
		}

	}

	@Override
	public void updateProduct(Product product) {
		
		em.getTransaction().begin();
		em.merge(product);
		em.getTransaction().commit();
		System.out.println("Data Updated successfully");
		logger.log(Level.INFO, "Data Updated successfully");
	}

	@Override
	public List<Product> viewProductsByCategory(String category) {
		CriteriaQuery<Product> cat = cq.select(rootEntry).where(cb.like(rootEntry.get("category"), category));
		TypedQuery<Product> categoryQuery = em.createQuery(cat);
		return categoryQuery.getResultList();
		
	}

	@Override
	public List<Product> viewProductsByBrand(String brand) {
		CriteriaQuery<Product> brd = cq.select(rootEntry).where(cb.like(rootEntry.get("brand"), brand));
		TypedQuery<Product> brandQuery = em.createQuery(brd);
		return brandQuery.getResultList();
				
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Product> viewProductsByVendor(Vendor vendor) {
		Query q = em.createNativeQuery("select product.* from product,vendor_product where vendor_product.vendor_id = ?");
		q.setParameter(1, vendor.getId());
		return q.getResultList();
	}

	@Override
	public List<Product> viewAllProducts() {
		 CriteriaQuery<Product> all = cq.select(rootEntry);
	 
		 TypedQuery<Product> allQuery = em.createQuery(all);
		 return allQuery.getResultList();
	}

}
