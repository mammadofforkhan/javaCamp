package Utils;

import Models.Customer;


public class Util {
public static boolean checkIfRealPerson(Customer customer) {
	
	return customer.getNationalityId().length()==11;
}
}
