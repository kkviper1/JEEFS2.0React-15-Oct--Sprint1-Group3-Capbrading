package com.cg.capbrading.util;

import static org.junit.jupiter.api.Assertions.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.Test;

class JPAUtilTest {

	@Test
	void testGetEntityManager() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = emf.createEntityManager();
		EntityManager entitymanager=JPAUtil.getEntityManager();
		assertNotNull(entitymanager);
		assertNotNull(em);
	}

}
