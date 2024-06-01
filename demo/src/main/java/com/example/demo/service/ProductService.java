package com.example.demo.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;


@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public List<Product> getProductByType(String type) {
        return productRepository.findByType(type);
    }
    public List<Product> getProductByName(String name) {
        return productRepository.findByName(name);
    }

    public List<Product> getProductsByNamePrefix(String namePrefix) {
        return productRepository.findByNamePrefix(namePrefix);
    }

    public List<Product> getProductsByPriceGreaterThan(double price) {
        return productRepository.findByPriceGreaterThan(price);
    }

    public List<Product> getProductsByQuantityGreaterThan(int quantity) {
        return productRepository.findByQuantityGreaterThan(quantity);
    }

    public List<Product> getProductsByLastImportDateBefore(LocalDate date) {
        return productRepository.findByLastImportDateBefore(date);
    }
    
    public Optional<Product> getProductByCode(String code) {
        return Optional.ofNullable(productRepository.findByCode(code));
    }


    public Product createProduct(Product productDetails) {
        Product product = new Product();
        // product.setId(UUID.randomUUID()); // Generate UUID
        product.setCode(productDetails.getCode());
        product.setName(productDetails.getName());
        product.setCategory(productDetails.getCategory());
        product.setBrand(productDetails.getBrand());
        product.setType(productDetails.getType());
        product.setDescription(productDetails.getDescription());
        product.setPrice(productDetails.getPrice());
        product.setQuantity(productDetails.getQuantity());
        return productRepository.save(product);
    }


    public Optional<Product> updateProduct(String code, Product productDetails) {
        return getProductByCode(code).map(product -> {
            if (productDetails.getName() != null) {
                product.setName(productDetails.getName());
            }
            if (productDetails.getCategory() != null) {
                product.setCategory(productDetails.getCategory());
            }
            if (productDetails.getBrand() != null) {
                product.setBrand(productDetails.getBrand());
            }
            if (productDetails.getType() != null) {
                product.setType(productDetails.getType());
            }
            if (productDetails.getDescription() != null) {
                product.setDescription(productDetails.getDescription());
            }
            if (productDetails.getDescription() != null) {
                product.setDescription(productDetails.getDescription());
            }
            if (productDetails.getPrice() != 0) {
                product.setPrice(productDetails.getPrice());
            }
            if (productDetails.getQuantity() != 0) {
                product.setQuantity(productDetails.getQuantity());
            }
            if (productDetails.getLastImportDate() != null) {
                product.setLastImportDate(productDetails.getLastImportDate());
            }
            return productRepository.save(product);
        });
    }


    public boolean deleteProduct(String code) {
        return getProductByCode(code).map(product -> {
            productRepository.delete(product);
            return true;
        }).orElse(false);
    }
}