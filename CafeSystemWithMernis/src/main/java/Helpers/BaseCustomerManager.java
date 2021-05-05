package Helpers;

import Models.Customer;

public class BaseCustomerManager implements CustomerService {
	@Override
    public void save(Customer customer){
        System.out.println("Kayit edildi : "+customer.firstName);
    }

    @Override
    public void delete(Customer customer){
        System.out.println("Silindi : "+customer.firstName);
    }
}
