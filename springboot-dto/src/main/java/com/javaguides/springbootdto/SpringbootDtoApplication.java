package com.javaguides.springbootdto;

import com.javaguides.springbootdto.model.Location;
import com.javaguides.springbootdto.model.User;
import com.javaguides.springbootdto.repository.LocationRepository;
import com.javaguides.springbootdto.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootDtoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDtoApplication.class, args);
	}
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private LocationRepository locationRepository;
	//run method execute whenever springboot application stars
	@Override
	public void run(String... args) throws Exception {
		Location location = new Location();
		location.setPlace("Pune");
		location.setDescription("Pune is great place");
		location.setLatitude(40.1234);
		location.setLongitude(30.3456);
		locationRepository.save(location);

		User user1 =new User();
		user1.setName("forogh");
		user1.setLastName("parvas");
		user1.setEmail("email");
		user1.setPassword("password");
		user1.setLocation(location);
		userRepository.save(user1);


		User user2 =new User();
		user2.setName("forogh");
		user2.setLastName("parvas");
		user2.setEmail("email");
		user2.setPassword("password");
		user2.setLocation(location);
		userRepository.save(user2);


	}
}
