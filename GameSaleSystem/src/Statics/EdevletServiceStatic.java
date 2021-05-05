package Statics;

import Helpers.CustomerCheckService;
import Models.Customer;

public class EdevletServiceStatic implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return customer.getNationalIdentity().length() == 11;
	}

}
