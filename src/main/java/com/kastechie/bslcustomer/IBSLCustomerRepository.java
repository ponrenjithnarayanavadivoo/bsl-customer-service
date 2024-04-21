package com.kastechie.bslcustomer;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kastechie.model.CustomerEntity;

public interface IBSLCustomerRepository extends JpaRepository<CustomerEntity,Integer> {
    
}
