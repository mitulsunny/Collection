package com.iterator;

public class Students {
private String name;
private int roll;
private String email;
private int phone;
public Students(String name, int roll, String email, int phone) {
	super();
	this.name = name;
	this.roll = roll;
	this.email = email;
	this.phone = phone;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getRoll() {
	return roll;
}
public void setRoll(int roll) {
	this.roll = roll;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getPhone() {
	return phone;
}
public void setPhone(int phone) {
	this.phone = phone;
}

}
