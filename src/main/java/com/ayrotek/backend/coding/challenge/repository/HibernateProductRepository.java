package com.ayrotek.backend.coding.challenge.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ayrotek.backend.coding.challenge.model.Product;

@Repository
@Transactional
public class HibernateProductRepository implements IProductRepository {

	@Autowired
	private EntityManager entityManager;
	
	@Transactional
	@Override
	public List<Product> getAll() {
		Session session = entityManager.unwrap(Session.class);
		List<Product> product = session.createQuery("from Product",Product.class).getResultList();
		return product;
		
		
	}

	@Transactional
	@Override
	public Product update(Product product) {
		Session session=entityManager.unwrap(Session.class);
		session.saveOrUpdate(product);
		return product;

		
		
	}

	@Transactional
	@Override
	public Product add(Product product) {
		Session session=entityManager.unwrap(Session.class);
		session.save(product);
		return product;
	}

	@Transactional
	@Override
	public Product delete(int id) {
		Session session=entityManager.unwrap(Session.class);
		Product deleteToProduct=session.get(Product.class, id);
		session.delete(deleteToProduct);
		
		return deleteToProduct;
	}

}
