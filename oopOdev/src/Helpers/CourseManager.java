package Helpers;
import java.util.ArrayList;
import java.util.List;

import Models.Course;

public class CourseManager {
	
	private List<Course> courses = new ArrayList<Course>();
	
	//Tekil kurs ekleme metodu
	
	public void add(Course course) {
		System.out.println("Basariyla "+course.name + " isimli kurs eklendi.");

	}
	
	//Toplu kurs ekleme metodu
	
	public void add(Course courses[]) {
		System.out.println("-------------------------");
		for (Course course : courses) {
			this.add(course);
			
		}
		System.out.println("Toplu sekilde Basariyla "+courses.length + " kurs eklendi");
	}
	
	//Kurs Guncelleme metodu
	
	public void update(Course course) {
		System.out.println("Basariyla "+course.name + " isimli kurs guncellendi.");
	}
	
	//Kurs Silme metodu
	
	public void delete(Course course) {
		System.out.println("Basariyla " + course.name + " isimli kurs silindi.");
	}
	
	//Kurslari listeler
	
public void getCourseList() {
	
	for(Course course:courses) {
		System.out.println("Id : " + course.id +" - Ismi : "+course.name+" - Ogretmen : "+course.master+" - Tamamlandi : "+course.completeRate);
	}

	}

      //Belirli kurs hakkinda bilgi verir

public void getCourseDetail(Course course) {
	
	System.out.println(course.name+" isimli kurs bilgileri listelendi:Kurs hocasi "+course.master+" Tamamlandi: " +course.completeRate+"%");
}

//Kursa kayit metodu

public void joinCourse(Course course) {
	
	System.out.println("Basariyla " + course.name+" Isimli kursa kayit oldunuz");
}

	
	}
