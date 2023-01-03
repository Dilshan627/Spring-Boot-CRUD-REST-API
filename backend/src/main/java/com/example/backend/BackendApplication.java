package com.example.backend;

import com.example.backend.model.Customer;
import com.example.backend.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendApplication /*implements CommandLineRunner*/ {

    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);
    }

   /* @Autowired
    private CustomerRepository customerRepository;
    @Override
    public void run(String... args) throws Exception {
      *//*  Customer customer=new Customer();
        customer.setId("Coo1");
        customer.setFirstName("kamal");
        customer.setLastName("gunathilaka");
        customer.setEmail("gunathilaka@gmail.com");

        customerRepository.save(customer);*//*
    }*/
}
