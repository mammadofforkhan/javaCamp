package Models;

public class User {
int id;
String name;
String surName;
String phoneNumber;
String Email;
public User() {
	
}
public User(int id, String name, String surName, String phoneNumber, String email) {
	super();
	this.id = id;
	this.name = name;
	this.surName = surName;
	this.phoneNumber = phoneNumber;
	Email = email;
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
public String getSurName() {
	return surName;
}
public void setSurName(String surName) {
	this.surName = surName;
}
public String getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}

}
