package com.turkcell.spring.starter.service;

import com.turkcell.spring.starter.dto.product.CreateProductDto;
import com.turkcell.spring.starter.dto.product.ProductListingDto;
import com.turkcell.spring.starter.entity.Category;
import com.turkcell.spring.starter.entity.Product;
import com.turkcell.spring.starter.repository.CategoryRepository;
import com.turkcell.spring.starter.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService
{
  private final ProductRepository productRepository;
  private final CategoryService categoryService;
  public ProductServiceImpl(ProductRepository productRepository, CategoryService categoryService) {
    this.productRepository = productRepository;
    this.categoryService = categoryService;
  }

  @Override
  public void add(CreateProductDto createProductDto) {
    Category category = categoryService
            .findById(createProductDto.getCategoryId())
            .orElseThrow(() -> new RuntimeException("Category not found"));

    // Manual Mapping
    Product product = new Product();
    product.setName(createProductDto.getName());
    product.setStock(createProductDto.getStock());
    product.setUnitPrice(createProductDto.getUnitPrice());
    product.setCategory(category);

    productRepository.save(product);
  }

  @Override
  public List<ProductListingDto> getAll() {
    /*List<Product> products = productRepository.findAll();

    List<ProductListingDto> productListingDtos = new ArrayList<>();

    for (Product product : products) {
      ProductListingDto productListingDto = new ProductListingDto();
      productListingDto.setId(product.getId());
      productListingDto.setName(product.getName());
      productListingDtos.add(productListingDto);
    }*/

    List<ProductListingDto> productListingDtos = productRepository
            .findAll()
            .stream()
            .map((product) -> new ProductListingDto(product.getId(), product.getName()))
            .toList();

    return productListingDtos;
  }
}
