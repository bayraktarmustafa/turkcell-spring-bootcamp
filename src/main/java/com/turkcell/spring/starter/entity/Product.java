package com.turkcell.spring.starter.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;


@Entity // orm bu classı tanıyo
@Table(name = "products") // orm bu classı db'deki products tablosu ile eşleştirmeye çalışacak.
public class Product {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="id") // eğer isimler birebir aynı ise bu anotasyon opsiyoneldir.
  private Integer id;

  @Column(name="name")
  private String name;

  @Column(name="unit_price")
  private BigDecimal unitPrice; // numeric => BigDecimal

  @Column(name="stock")
  private int stock;

  // İlişkiler temsil edilirken FK alan
  // temsil edilmez.
  @ManyToOne()
  @JoinColumn(name="category_id")
  private Category category;


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
