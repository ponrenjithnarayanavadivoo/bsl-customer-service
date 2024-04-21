package com.kastechie.bslcustomer;

import java.time.LocalDateTime;
import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.kastechie.model.Customer;
import com.kastechie.model.CustomerEntity;

@Mapper(imports = LocalDateTime.class)
public interface EntityMapper { 

     //EntityMapper INSTANCE = Mappers.getMapper(EntityMapper.class);
    
     @Mapping(target="createdDate" ,expression = "java(LocalDateTime.now())")
    CustomerEntity mapToCustomerEntity(Customer customer);
    
    @Mapping(target="id" ,source = "customerId")
    Customer mapToCustomer(CustomerEntity customerEntity);

    List<Customer> mapToListCustomer(List<CustomerEntity> listCustomerEntity);
}
