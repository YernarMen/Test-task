package com.example.testexercise.service;

import com.example.testexercise.model.Products;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface ProductsService {
    List<Products> findAllProducts();
    Optional<Products> findProduct(Long id);
    Products saveProduct(Products products);
    Products updateProduct(Products products);
    void deleteProduct(Long id);
}
