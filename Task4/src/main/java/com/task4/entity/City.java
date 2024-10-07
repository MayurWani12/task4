package com.task4.entity;

public class City {
	private int id;
	private String strict;
	private String state;
	private String nation;
	public City(int id, String strict, String state, String nation) {
		super();
		this.id = id;
		this.strict = strict;
		this.state = state;
		this.nation = nation;
	}
	public City() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStrict() {
		return strict;
	}
	public void setStrict(String strict) {
		this.strict = strict;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	@Override
	public String toString() {
		return "City [id=" + id + ", strict=" + strict + ", state=" + state + ", nation=" + nation + "]";
	}
	
  
	
}
