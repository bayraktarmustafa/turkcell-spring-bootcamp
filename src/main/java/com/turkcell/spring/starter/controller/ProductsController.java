package com.turkcell.spring.starter.controller;
import com.turkcell.spring.starter.entity.Product;
import com.turkcell.spring.starter.service.ProductService;
import com.turkcell.spring.starter.service.ProductServiceImpl;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/api/v1/products")
public class ProductsController
{
  private ProductService productService;

  // DI -> Dependency Injection Pattern
  public ProductsController(ProductService productService) {
    this.productService = productService;
  }

  @GetMapping()
  public List<Product> getAll() {
    return productService.getAll();
  }

  @GetMapping("{id}")
  public Product getById(@PathVariable int id) {
      return productService.getById(id);
  }

  @PostMapping()
  public Product add(@RequestBody @Valid Product product) {
    return productService.add(product);
  }
  // 8:30
  // Cuma'ya ödev.
  @DeleteMapping("{id}")
  public String delete(@PathVariable int id) {
    return "Silindi ?? Bulunamadı";
  }
  // Cuma'ya ödev.
  @PutMapping()
  public Product update(@RequestBody Product product) {
      return product; // Güncelledikten sonra.
  }
}
