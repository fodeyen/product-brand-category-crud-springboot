package com.ayrotek.backend.coding.challenge.response;

import com.ayrotek.backend.coding.challenge.model.User;

import lombok.Data;

@Data
public class UserResponse {
	
	Long id;
	int avatarId;
	String userName;

	public UserResponse(User entity) {
		this.id = entity.getId();
		this.userName = entity.getUserName();
	} 
}
