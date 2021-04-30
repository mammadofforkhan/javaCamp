package Helpers;

import Models.Instructor;
import Models.User;

public class InstructorManager extends UserManager {

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		System.out.println("Ogretmen Eklendi" +user.getName() );
	}
	public void addClass() {
		// TODO Auto-generated method stub
		System.out.println("Ogretmene Sinif Eklendi");
	}


}
