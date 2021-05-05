import java.time.LocalDate;


import Helpers.BaseCustomerManager;
import Managers.NeroManager;
import Managers.StarbucksManager;
import Models.Customer;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  BaseCustomerManager starbuckManager = new StarbucksManager();

	      
	        BaseCustomerManager neroManager = new NeroManager();

	        Customer orkhan = new Customer(1, "Orkhan", "Mammadov", LocalDate.of(1990, 7, 24), "12345678901");

	        Customer resul = new Customer(2, "Resul", "Mesimli", LocalDate.of(1991, 6, 6), "1234567890");
	        System.out.println("---------Starbucks -------");
	        starbuckManager.delete(orkhan);
	        starbuckManager.save(orkhan);
	        starbuckManager.save(resul);
	        System.out.println("");
	        System.out.println("---------Nero Cafe -------");
	        neroManager.save(orkhan);
	        neroManager.save(resul);
	}

}
