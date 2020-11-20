package com.cg.capbrading.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.cg.capbrading.entity.Admin;
import com.cg.capbrading.util.JPAUtil;

/**
 * @author Lakshmi
 *
 */
public class AdminDAOImpl implements AdminDAO {

	EntityManager em = JPAUtil.getEntityManager();
	
	@Override
	public void addAdmin(Admin admin) {
		em.getTransaction().begin();
		em.persist(admin);
		em.getTransaction().commit();
		System.out.println("Data Added successfully");

	}

	@Override
	public void deleteAdmin(Admin  admin){
		try {
			em.getTransaction().begin();
			em.remove(admin);
			em.getTransaction().commit();
			System.out.println("Data Removed successfully");
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Not found");
		}

	}

	@Override
	public void updateAdmin(Admin admin) {
		Admin updateAdmin = em.find(Admin.class, admin.getId());
		
		em.getTransaction().begin();
		updateAdmin = admin;
		em.getTransaction().commit();
		System.out.println("Data Updated successfully");

	}

	@Override
	public List<Admin> viewAllAdmin() {
		 CriteriaBuilder cb = em.getCriteriaBuilder();
		 CriteriaQuery<Admin> cq = cb.createQuery(Admin.class);
		 Root<Admin> rootEntry = cq.from(Admin.class);
		 CriteriaQuery<Admin> all = cq.select(rootEntry);
	 
		 TypedQuery<Admin> allQuery = em.createQuery(all);
		 return allQuery.getResultList();
	}

}
