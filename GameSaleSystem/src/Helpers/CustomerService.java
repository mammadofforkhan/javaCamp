package Helpers;

import Models.Customer;

public interface CustomerService {
    void create(Customer customer);
    void update(Customer customer);
    void delete(Customer customer);
}
