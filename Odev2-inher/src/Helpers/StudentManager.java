package Helpers;

import Models.Student;
import Models.User;

public class StudentManager extends UserManager {

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		System.out.println("Ogrenci Eklendi" + user.getName());
	}
	public void addLesson() {
		// TODO Auto-generated method stub
		System.out.println("Ogrenciye Ders Eklendi");
	}

	
}
