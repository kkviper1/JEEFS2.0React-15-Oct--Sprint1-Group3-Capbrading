/**
 * 
 */
package com.cg.capbrading.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.jboss.logging.Logger;
import org.jboss.logging.Logger.Level;

import com.cg.capbrading.entity.Vendor;
import com.cg.capbrading.util.JPAUtil;

/**
 * VendorDAOImpl implements VenderDAO
 * @author karan
 *
 */
public class VendorDAOImpl implements VendorDAO {

	EntityManager em = JPAUtil.getEntityManager();
	private final static Logger logger = Logger.getLogger(VendorDAOImpl.class.getName());
	
	@Override
	public void addVendor(Vendor vendor) {
		em.getTransaction().begin();
		em.persist(vendor);
		em.getTransaction().commit();
		System.out.println("Data Added successfully");
		logger.log(Level.INFO, "Data added successfully");
		

	}

	@Override
	public void deleteVendor(Vendor vendor) {
		try {
			em.getTransaction().begin();
			em.merge(vendor);
			em.remove(vendor);
			em.getTransaction().commit();
			System.out.println("Data Removed successfully");
			logger.log(Level.INFO, "Data removed successfully");
		}
		catch(IllegalArgumentException e)
		{
			
			e.printStackTrace();
			
		}

	}

	@Override
	public void updateVendor(Vendor vendor) {
		
		em.getTransaction().begin();
		em.merge(vendor);
		em.getTransaction().commit();
		System.out.println("Data Updated successfully");
		logger.log(Level.INFO, "Data updated successfully");


	}

	@Override
	public List<Vendor> viewAllVendors() {
		 CriteriaBuilder cb = em.getCriteriaBuilder();
		 CriteriaQuery<Vendor> cq = cb.createQuery(Vendor.class);
		 Root<Vendor> rootEntry = cq.from(Vendor.class);
		 CriteriaQuery<Vendor> all = cq.select(rootEntry);
	 
		 TypedQuery<Vendor> allQuery = em.createQuery(all);
		 return allQuery.getResultList();
	}

}
