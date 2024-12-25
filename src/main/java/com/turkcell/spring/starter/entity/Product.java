package com.turkcell.spring.starter.entity;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//@Data
public class Product {
  private int id;

  @NotBlank
  @Length(min=1, max = 20)
  private String name;

  @Min(1)
  private double price;

  @Min(0)
  private int stock;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getStock() {
    return stock;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
