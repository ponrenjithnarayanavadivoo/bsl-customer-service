package com.kastechie.bslcustomer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kastechie.model.Customer;

@Service
public class BSLCustomerService {
    
    @Autowired
    IBSLCustomerRepository ibslCustomerRepository;
    
    @Autowired
    EntityMapper entityMapper;

    @Transactional
    public void save (Customer customer)
    {
        //CustomerEntity customerEntity = EntityMapper.INSTANCE.mapToCustomerEntity(customer);
        
        ibslCustomerRepository.save(entityMapper.mapToCustomerEntity(customer));
    }
    public Customer getCustomer(int id)
    {
    return(entityMapper.mapToCustomer(ibslCustomerRepository.findById(id).get()));
    }

}
