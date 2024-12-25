package com.turkcell.spring.starter.controller;
// Endpoint => İstemci ve Sunucunun birleştiği nokta.
// Schema => HTTP isteğinin tüm yapısı


import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/api/v1/products")
public class ProductsController
{
  // 2 get, 1 post, 1 put, 1 delete, 1 patch
  // Her mappingin en az 1 özelliği ile diğerlerinden ayrılması.

  @GetMapping("turkcell")
  public String turkcell() {
    return "Turkcell";
  }

  @GetMapping("hello/{name}") // HTTP METHODS => GET,POST,PUT,DELETE
  public String hello(@PathVariable String name) {
    return "Hello, " + name;
  }
  @GetMapping("")
  public String goodBye(@RequestParam String name) {
    return "Good Bye, " + name;
  }


}
// Basit veriler -> metinsel -> Query String, Path Variable (URL üzerinden)

// @RequestParam => Query String
// @PathVariable => Path
// Spring Boot
