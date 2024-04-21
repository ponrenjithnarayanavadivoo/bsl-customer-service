package com.kastechie.bslcustomer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kastechie.model.Customer;


@RestController
@RequestMapping("/v1/customer-info")
public class BslCustomerController {
    
    @Autowired
    BSLCustomerService bslCustomerService;

    @GetMapping("/customer/{customerId}")
    public Customer getCustomer(@PathVariable int customerId) {
        return bslCustomerService.getCustomer(customerId);
    }

    @PostMapping("/customer")
    public void createCustomer(@RequestBody Customer customer) {
     bslCustomerService.save(customer);
    }

    @GetMapping("/customers")
    public List<Customer> getCustomers() {
        return bslCustomerService.getCustomers();
    }
    
    
    
}
