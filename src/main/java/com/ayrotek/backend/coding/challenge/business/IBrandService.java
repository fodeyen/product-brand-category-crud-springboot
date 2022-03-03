package com.ayrotek.backend.coding.challenge.business;

import java.util.List;

import com.ayrotek.backend.coding.challenge.model.Brand;

public interface IBrandService {

	List<Brand>getAllBrand();
	Brand add(Brand brand);
	Brand update(Brand brand);
	Brand delete(int id);
}
