package com.pblgllgs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AppCiCdApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(AppCiCdApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(AppCiCdApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(){
		return args -> LOGGER.info("App run successfully v2");
	}
}
