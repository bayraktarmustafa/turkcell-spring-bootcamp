package com.turkcell.spring.starter.service;

import com.turkcell.spring.starter.entity.Product;

import java.util.List;

public interface ProductService
{
  Product add(Product product);
  List<Product> getAll();
  Product getById(int id);
}
