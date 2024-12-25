package com.turkcell.spring.starter.service;

import com.turkcell.spring.starter.entity.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//
//@Bean
//@Component
@Service
public class ProductServiceImpl implements ProductService
{
  // In-Memory Çalışma
  private List<Product> productList;

  public ProductServiceImpl() {
    productList = new ArrayList<Product>();
  }

  @Override
  public Product add(Product product) {
    product.setId(1);
    productList.add(product);
    return product;
  }

  @Override
  public List<Product> getAll() {
    return productList;
  }

}
