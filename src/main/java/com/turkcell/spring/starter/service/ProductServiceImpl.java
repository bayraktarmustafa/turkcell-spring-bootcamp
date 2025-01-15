package com.turkcell.spring.starter.service;

import com.turkcell.spring.starter.entity.Product;
import com.turkcell.spring.starter.repository.ProductRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//
//@Bean
//@Component
@Service
public class ProductServiceImpl implements ProductService
{
  private final ProductRepository productRepository;

  public ProductServiceImpl(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  @Override
  public Product add(Product product) {
    return null;
  }

  @Override
  public List<Product> getAll() {
    return productRepository.findAll();
  }

  @Override
  public List<Product> getByName(String name) {
    return productRepository.searchByCategory(name);
  }

  @Override
  public List<Product> getByNameAndPrice(String name, BigDecimal price) {
    return productRepository.searchSql(name, price);
  }

  @Override
  public Product getById(int id) {
    return null;
  }

}
