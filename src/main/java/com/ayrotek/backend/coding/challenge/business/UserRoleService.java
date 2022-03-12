package com.ayrotek.backend.coding.challenge.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ayrotek.backend.coding.challenge.model.UserRole;
import com.ayrotek.backend.coding.challenge.repository.IUserRoleRepository;
@Service
@Transactional
public class UserRoleService implements IUserRoleService{

	@Autowired
	private IUserRoleRepository userRoleRepository;
	
	@Override
	public List<UserRole> getAllUserRoles() {
		return userRoleRepository.getAllUserRoles();
	}

	@Override
	public UserRole addUserRole(UserRole userRole) {
		return userRoleRepository.addUserRole(userRole);
	}

	@Override
	public UserRole updateUserRole(UserRole userRole) {
		return userRoleRepository.updateUserRole(userRole);
	}

	@Override
	public UserRole deleteUserRole(int id) {
		return userRoleRepository.deleteUserRole(id);
	}

	@Override
	public int count() {
		return userRoleRepository.count();
	}

}
