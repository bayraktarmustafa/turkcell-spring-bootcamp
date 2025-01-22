package com.turkcell.spring.starter.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Table(name="cart_items")
@Entity
public class CartItems
{
    @Id
    @UuidGenerator
    private UUID id;

    @ManyToOne
    @JoinColumn(name="product_id")
    private Product product;

    private int quantity;

    @ManyToOne
    @JoinColumn(name="cart_id")
    private Cart cart;

}
