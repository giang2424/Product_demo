package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

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

    public Optional<Product> getProductByCode(String code) {
        return Optional.ofNullable(productRepository.findByCode(code));
    }


    public Product createProduct(Product productDetails) {
        Product product = new Product();
        product.setId(UUID.randomUUID()); // Generate UUID
        product.setCode(productDetails.getCode());
        product.setName(productDetails.getName());
        product.setCategory(productDetails.getCategory());
        product.setBrand(productDetails.getBrand());
        product.setType(productDetails.getType());
        product.setDescription(productDetails.getDescription());
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