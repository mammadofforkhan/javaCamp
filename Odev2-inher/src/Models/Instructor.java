package Models;

import java.util.Date;

public class Instructor extends User {
double salary;
String startJoinDate;
public Instructor(int id, String name, String surName, String phoneNumber, String Email,String startJoinDate) {
	super(id,name, surName, phoneNumber,Email);
	this.startJoinDate = startJoinDate;
}
public String getStartJoinDate() {
	return startJoinDate;
}
public void setStarJonDate(String startJoinDate) {
	this.startJoinDate = startJoinDate;
}
public double getSalary() {
	return salary;
}
}
