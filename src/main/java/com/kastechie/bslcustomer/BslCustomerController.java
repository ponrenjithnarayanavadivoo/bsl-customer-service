package com.kastechie.bslcustomer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kastechie.model.Customer;

@RestController
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
    
    
}
