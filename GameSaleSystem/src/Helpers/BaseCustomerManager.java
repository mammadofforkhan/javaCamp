package Helpers;

import Models.Customer;

public abstract class BaseCustomerManager implements CustomerService {
    @Override
    public void create(Customer customer) {
        System.out.println(customer.getFirstName() + " kaydınız tamamlandı.");
    }

    @Override
    public void delete(Customer customer) {
        System.out.println(customer.getFirstName() + " kaydınız silindi.");

    }

    @Override
    public void update(Customer customer) {
        System.out.println(customer.getFirstName() + " bilgileriniz güncellendi.");

    }
}