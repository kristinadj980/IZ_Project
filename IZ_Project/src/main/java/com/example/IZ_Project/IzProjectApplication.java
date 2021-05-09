package com.example.IZ_Project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class IzProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(IzProjectApplication.class, args);
	}

}
