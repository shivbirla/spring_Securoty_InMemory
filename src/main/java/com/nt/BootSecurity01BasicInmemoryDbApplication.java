package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@SpringBootApplication
public class BootSecurity01BasicInmemoryDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootSecurity01BasicInmemoryDbApplication.class, args);
		System.out.println("BootSecurity01BasicInmemoryDbApplication.main()-proj2");
		
	}
		
	}

