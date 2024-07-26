package edu.icet.crm.controller;



import edu.icet.crm.dto.Customer;
import edu.icet.crm.entity.CustomerEntity;
import edu.icet.crm.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer-controller")
@RequiredArgsConstructor
@CrossOrigin
public class CustomerController {
    final CustomerService customerService;

    @PostMapping("add-customer")
    @ResponseStatus(HttpStatus.CREATED)
    public void addCustomer(@RequestBody Customer customer){
        customerService.addCustomer(customer);

    }
    @GetMapping("get-all-customers")
    public List<CustomerEntity> getAll(){
        return customerService.getAll();
    }
    @DeleteMapping("/delete-customer/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String deleteCustomer(@PathVariable Long id){
        customerService.deleteCustomerById(id);
        return "Deleted";
    }
    @PostMapping("/update-customer")
    public void updateCustomer(@RequestBody Customer customer){
        customerService.updateCustomer(customer);
    }
    @GetMapping("/find-by-customer-id/{id}")
    public Customer findById(@PathVariable Long id){
        return customerService.findById(id);
    }

    @GetMapping("find-by-name/{name}")
    public Customer findByName(@PathVariable String name){
        return customerService.findByName(name);
    }
}
