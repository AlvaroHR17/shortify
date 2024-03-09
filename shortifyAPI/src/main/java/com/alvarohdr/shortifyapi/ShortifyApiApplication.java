package com.alvarohdr.shortifyapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class ShortifyApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShortifyApiApplication.class, args);
	}

}
