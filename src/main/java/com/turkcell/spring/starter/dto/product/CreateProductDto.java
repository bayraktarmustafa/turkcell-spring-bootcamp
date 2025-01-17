package com.turkcell.spring.starter.dto.product;


import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

import java.math.BigDecimal;

public class CreateProductDto {
  @NotBlank(message = "İsim boş olamaz")
  @Length(min=3, message = "İsim 3 haneden büyük olmalıdır.")
  private String name;
  @Min(value = 0, message = "Fiyat 0'dan büyük olmak zorundadır.")
  private BigDecimal unitPrice;
  private int stock;
  private int categoryId;

  public int getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(int categoryId) {
    this.categoryId = categoryId;
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
}
