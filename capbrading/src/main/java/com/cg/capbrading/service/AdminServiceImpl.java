package com.cg.capbrading.service;

	import java.util.List;

import com.cg.capbrading.entity.Admin;
import com.cg.capbrading.repository.AdminDAO;
	import com.cg.capbrading.repository.AdminDAOImpl;

	/**
	 * @author Lakshmi
	 *
	 */
	public class AdminServiceImpl implements AdminService {

		AdminDAO adminDAO = new AdminDAOImpl();
		@Override
		public void addAdmin(Admin admin) {
			adminDAO.addAdmin(admin);

		}

		@Override
		public void deleteAdmin(Admin admin) {
			adminDAO.deleteAdmin(admin);

		}

		@Override
		public void updateAdmin(Admin admin) {
			adminDAO.updateAdmin(admin);

		}

		@Override
		public List<Admin> viewAllAdmin() {	
			return adminDAO.viewAllAdmin();
		}

	}


