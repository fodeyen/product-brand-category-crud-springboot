package com.ayrotek.backend.coding.challenge.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ayrotek.backend.coding.challenge.model.UserRole;
@Repository
@Transactional
public class HibernateUserRoleRepository implements IUserRoleRepository{

	@Autowired
	private EntityManager entityManager;
	
	@Transactional
	@Override
	public List<UserRole> getAllUserRoles() {
		
		Session session=entityManager.unwrap(Session.class);
		List<UserRole> userRoles=session.createQuery("from UserRole",UserRole.class).getResultList();		
		return userRoles;
	}

	@Transactional
	@Override
	public UserRole addUserRole(UserRole userRole) {
		Session session=entityManager.unwrap(Session.class);
		session.save(userRole);
		return userRole;
	}

	@Transactional
	@Override
	public UserRole updateUserRole(UserRole userRole) {
		Session session=entityManager.unwrap(Session.class);
		session.saveOrUpdate(userRole);
		return userRole;
	}

	@Transactional
	@Override
	public UserRole deleteUserRole(int id) {
		Session session=entityManager.unwrap(Session.class);
		UserRole deleteToUserRole=session.get(UserRole.class,id);
		session.delete(deleteToUserRole);
		return deleteToUserRole;
	}

	@Transactional
	@Override
	public int count() {
		Session session=entityManager.unwrap(Session.class);
		List<UserRole> userRoles=session.createQuery("from UserRole",UserRole.class).getResultList();	
		if(userRoles==null) {
			return 0;
		}
		return userRoles.size();
	}

}
