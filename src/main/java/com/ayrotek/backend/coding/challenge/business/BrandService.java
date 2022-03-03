package com.ayrotek.backend.coding.challenge.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ayrotek.backend.coding.challenge.model.Brand;
import com.ayrotek.backend.coding.challenge.repository.IBrandRepository;
@Service
@Transactional
public class BrandService implements IBrandService{

	@Autowired
	IBrandRepository brandRepository;
	
	@Override
	public List<Brand> getAllBrand() {
		
		return brandRepository.getAllBrand();
	}

	@Override
	public Brand add(Brand brand) {
		
		return brandRepository.add(brand);
	}

	@Override
	public Brand update(Brand brand) {
		return brandRepository.update(brand);
	}

	@Override
	public Brand delete(int id) {
		return brandRepository.delete(id);
	}

}
