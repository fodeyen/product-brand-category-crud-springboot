package com.ayrotek.backend.coding.challenge.repository;

import java.util.List;

import com.ayrotek.backend.coding.challenge.model.UserRole;

public interface IUserRoleRepository {
	
	List<UserRole> getAllUserRoles();
	UserRole addUserRole(UserRole userRole);
	UserRole updateUserRole(UserRole userRole);
	UserRole deleteUserRole(int id);

}
