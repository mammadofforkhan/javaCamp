import business.concretes.AuthManager;
import business.concretes.UserManager;
import core.concretes.TwilioSmsManagerAdapter;
import dataAccess.concretes.HibernateUsersDao;
import entities.concretes.User;

public class Main {

    public static void main(String[] args) {
		User anar=new User(6, "Anar", "Agarzayev", "anar@gmail.com", "123456", true);
		User taleh=new User(6, "Taleh", "Agarzayev", "3348.gmai.com", "123456", true);
		User resul=new User(6, "", "", "resul@vox.az", "123456", true);
		
		
		User xelil = new User(2, "Xelil", "Rzayev", "xelil204@gmail.com", "1256", false);
		
		
		HibernateUsersDao hibernateUsersDao = new HibernateUsersDao();
		TwilioSmsManagerAdapter twilioSmsManagerAdapter = new TwilioSmsManagerAdapter();
		

		
		AuthManager authManager = new AuthManager(new UserManager(hibernateUsersDao, twilioSmsManagerAdapter));
		System.out.println("--------------------"+anar.getFullName()+"-----------");
		authManager.register(anar);
		System.out.println("--------------------"+xelil.getFullName()+"-----------");
		authManager.register(xelil); //sifre kontrolunden gecemedi 6 dan az oldugu icin
		System.out.println("--------------------"+taleh.getFullName()+"-----------");
		authManager.register(taleh); //mail kontrolunden gecemedi mail olmadigi icin
		System.out.println("--------------------"+resul.getEmail()+"-----------");
		authManager.register(resul); //isim soy isim kontrolunden gecemedi bos birakildigi icin
		UserManager userManager = new UserManager(hibernateUsersDao, twilioSmsManagerAdapter);
		System.out.println("---------------- Tum Kullanicilar ---------------");
		userManager.getAll();
		
    }
}
