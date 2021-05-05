package Manager;

import Helpers.BaseCustomerManager;
import Helpers.CustomerCheckService;
import Models.Customer;

public class GamerManager extends BaseCustomerManager {
	 CustomerCheckService customerCheckService;
	  public GamerManager(CustomerCheckService customerCheckService) {
	        this.customerCheckService = customerCheckService;
	    }
	@Override
	public void create(Customer customer) {
		 if (this.customerCheckService.checkIfRealPerson(customer)) {
	            super.create(customer);
	        }
	        else{
	           System.out.println("Gecerli Bir Kisi Degil");
	        }
	    }
}
