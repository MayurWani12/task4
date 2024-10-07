package com.task4.entity;

public class Teacher  extends City{

	private int id;
	private String name;
	
	//strong coupling
	
	//Classes are directly linked, meaning one class relies on the concrete implementation of another class.
	
	//Difficult Maintenance:
	
	public Teacher(int id, String strict, String state, String nation, int id2, String name) {
		super(id, strict, state, nation);
		id = id2;
		this.name = name;
	}
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Teacher(int id, String strict, String state, String nation) {
		super(id, strict, state, nation);
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
