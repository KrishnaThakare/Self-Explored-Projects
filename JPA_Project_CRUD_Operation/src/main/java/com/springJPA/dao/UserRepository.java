package com.springJPA.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.springJPA.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	public List<User> findByNameStartingWith(String name);

	public List<User> findByNameEndingWith(String name);

	// dynamic query method
	@Query("select u from User u")
	public List<User> getUser();

	@Query("select u from User u where u.name=:n and u.city=:c")
	public List<User> getSingleUser(@Param("n") String name, @Param("c") String city);

	//native query method
	@Query(value = "select * from user" , nativeQuery = true)
	public List<User> getAllUser();

}
