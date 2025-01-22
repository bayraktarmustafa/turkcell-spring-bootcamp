package com.turkcell.spring.starter.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.UuidGenerator;

import java.util.List;
import java.util.UUID;

@Table(name="carts")
@Entity
public class Cart {
    @UuidGenerator
    @Id
    private UUID id;

    @OneToOne()
    @JoinColumn(name="customer_id")
    private Customer customer;

    @OneToMany(mappedBy = "cart")
    private List<CartItems> cartItems;
}
