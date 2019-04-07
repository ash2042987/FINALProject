package com.FINALAPPProjectMVN.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import com.FINALAPP.ProjectMVN.entity.User;
import com.FINALAPP.ProjectMVN.service.UsersService;

@RestController
public class UsersController {
		
	private static final Logger logger = LogManager.getLogger(UsersController.class);
	
	
		@Autowired
		UsersService service;
	
		@RequestMapping(value="/users", method=RequestMethod.POST)
		public User addUser(@RequestBody User user) {
			return service.createUser(user);
		}
		
		@RequestMapping("/users")
		public Iterable<User> getUsers() {
			logger.debug("Debugging log");
			logger.info("Info Log");
			logger.warn("Oops!Warning!");
			logger.error("ERROR ALERT");
			logger.fatal("redo, it's fatal");
			return service.getUsers();
		}
		
		@RequestMapping("/users/{id}")
		public User getAdminUser(@PathVariable Long id) {
			return service.getUser(id);
		}
		
		@RequestMapping("/users")
		public Iterable<User> getAdminUsers() {
			return service.getUsers();
		}
		
		@RequestMapping(value="/users", method=RequestMethod.POST)
		public User addAdminUser(@RequestBody User user) {
			return service.createUser(user);
		}
		
		@RequestMapping(value="/users/{id}", method=RequestMethod.PUT)
		public User updateAdminUser(@PathVariable Long id, @RequestBody User user) {
			return service.updateUser(id, user);
		}
		
		@RequestMapping(value="/users/{id}", method=RequestMethod.DELETE)
		public void deleteAdminUser(@PathVariable Long id) {
			service.deleteUser(id);
		}
		
		@RequestMapping(value="/users/{id}", method=RequestMethod.PUT)
		public User updateUser(@PathVariable Long id, @RequestBody User user) {
			return service.updateUser(id, user);
		}
		
		@RequestMapping(value="/users/{id}", method=RequestMethod.DELETE)
		public void deleteUser(@PathVariable Long id) {
			service.deleteUser(id);
		}
		
		@RequestMapping(value="/users", method=RequestMethod.POST)
		public User addPost(@RequestBody User id) {
			return service.createUser(id);
		}
		
		@RequestMapping(value="/users", method=RequestMethod.POST)
		public User addComment(@RequestBody User id) {
			return service.createUser(id);
		}
		
		@RequestMapping("/users")
		public Iterable<User> getPosts() {
			return service.getUsers();
		}
		
		
	}




	
	
	