package com.ayrotek.backend.coding.challenge.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ayrotek.backend.coding.challenge.model.Category;
import com.ayrotek.backend.coding.challenge.repository.ICategoryRepository;
@Service
@Transactional
public class CategoryService implements ICategoryService{

	@Autowired
	private ICategoryRepository categoryRepository;
	
	@Override
	public List<Category> getAllCategory() {
		return categoryRepository.getAllCategory();
	}

	@Override
	public Category addCategory(Category category) {
		return categoryRepository.addCategory(category);
	}

	@Override
	public Category updateCategory(Category category) {
		return categoryRepository.updateCategory(category);
	}

	@Override
	public Category deleteCategory(int id) {

		return categoryRepository.deleteCategory(id);
	}

}
