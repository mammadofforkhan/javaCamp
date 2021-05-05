package Helpers;

import Models.Customer;

public interface CustomerService {

    void save(Customer customer);
    void delete(Customer customer);
}
