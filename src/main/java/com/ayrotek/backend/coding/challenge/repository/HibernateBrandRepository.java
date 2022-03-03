package com.ayrotek.backend.coding.challenge.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ayrotek.backend.coding.challenge.model.Brand;
@Repository
@Transactional
public class HibernateBrandRepository implements IBrandRepository{

	@Autowired
	EntityManager entityManager;
	
	@Transactional
	@Override
	public List<Brand> getAllBrand() {
		Session session=entityManager.unwrap(Session.class);
		List<Brand> brand=session.createQuery("from Brand",Brand.class).getResultList();
		return brand;
	}

	@Transactional
	@Override
	public Brand add(Brand brand) {
		Session session=entityManager.unwrap(Session.class);
		session.save(brand);
		return brand;
	}

	@Transactional
	@Override
	public Brand update(Brand brand) {
		Session session=entityManager.unwrap(Session.class);
		session.saveOrUpdate(brand);
		return brand;
	}

	@Transactional
	@Override
	public Brand delete(int id) {
		Session session=entityManager.unwrap(Session.class);
		Brand deleteToBrand=session.get(Brand.class, id);
		session.delete(deleteToBrand);
		return deleteToBrand;
	}

}
