package com.FINALAPP.ProjectMVN.repository;

import org.springframework.data.repository.CrudRepository;

import com.FINALAPP.ProjectMVN.entity.User;

public interface UserRepository extends CrudRepository <User, Long> {
	

}
