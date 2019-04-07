package com.FINALAPP.ProjectMVN.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FINALAPP.ProjectMVN.entity.User;
import com.FINALAPP.ProjectMVN.repository.UserRepository;



@Service
public class UsersService {
	
	@Autowired
	UserRepository repo;
	
	public User getUser(Long id) {
		return repo.findOne(id);
		
	}
	
	public Iterable<User> getUsers() {
		return repo.findAll();
	}
	
	public void deleteUser(Long id) {
		repo.delete(id); 
		
	}
	
	public User updateUser(Long id, User user) {
		User foundUser = repo.findOne(id);
		if (foundUser != null) {
			foundUser.setFirstName(user.getFirstName());
			foundUser.setAdminUser(user.getAdminUser());
			foundUser.setPostId(user.getPostId());
			repo.save(foundUser);
		}
			return foundUser;
			
		}
	
	public User createUser(User user) {
		return repo.save(user);
	
	}

}
