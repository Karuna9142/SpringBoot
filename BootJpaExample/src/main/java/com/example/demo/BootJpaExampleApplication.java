package com.example.demo;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entities.Users;
import com.example.demo.repo.UserRepository;

@SpringBootApplication
public class BootJpaExampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(BootJpaExampleApplication.class, args);
		UserRepository userRepository =   context.getBean(UserRepository.class);
		
		//Create
		
		//used to save single object
//		Users user = new Users();
//		
//		user.setName("Karuna");
//		user.setCity("Ranchi");
//		user.setStatus("Java Programmer");
//		
//		Users user1 = userRepository.save(user);
//		System.out.println(user1);
		
		
//		Users user1 = new Users();
//		user1.setName("Priyanka");
//		user1.setCity("Ranchi");
//    	user1.setStatus("python Programmer");
//    	
//        Users user2 = new Users();
//		user2.setName("kriti");
//		user2.setCity("gumla");
//    	user2.setStatus("c Programmer");
//    	
//    	 Users  ans = userRepository.save(user1);
//		System.out.println("saved user "+ans);
//		
//		 Users  ans1 = userRepository.save(user2);
//			System.out.println("saved user "+ans1);
//    	
    	//used to save multiple object
//    	List<Users> users  =   List.of(user1, user2);
//    	userRepository.saveAll(users);
    	
			/*
    	List<Users> users  =   List.of(user1, user2);
    	
    	//save mulipl object
    	Iterable<Users> result = userRepository.saveAll(users);
    	
    	result.forEach(user->{
    		System.out.println(user);
    	});
    	*/	
		
		//Update the user // optional is a class
//		Optional<Users> optional = userRepository.findById(1);
//		Users user = optional.get();
//		
//		user.setName("Abhishek");
//		userRepository.save(user);
//		
//		System.out.println(user);
//				
		
		//Using Iterator to get all data
		//Iterable itr = userRepository.findAll();
//		Iterator iterator = itr.iterator();
//		
//		while(iterator.hasNext())
//		{
//			Object user = iterator.next();
//			System.out.println(user);
//		}
		
		//using lambda function
		//itr.forEach(user->System.out.println(user));
		//4 method to delete the data- deleteById(),deleteAll()......
		
		//to delete single item
//		userRepository.deleteById(2);
//		System.out.println("deleted");
		
//		Iterable<Users> alluser = userRepository.findAll();
//		alluser.forEach(user-> System.out.println(user));
//		
//		userRepository.deleteAll(alluser);
//		
		/*
	   List<Users> user = userRepository.findByName("Priyanka");
	   //here i have passed lambda e
	   user.forEach(e->System.out.println(e));
	   */
		
	   //findByNameAndCity Method
//	   List<Users> user = userRepository.findByNameAndCity("Kriti", "Gumla");
//	   user.forEach(e->System.out.println(e));
		
//	   List<Users> user1 = userRepository.findByNameStartingWith("K");
//	   user1.forEach(e->System.out.println(e));
	   
//	   List<Users> user2 = userRepository.findByNameEndingWith("a");
//	   user2.forEach(e->System.out.println(e));
////	   
//	   List<Users> user3 = userRepository.findByNameContaining("yan");
//	   user3.forEach(e->System.out.println(e));
		
//		List<Users> allUser = userRepository.getAllUser();
//		allUser.forEach(e->{
//			System.out.println(e);
//		});
		List<Users> allUser = userRepository.getUserByName("Priyanka");
		allUser.forEach(e->{
			System.out.println(e);
		});
		
		System.out.println("___________________________");
		userRepository.getUser().forEach(e->System.out.println(e));
		
				
	}
	

}
