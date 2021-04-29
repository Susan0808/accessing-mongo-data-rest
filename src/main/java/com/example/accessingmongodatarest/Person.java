package com.example.accessingmongodatarest;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class Person {
	
	@Id private String id;

	private String firstName;
	private String lastName;
	
}
