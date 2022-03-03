package com.ayrotek.backend.coding.challenge.business;

import java.util.List;

import com.ayrotek.backend.coding.challenge.model.Category;

public interface ICategoryService {
	
	List<Category> getAllCategory();
	Category addCategory(Category category);
	Category updateCategory(Category category);
	Category deleteCategory(int id);

}
