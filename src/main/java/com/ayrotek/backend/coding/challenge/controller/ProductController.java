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

import com.ayrotek.backend.coding.challenge.business.IProductService;
import com.ayrotek.backend.coding.challenge.handler.ResponseHandler;
import com.ayrotek.backend.coding.challenge.model.Product;

@RestController
@RequestMapping("/api")
public class ProductController {
	
	@Autowired
	private IProductService productService;

	@GetMapping("/products")
	public ResponseEntity<Object> getAllProduct(){
		
		return ResponseHandler.generateResponse(HttpStatus.OK, true,"Başarılı", productService.getAll());
		
	}
	
	@PostMapping("/update")
	public ResponseEntity<Object> updateProduct(@RequestBody Product product){
		
		return ResponseHandler.generateResponse(HttpStatus.OK, true, "Başarılı", productService.update(product));
		
	}
	
	@PostMapping("/add")
	public ResponseEntity<Object> saveProduct(@RequestBody Product product){
		
		return ResponseHandler.generateResponse(HttpStatus.OK, true, "Başarılı", productService.add(product));
		
	}
	@PostMapping("/delete/{id}")
	public ResponseEntity<Object> deleteProduct(@PathVariable int id){
		return ResponseHandler.generateResponse(HttpStatus.OK, true, "Başarılı", productService.delete(id));
	}
	
	

}
