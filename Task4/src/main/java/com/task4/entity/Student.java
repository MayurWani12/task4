package com.task4.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	private int id;
	private String Name;
	
     private int roll;
     
     private Address address;
     
     
     //constructor injection

	public Student(Address address) {
		super();
		this.address = address;
	}


	
	
	
	
	//setter injection
	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}
     
     
     
     
     
     
     

     
  

}
