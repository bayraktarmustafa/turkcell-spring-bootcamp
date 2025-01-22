package com.turkcell.spring.starter.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


@Entity
@Table(name="customers")
public class Customer extends User
{
    @Column(name="customer_number")
    private String customerNumber;

    @OneToOne(mappedBy = "customer")
    private Cart cart;

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }
}
