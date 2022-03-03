package com.ayrotek.backend.coding.challenge.repository;

import java.util.List;

import com.ayrotek.backend.coding.challenge.model.Brand;

public interface IBrandRepository {
	
	
	List<Brand>getAllBrand();
	Brand add(Brand brand);
	Brand update(Brand brand);
	Brand delete(int id);
	

}
