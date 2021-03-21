package com.dibyanshu.customersys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class CustomersysApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomersysApplication.class, args);
    }

}
