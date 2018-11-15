package com.spean.springboot.pac4j.cas.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spean.springboot.pac4j.cas.support.EnableCasClient;

@SpringBootApplication
@EnableCasClient
public class CasDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CasDemoApplication.class, args);
	}
}
