package com.turkcell.spring.starter.service;

import com.turkcell.spring.starter.entity.Product;

import java.math.BigDecimal;
import java.util.List;

public interface ProductService
{
  Product add(Product product);
  List<Product> getAll();
  List<Product> getByName(String name);
  List<Product> getByNameAndPrice(String name, BigDecimal price);
  Product getById(int id);
}
