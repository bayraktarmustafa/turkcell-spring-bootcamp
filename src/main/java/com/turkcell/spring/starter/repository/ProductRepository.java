package com.turkcell.spring.starter.repository;

import com.turkcell.spring.starter.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;
import java.util.List;

// DEPO
// Temel işlemleri yapabilen bir ürün depo
public interface ProductRepository extends JpaRepository<Product, Integer>
{
  // 1- Derived Query Methods
  // Avantaj => Basitlik, sql query yazma gereksinimi yok.
  // Dezavantaj => Uzun fonk. isimleri, kısıtlı manual düzenleme. Fonksiyon ismi değiştirme zorunluluğu.
  List<Product> findByNameStartingWithOrderByUnitPrice(String name);


  // 2- JPQL -> SQL + JPA
  @Query(value = "Select p from Product p where p.name LIKE %:name% and p.unitPrice = :price", nativeQuery = false)
  //@Query("Select p from Product p where p.name = ?1 and p.unitPrice= ?2", nativeQuery = false)
  List<Product> search(String name, BigDecimal price);


  // 3- SQL (native)
  @Query(value = "Select * from products p where p.name LIKE %?1% and p.unit_price = ?2", nativeQuery = true)
  List<Product> searchSql(String name, BigDecimal price);
}
