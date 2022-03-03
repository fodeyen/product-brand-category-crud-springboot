package com.ayrotek.backend.coding.challenge.repository;

import java.util.List;

import com.ayrotek.backend.coding.challenge.model.Category;

public interface ICategoryRepository {

	List<Category> getAllCategory();
	Category addCategory(Category category);
	Category updateCategory(Category category);
	Category deleteCategory(int id);
}
