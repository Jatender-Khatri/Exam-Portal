package com.exam;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.exam.model.Role;
import com.exam.model.User;
import com.exam.model.UserRole;
import com.exam.service.UserService;

@SpringBootApplication
public class ExamPortalApplication implements CommandLineRunner{

	@Autowired
	private UserService userService;
	public static void main(String[] args) {
		SpringApplication.run(ExamPortalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Staring Coding");
//		User user = new User();
//		user.setUsername("kumarjatender0@gmail.com");
//		user.setFirstName("Jatender");
//		user.setLastName("Khatri");
//		user.setPassword("Jatener124");
//		user.setPhone("3434243");
//		user.setProfile("default.png");
//		
//		Role role = new Role();
//		role.setRoleId(44L);
//		role.setRoleName("Admin");
//		
//		Set<UserRole> userRoles = new HashSet<>();
//		UserRole userRole = new UserRole();
//		userRole.setRole(role);
//		userRole.setUser(user);
//		userRoles.add(userRole);
//		
//		User user2 = this.userService.createUser(user, userRoles);
//		System.out.println("User  : " + user2.getUsername());
		
		
	}

}
