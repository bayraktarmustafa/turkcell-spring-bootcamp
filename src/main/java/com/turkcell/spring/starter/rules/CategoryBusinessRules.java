package com.turkcell.spring.starter.rules;

import com.turkcell.spring.starter.repository.CategoryRepository;
import org.springframework.stereotype.Component;

@Component
public class CategoryBusinessRules {
  private final CategoryRepository categoryRepository;

  public CategoryBusinessRules(CategoryRepository categoryRepository) {
    this.categoryRepository = categoryRepository;
  }

  public void categoryMustExist(Integer id)
  {
    categoryRepository.findById(id).orElseThrow(() -> new RuntimeException("Category not found"));
  }
}
