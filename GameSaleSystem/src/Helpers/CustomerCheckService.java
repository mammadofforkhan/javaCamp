package Helpers;

import Models.Customer;

public interface CustomerCheckService {
    boolean checkIfRealPerson(Customer customer);
}
