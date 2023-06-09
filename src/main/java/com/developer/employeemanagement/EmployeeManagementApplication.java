package com.developer.employeemanagement;

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class EmployeeManagementApplication {

	public static void main(String[] args) {

		SpringApplication.run(EmployeeManagementApplication.class, args);
	}


}
