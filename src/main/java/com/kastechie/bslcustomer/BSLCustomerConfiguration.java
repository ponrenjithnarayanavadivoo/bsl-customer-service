package com.kastechie.bslcustomer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BSLCustomerConfiguration {

    @Bean
    public EntityMapper createBean()
    {
        return new EntityMapperImpl();
    }
}
