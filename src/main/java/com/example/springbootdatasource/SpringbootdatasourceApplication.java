package com.example.springbootdatasource;

import com.example.springbootdatasource.controller.SpringBootController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {
		DataSourceAutoConfiguration.class
})
public class SpringbootdatasourceApplication implements CommandLineRunner {
	@Autowired
	SpringBootController springBootController;
	public static void main(String[] args) {
		SpringApplication.run(SpringbootdatasourceApplication.class, args);
		System.out.println( "Hello World!" );

	}

	@Override
	public void run(String... strings) throws Exception {
		springBootController.getSub();
	}

}

