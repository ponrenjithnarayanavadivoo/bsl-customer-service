package com.kastechie.bslcustomer;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.kastechie.model.Customer;
import com.kastechie.model.CustomerEntity;

@Mapper
public interface EntityMapper { 

     //EntityMapper INSTANCE = Mappers.getMapper(EntityMapper.class);
    
    CustomerEntity mapToCustomerEntity(Customer customer);
    
    @Mapping(target="id" ,source = "customerId")
    Customer mapToCustomer(CustomerEntity customerEntity);
}
