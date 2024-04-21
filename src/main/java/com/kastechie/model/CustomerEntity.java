package com.kastechie.model;


import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

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
    private LocalDateTime createdDate = LocalDateTime.now();
    public int getCustomerId() {
        return customerId;
    }
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getProvince() {
        return province;
    }
    public void setProvince(String province) {
        this.province = province;
    }
    public String getPostalCode() {
        return postalCode;
    }
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public LocalDateTime getCreatedDate() {
        return createdDate;
    }
    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }
    

}
