package Models;

public class Student extends User {

double ExamPoint;
public Student(int id, String name, String surName, String phoneNumber, String Email,double ExamPoint) {
	super(id,name, surName, phoneNumber,Email);
	this.ExamPoint = ExamPoint;
}
boolean graduated;
public double getExamPoint() {
	return ExamPoint;
}
public void setExamPoint(double examPoint) {
	ExamPoint = examPoint;
}
public boolean isGraduated() {
	if(this.ExamPoint>=50) {
		this.graduated=true;
	}
	else {
		this.graduated=false;
	}
	return graduated;
}


}
