package com.exam.service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.model.User;
import com.exam.model.UserRole;
import com.exam.repository.RoleRepository;
import com.exam.repository.UserRepository;
import com.exam.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private RoleRepository roleRepository;

	// Creating User
	@Override
	public User createUser(User user, Set<UserRole> userRoles) {
		User local = this.userRepository.findByUsername(user.getUsername());
		if (local != null) {
			System.out.println("User is already Exist");
		} else {
			for (UserRole ur : userRoles) {
				roleRepository.save(ur.getRole());
			}
			user.getUserRoles().addAll(userRoles);
			local = this.userRepository.save(user);
		}
		return local;
	}
 
	// Getting User by username
	@Override
	public User getUser(String Username) {
		
		return this.userRepository.findByUsername(Username);
	}

	// Delete User by user id
	@Override
	public void deleteUser(Long userId) {
		this.userRepository.deleteById(userId);
		
	}

}
