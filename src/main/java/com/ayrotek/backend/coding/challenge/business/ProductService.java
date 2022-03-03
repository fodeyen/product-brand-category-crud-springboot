package com.ayrotek.backend.coding.challenge.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ayrotek.backend.coding.challenge.model.Product;
import com.ayrotek.backend.coding.challenge.repository.IProductRepository;
@Service
@Transactional
public class ProductService implements IProductService{

	@Autowired
	private IProductRepository productRepository;
	
	@Override
	public List<Product> getAll() {
		
		return productRepository.getAll();
	}

	@Override
	public Product update(Product product) {
		
		return productRepository.update(product);
	}

	@Override
	public Product add(Product product) {
	
		return productRepository.add(product);
	}

	@Override
	public Product delete(int id) {
		
		return productRepository.delete(id);
	}

}
