package com.turkcell.spring.starter.controller;
import com.turkcell.spring.starter.dto.product.CreateProductDto;
import com.turkcell.spring.starter.dto.product.ProductListingDto;
import com.turkcell.spring.starter.dto.product.UpdateProductDto;
import com.turkcell.spring.starter.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController()
@RequestMapping("/api/v1/products")
public class ProductsController
{

  private final ProductService productService;

  public ProductsController(ProductService productService) {
    this.productService = productService;
  }

  @PostMapping
  public void add(@RequestBody @Valid CreateProductDto createProductDto)
  {
    this.productService.add(createProductDto);
  }

  @GetMapping
  public List<ProductListingDto> getAll() {
    return this.productService.getAll();
  }

  @PutMapping
  public void update(@RequestBody UpdateProductDto updateProductDto)
  {
    this.productService.update(updateProductDto);
  }
}
