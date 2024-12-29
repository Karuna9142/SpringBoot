package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.entities.Users;

public interface UserRepository extends CrudRepository<Users,Integer> {

	//findByName method
	public List<Users> findByName(String name);
	
	public List<Users> findByNameAndCity(String name, String city);
	
	public List<Users> findByNameStartingWith(String prefix);
	public List<Users> findByNameEndingWith(String suffix);
	public List<Users> findByNameContaining(String words);
	
	//HQL query
	@Query("Select u from Users u")
	public List<Users> getAllUser();
	
	@Query("Select u from Users u Where u.name=:k")
	//here i have bind the object with n using param
	public List<Users> getUserByName(@Param("k") String name);
	
	//Native Query
	@Query(value= "Select * from Users", nativeQuery = true)
	public List<Users> getUser();
}
