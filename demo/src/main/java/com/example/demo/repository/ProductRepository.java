package com.example.demo.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Product;
@Repository

public interface ProductRepository extends JpaRepository<Product, Integer> {
    Product findByCode(String code);

    void deleteByCode(String code);

    List<Product> findByType(String type);

    List<Product> findByName(String name);

    @Query("SELECT p FROM Product p WHERE p.name LIKE :namePrefix%")
    List<Product> findByNamePrefix(@Param("namePrefix") String namePrefix);
    
    List<Product> findByPriceGreaterThan(double price);
    
    List<Product> findByQuantityGreaterThan(int quantity);
    List<Product> findByLastImportDateBefore(LocalDate date);
}
