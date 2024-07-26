package edu.icet.crm.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.crm.dto.Customer;
import edu.icet.crm.entity.CustomerEntity;
import edu.icet.crm.repository.CustomerRepository;
import edu.icet.crm.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor

public class CustomerServiceImpl implements CustomerService {
    final CustomerRepository customerRepository;
    @Override
    public void addCustomer(Customer customer) {
        CustomerEntity customerEntity = new ObjectMapper().convertValue(customer, CustomerEntity.class);
        customerRepository.save(customerEntity);
    }
    @Override
    public List<CustomerEntity> getAll() {
        return customerRepository.findAll();
    }

    @Override
    public void deleteCustomerById(Long id) {
        if(customerRepository.existsById(id)){
            customerRepository.deleteById(id);
        }
    }

    @Override
    public void updateCustomer(Customer customer) {
        if(customerRepository.findById(customer.getCustomerID()).isPresent()){
            customerRepository.save(new ObjectMapper().convertValue(customer, CustomerEntity.class));

        }
    }

    @Override
    public Customer findById(Long id) {
        if(customerRepository.findById(id).isPresent()){

            Optional<CustomerEntity> byId = customerRepository.findById(id);
            return new ObjectMapper().convertValue(byId.get(), Customer.class);
        }
        return new Customer();
    }

    @Override
    public Customer findByName(String name) {
        return new ObjectMapper().convertValue(customerRepository.findByName(name), Customer.class);

    }
}
