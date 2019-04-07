package com.FINALAPP.ProjectMVN.repository;

import org.springframework.data.repository.CrudRepository;

import com.FINALAPP.ProjectMVN.entity.User;

public interface AdminUserRepository extends CrudRepository <User, Long> {
	
	public User findbyUsername(String username);
	
	
}
