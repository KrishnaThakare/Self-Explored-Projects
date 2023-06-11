package com.springJPA;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.springJPA.dao.UserRepository;
import com.springJPA.entity.User;

@SpringBootApplication
public class JpaProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(JpaProjectApplication.class, args);
		
		UserRepository userRepository = context.getBean(UserRepository.class);
		
//		User user = new User();
//		user.setName("Krishna Thakare");
//		user.setCity("Murtizapur");
//		user.setStatus("Married");
//		// For save single user
////		User save = userRepository.save(user);
//		
//		User user1 = new User();
//		user1.setName("Roshan Thakare");
//		user1.setCity("Akola");
//		user1.setStatus("UnMarried");
//		User user2 = new User();
//		user2.setName("Shubhangi Thakare");
//		user2.setCity("Murtizapur");
//		user2.setStatus("Married");
//		User user3 = new User();
//		user3.setName("Shridhar Thakare");
//		user3.setCity("Turkhed");
//		user3.setStatus("Married");
////		
////		// For saving multiple users
//		List<User> list = List.of(user, user1, user2, user3);
//		list.forEach(userlist ->System.out.println(userlist));
//		userRepository.saveAll(list);
//		
//		// For getting one user by id
//		Optional<User> id = userRepository.findById(1);
//		System.out.println(id);
//		
//		// Get all user
//		Iterable<User> iterable = userRepository.findAll();
//		iterable.forEach(user-> System.out.println(user));
//		
//		// For updating user
//		Optional<User> id1 = userRepository.findById(1);
//		User user = id1.get();
//		user.setName("Savita Thakare");
//		User saveuser = userRepository.save(user);
//		
//		// Delete user by id
//		userRepository.deleteById(2);
		
		// Delete all user
//		userRepository.deleteAll();
		
		// Delete all user by iterable
//		Iterable<User> iterable = userRepository.findAll();
//		iterable.forEach(user-> System.out.println(user));
//		userRepository.deleteAll(iterable);
		
		// Get user by name
//		List<User> byName = userRepository.findByNameStartingWith("kr");
//		byName.forEach(name->System.out.println("Starting with Kr \n"+name));
//		
		// Get user by Ending name
//		List<User> endingWith = userRepository.findByNameEndingWith("re");
//		endingWith.forEach(end->System.out.println(end));
		
		userRepository.getUser().forEach(user->System.out.println(user));
		System.out.println("--------------------------------------------------");
		userRepository.getSingleUser("Shubhangi Thakare", "Murtizapur").forEach(user->System.out.println(user));
		System.out.println("--------------------------------------------------");
		userRepository.getAllUser().forEach(user->System.out.println(user));
	}
}
