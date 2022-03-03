package com.ayrotek.backend.coding.challenge.business;

import java.util.List;

import com.ayrotek.backend.coding.challenge.model.Product;

public interface IProductService {

	List<Product> getAll();
	Product update(Product product);
	Product add(Product product);
	Product delete(int id);
	
}
