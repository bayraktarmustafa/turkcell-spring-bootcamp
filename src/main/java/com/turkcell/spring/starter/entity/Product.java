package com.turkcell.spring.starter.entity;


import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "products")
public class Product {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="id")
  private Integer id;

  @Column(name="name")
  private String name;

  @Column(name="unit_price")
  private BigDecimal unitPrice;

  @Column(name="stock")
  private int stock;

  @ManyToOne()
  @JoinColumn(name="category_id")
  private Category category;

  @OneToMany(mappedBy = "product")
  private List<CartItems> cartItems;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BigDecimal getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(BigDecimal unitPrice) {
    this.unitPrice = unitPrice;
  }

  public int getStock() {
    return stock;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }

  public Category getCategory() {
    return category;
  }

  public void setCategory(Category category) {
    this.category = category;
  }
}
