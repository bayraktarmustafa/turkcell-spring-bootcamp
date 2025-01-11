package com.turkcell.spring.starter.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity // orm bu classı tanıyo
@Table(name = "products") // orm bu classı db'deki products tablosu ile eşleştirmeye çalışacak.
public class Product {

  @Column(name="id") // eğer isimler birebir aynı ise bu anotasyon opsiyoneldir.
  private int id;

  @Column(name="name")
  private String name;

  @Column(name="unit_price")
  private double unitPrice;

  @Column(name="stock")
  private int stock;



  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(double unitPrice) {
    this.unitPrice = unitPrice;
  }

  public int getStock() {
    return stock;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }
}
