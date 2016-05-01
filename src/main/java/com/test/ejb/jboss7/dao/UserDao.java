package com.test.ejb.jboss7.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.test.ejb.jboss7.model.User;

public final class UserDao {

	private static Long sequence = 0L;
	
	private static Map<Long, User> mapUser;
	
	static {
		mapUser = new HashMap<Long, User>();
		
		User user = new User(nextSequence(), "user1");
		mapUser.put(user.getId(), user);
		
		user = new User(nextSequence(), "user2");
		mapUser.put(user.getId(), user);
	}
	
	private UserDao() {
		
	}
	
	private static Long nextSequence() {
		return ++sequence;
	}
	
	public static User getUser(Long id) {
		return mapUser.get(id);
	}
	
	public synchronized static void saveOrUpdate(User user) {
		
		if(user.getId() == null) {
			user.setId(nextSequence());
		} 
		
		mapUser.put(user.getId(), user);
	}
	
	public static List<User> listAll() {
		return new ArrayList<User>(mapUser.values());
	}
	
}
