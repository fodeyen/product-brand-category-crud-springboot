package com.ayrotek.backend.coding.challenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ayrotek.backend.coding.challenge.model.User;



public interface UserRepository extends JpaRepository<User, Long> {

	User findByUserName(String userName);

}
