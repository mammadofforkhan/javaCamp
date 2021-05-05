package Managers;

import Helpers.BaseCustomerManager;
import Models.Customer;
import Utils.Util;

public class StarbucksManager extends BaseCustomerManager {

	@Override
	public void save(Customer customer) {
		if (Util.checkIfRealPerson(customer)) {
            super.save(customer);
        } else {
            System.out.println(customer.firstName + " : Gercek Kullanici Degil!");
            
        }
	}

	@Override
	public void delete(Customer customer) {
		// TODO Auto-generated method stub
		super.delete(customer);
	}

}
