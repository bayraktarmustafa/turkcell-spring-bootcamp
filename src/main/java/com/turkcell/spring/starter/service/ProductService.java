package com.turkcell.spring.starter.service;

import com.turkcell.spring.starter.dto.product.CreateProductDto;
import com.turkcell.spring.starter.dto.product.ProductListingDto;

import java.util.List;

public interface ProductService
{
  void add(CreateProductDto createProductDto);
  List<ProductListingDto> getAll();
}
