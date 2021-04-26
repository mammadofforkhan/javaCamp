package oopOdev;

import Helpers.CourseManager;
import Helpers.MasterManager;
import Models.Course;
import Models.Master;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CourseManager courseManager = new CourseManager();
		MasterManager masterManager = new MasterManager();
		
		//Kurslar manuel data
		
		Course course1 = new Course(1,"C# kursu","Engin Demirog",55);
		Course course2 = new Course(2,"Java kursu","Engin Demirog",73);
		Course course3 = new Course(3,"Python kursu","Engin Demirog",13);
		Course course4 = new Course(4,"Ruby","Engin Demirog",0);
		
		//Ogretmenler manual data
		
		Master master1 = new Master(1,"Engin Demirog");
		Master master2 = new Master(1,"Engin Demirog2");
		Master master3 = new Master(1,"Engin Demirog3");
		Master master4 = new Master(1,"Engin Demirog4");
		
		masterManager.add(master1);
		
		Master[] masters = {master2,master3,master4};
		masterManager.add(masters);
		System.out.println("-------------------------");
		masterManager.delete(master1);
		System.out.println("-------------------------");
		masterManager.getMasterList();
		System.out.println("-------------------------");
		courseManager.add(course1);
		Course[] courses = {course2,course3,course4};
		courseManager.add(courses);
		System.out.println("-------------------------");
		courseManager.delete(course1);
		System.out.println("-------------------------");
		courseManager.update(course1);
		System.out.println("-------------------------");
		courseManager.getCourseDetail(course4);
		System.out.println("-------------------------");
	   courseManager.getCourseList();
		

	}

}
