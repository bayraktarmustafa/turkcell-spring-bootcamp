package com.turkcell.spring.starter.service;

import com.turkcell.spring.starter.entity.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
    // Identification
    Random random = new Random();
    product.setId(random.nextInt(1000));
    productList.add(product);
    return product;
  }

  @Override
  public List<Product> getAll() {
    return productList;
  }

  @Override
  public Product getById(int id) {
    // Java 19 - Stream API
    return productList
            .stream()
            .filter(product-> product.getId() == id)
            .findFirst()
            .orElse(null);
  }

}
