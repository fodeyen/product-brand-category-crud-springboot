package com.ayrotek.backend.coding.challenge.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.ayrotek.backend.coding.challenge.business.IUserRoleService;
import com.ayrotek.backend.coding.challenge.model.UserRole;
import com.ayrotek.backend.coding.challenge.repository.IUserRoleRepository;

@Component
public class UserRoleDpu implements ApplicationListener<ApplicationEvent>{


	@Autowired
	private IUserRoleService userRoleService;
	
	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		seedData();
		
	}

	private void seedData() {

		if(userRoleService.count() > 0) {
			return;
		}	
		
		UserRole userRole=new UserRole(1L,"admin");
		
		userRoleService.addUserRole(userRole);
		
	}

	

}
