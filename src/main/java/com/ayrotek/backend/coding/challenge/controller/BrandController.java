package com.ayrotek.backend.coding.challenge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ayrotek.backend.coding.challenge.business.IBrandService;
import com.ayrotek.backend.coding.challenge.handler.ResponseHandler;
import com.ayrotek.backend.coding.challenge.model.Brand;

@RestController
@RequestMapping("/api")
public class BrandController {

	@Autowired
	private IBrandService brandService;
	
	@GetMapping("/brands")
	public ResponseEntity<Object> getAllBrand(){
		return ResponseHandler.generateResponse(HttpStatus.OK, true, "Başarılı", brandService.getAllBrand());
	}
	
	@PostMapping("/add-brand")
	public ResponseEntity<Object> addBrand(@RequestBody Brand brand){
		return ResponseHandler.generateResponse(HttpStatus.OK, true, "Başarılı", brandService.add(brand));
	}
	
	
	@PostMapping("/update-brand")
	public ResponseEntity<Object> updadeBrand(@RequestBody Brand brand){
		return ResponseHandler.generateResponse(HttpStatus.OK, true, "Başarılı", brandService.update(brand));
	}
	
	@PostMapping("/delete-brand/{id}")
	public ResponseEntity<Object> deleteBrand(@PathVariable int id){
		return ResponseHandler.generateResponse(HttpStatus.OK, true, "Başarılı", brandService.delete(id));
	}
	
	
}
