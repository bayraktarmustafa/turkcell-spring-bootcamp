package com.turkcell.spring.starter.repository;

import com.turkcell.spring.starter.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Integer>
{
  Optional<Product> findByName(String name);
  Optional<Product> findByNameIsAndIdIsNot(String name, Integer id);
}
