package com.cctnsdiary.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cctnsdiary.entities.User;

public interface UserRepo extends JpaRepository<User, Integer> {
	
	

}
