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

import com.ayrotek.backend.coding.challenge.business.ICategoryService;
import com.ayrotek.backend.coding.challenge.handler.ResponseHandler;
import com.ayrotek.backend.coding.challenge.model.Category;

@RestController
@RequestMapping("/api")
public class CategoryController {
	
	@Autowired
	private ICategoryService categoryService;
	
	@GetMapping("/categories")
	public ResponseEntity<Object> getAllCategory(){
		return ResponseHandler.generateResponse(HttpStatus.OK, true,"Başarılı", categoryService.getAllCategory());
	
	}
	
	@PostMapping("/add-category")
	public ResponseEntity<Object> addCategory(@RequestBody Category category){
		return ResponseHandler.generateResponse(HttpStatus.OK, true, "Başarılı", categoryService.addCategory(category));
	}
	
	@PostMapping("/update-category")
	public ResponseEntity<Object> updateCategory(@RequestBody Category category){
		return ResponseHandler.generateResponse(HttpStatus.OK, true, "Başarılı", categoryService.updateCategory(category));
	}
	
	@PostMapping("/delete-category/{id}")
	public ResponseEntity<Object> deleteCategory(@PathVariable int id){
		return ResponseHandler.generateResponse(HttpStatus.OK, true, "Başarılı", categoryService.deleteCategory(id));
	}
	
	

}
