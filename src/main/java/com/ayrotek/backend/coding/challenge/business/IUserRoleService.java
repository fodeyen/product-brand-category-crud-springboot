package com.ayrotek.backend.coding.challenge.business;

import java.util.List;

import com.ayrotek.backend.coding.challenge.model.UserRole;

public interface IUserRoleService {
	
	List<UserRole> getAllUserRoles();
	UserRole addUserRole(UserRole userRole);
	UserRole updateUserRole(UserRole userRole);
	UserRole deleteUserRole(int id);
	int count();
}
