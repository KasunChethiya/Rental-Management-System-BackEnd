package edu.icet.crm.service;

import edu.icet.crm.dto.Customer;
import edu.icet.crm.entity.CustomerEntity;

import java.util.List;

public interface CustomerService {
    void addCustomer(Customer customer);

    List<CustomerEntity> getAll();

    void deleteCustomerById(Long id);

    void updateCustomer(Customer customer);

    Customer findById(Long id);

    Customer findByName(String name);
}
