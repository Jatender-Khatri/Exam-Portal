package com.exam.service;

import java.util.Set;

import com.exam.model.User;
import com.exam.model.UserRole;

public interface UserService {
	
	// Creating User
	public User createUser(User user, Set<UserRole> userRoles);
	
	// Get User By Usename
	public User getUser(String Username);
	
	// Delete User by User id
	public void deleteUser(Long userId);
}
