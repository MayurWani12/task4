package com.task4.entity;

public class Teache {
	
	private int id;
	private int name;
	private City city;    //lossly coupling  
	public Teache(int id, int name, City city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	public Teache() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getName() {
		return name;
	}
	public void setName(int name) {
		this.name = name;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	
	
	

}
