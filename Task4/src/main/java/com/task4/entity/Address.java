package com.task4.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {

	private int flatid;
	private int strict;
	private int office;
	private int pincode;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int flatid, int strict, int office, int pincode) {
		super();
		this.flatid = flatid;
		this.strict = strict;
		this.office = office;
		this.pincode = pincode;
	}
	public int getFlatid() {
		return flatid;
	}
	public void setFlatid(int flatid) {
		this.flatid = flatid;
	}
	public int getStrict() {
		return strict;
	}
	public void setStrict(int strict) {
		this.strict = strict;
	}
	public int getOffice() {
		return office;
	}
	public void setOffice(int office) {
		this.office = office;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	
	
	
}
