/**
 * 
 */
package com.cg.capbrading.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Utility class for JPA EntityManager
 * @author karan
 *
 */
public class JPAUtil {
	
		/**
		 * Creates object for EntityManager
		 * @return
		 */
		public static EntityManager getEntityManager() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		return emf.createEntityManager();
		
		}
		
	
}
