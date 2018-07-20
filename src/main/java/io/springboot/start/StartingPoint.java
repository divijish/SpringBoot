package io.springboot.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication	//To make this Spring Boot application
public class StartingPoint {

	public static void main(String[] args) {
	SpringApplication.run(StartingPoint.class, args);	//here 'args' is the argument passed in main()

	}

}
