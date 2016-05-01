package com.test.ejb.jboss7.service.impl;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import com.test.ejb.jboss7.dao.UserDao;
import com.test.ejb.jboss7.model.User;
import com.test.ejb.jboss7.service.UserService;
import com.test.ejb.jboss7.service.UserServiceRemote;

@Stateless(name = "userService")
@Remote(UserServiceRemote.class)
public class UserServiceImpl implements UserService {

	public User save(User user) {
		UserDao.saveOrUpdate(user);
		return user;
	}

	public User loadById(Long id) {
		return UserDao.getUser(id);
	}

	public List<User> list() {
		return UserDao.listAll();
	}

}
