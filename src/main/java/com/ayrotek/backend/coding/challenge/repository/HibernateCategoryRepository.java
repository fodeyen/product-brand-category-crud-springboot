package com.ayrotek.backend.coding.challenge.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ayrotek.backend.coding.challenge.model.Brand;
import com.ayrotek.backend.coding.challenge.model.Category;

@Repository
@Transactional
public class HibernateCategoryRepository implements ICategoryRepository{

	@Autowired
	 private EntityManager entityManager;
	
	@Transactional
	@Override
	public List<Category> getAllCategory() {
		Session session=entityManager.unwrap(Session.class);
		List<Category> category=session.createQuery("from Category",Category.class).getResultList();
		return category;
	}

	@Transactional
	@Override
	public Category addCategory(Category category) {
		Session session=entityManager.unwrap(Session.class);
		session.save(category);
		return category;
	}

	@Transactional
	@Override
	public Category updateCategory(Category category) {
		Session session=entityManager.unwrap(Session.class);
		session.saveOrUpdate(category);
		return category;
	}

	@Transactional
	@Override
	public Category deleteCategory(int id) {
		Session session=entityManager.unwrap(Session.class);
		Category deleteToCategory=session.get(Category.class, id);
		session.delete(deleteToCategory);
		return deleteToCategory;
	}

}
