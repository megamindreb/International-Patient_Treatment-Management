package com.cognizant.auth;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 
 * @author Pratik, Shubham, Pratik, Kavya
 * 
 * 		 With the @SpringBootTest annotation, Spring Boot provides a 
 * 		 convenient way to start up an application context to be used in a test
 *
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class AuthorizationMicroserviceApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void applicationStarts() {
		AuthorizationMicroserviceApplication.main(new String[] {});
	}
}
