package com.kamranyaseen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kamranyaseen.model.Customer;
import com.kamranyaseen.repository.CustomerRepository;

@SpringBootApplication
public class SpringRestDataHalBrowserApplication implements CommandLineRunner {

	@Autowired
	CustomerRepository customerRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringRestDataHalBrowserApplication.class, args);
	}
	

	@Override
	public void run(String... args) throws Exception {
		customerRepository.save(new Customer("Jack", "Smith"));
		customerRepository.save(new Customer("Adam", "Johnson"));
		customerRepository.save(new Customer("Kim", "Smith"));
		customerRepository.save(new Customer("David", "Williams"));
		customerRepository.save(new Customer("Peter", "Davis"));
	}
}
