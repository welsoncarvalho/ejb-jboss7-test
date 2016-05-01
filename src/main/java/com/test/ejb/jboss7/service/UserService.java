package com.test.ejb.jboss7.service;

import java.util.List;

import javax.ejb.Local;

import com.test.ejb.jboss7.model.User;

@Local
public interface UserService {

	User save(User user);
	
	User loadById(Long id);
	
	List<User> list();
	
}
