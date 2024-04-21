package com.kastechie.model;


import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name= "CUSTOMERS") 
public class 
CustomerEntity {

    @Id
    @Column(name = "CUSTOMER_ID") 
    @GeneratedValue (strategy = GenerationType.IDENTITY) 
    private int customerId;
    @Column(name = "CUSTOMER_NAME")
    private String customerName;
    @Column(name = "CITY")
    private String city;
    @Column(name = "PROVINCE")
    private String province;
    @Column(name = "POSTAL_CODE")
    private String postalCode;
    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;
    @Column(name = "CREATED_DATE")
    private LocalDateTime createdDate;
    

}
