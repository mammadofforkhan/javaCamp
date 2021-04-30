import Helpers.*;
import Models.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student ogrenci1 = new Student(1,"Orkhan","Mammadov","+9999999","orkhan@vox.az",100);
Instructor ogretmen1 = new Instructor(1,"Engin","Demirog","+99888888","orkhan@vox.az","22.02.2021");
	
RegisterUI registerUI = new RegisterUI(new InstructorManager());
registerUI.add(ogretmen1);
	}

}
