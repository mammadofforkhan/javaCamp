package Manager;

import Helpers.BaseCustomerManager;
import Helpers.CustomerCheckService;
import Models.Customer;
import Statics.Utils;

public class GamerManager extends BaseCustomerManager {
	 
	@Override
	public void create(Customer customer) {
		 if (Utils.checkIfRealPerson(customer)) {
	            super.create(customer);
	        }
	        else{
	           System.out.println("Gecerli Bir Kisi Degil");
	        }
	    }
}
