package com.niit.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BillingAddress {
	
	@Id
	private int id;
	private int flatOrDoorNo;
	private String name;
	private String street;
	private String area;
	private String city;
	private String country;
	private int pinCode;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getFlatOrDoorNo() {
		return flatOrDoorNo;
	}
	public void setFlatOrDoorNo(int flatOrDoorNo) {
		this.flatOrDoorNo = flatOrDoorNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "BillingAddress [flatOrDoorNo=" + flatOrDoorNo + ", name=" + name + ", street=" + street + ", area="
				+ area + ", city=" + city + ", country=" + country + ", pinCode=" + pinCode + "]";
	}
	
	

}
