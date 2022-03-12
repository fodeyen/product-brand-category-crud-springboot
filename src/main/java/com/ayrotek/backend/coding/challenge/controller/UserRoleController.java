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

import com.ayrotek.backend.coding.challenge.business.IUserRoleService;
import com.ayrotek.backend.coding.challenge.handler.ResponseHandler;
import com.ayrotek.backend.coding.challenge.model.UserRole;

@RestController
@RequestMapping("/api")
public class UserRoleController {

	@Autowired
	private IUserRoleService userRoleService;

	@GetMapping("/roles")
	public ResponseEntity<Object> getAllUserRoles() {
		return ResponseHandler.generateResponse(HttpStatus.OK, true, "Başarılı", userRoleService.getAllUserRoles());

	}
	
	@PostMapping("/add-role")
	public ResponseEntity<Object>addUserRole(@RequestBody UserRole userRole){
		return ResponseHandler.generateResponse(HttpStatus.OK, true, "Başarılı", userRoleService.addUserRole(userRole));
	}
	
	@PostMapping("/update-role")
	public ResponseEntity<Object>updateUserRole(@RequestBody UserRole userRole){
		return ResponseHandler.generateResponse(HttpStatus.OK, true, "Başarılı", userRoleService.updateUserRole(userRole));
	}
	
	@PostMapping("/delete-role")
	public ResponseEntity<Object>deleteUserRole(@PathVariable int id){
		return ResponseHandler.generateResponse(HttpStatus.OK, true, "Başarılı", userRoleService.deleteUserRole(id));
	}
}
