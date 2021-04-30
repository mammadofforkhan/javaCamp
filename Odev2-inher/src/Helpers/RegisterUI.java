package Helpers;

import Models.Student;
import Models.User;

public class RegisterUI {
	private  User user;
	UserManager userManager;
	public RegisterUI(UserManager userManager) {
		this.userManager = userManager;
		
	}
	public void add(User user) {
		this.user= user;
			this.userManager.add(user);
		
	}
}
