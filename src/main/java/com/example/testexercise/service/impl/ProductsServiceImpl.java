package com.example.testexercise.service.impl;

import com.example.testexercise.model.Products;
import com.example.testexercise.repotsitory.ProductsRepo;
import com.example.testexercise.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductsServiceImpl implements ProductsService {
    @Autowired
    ProductsRepo repo;

    @Override
    public List<Products> findAllProducts() {
        return repo.findAll();
    }

    @Override
    public Optional<Products> findProduct(Long id) {
        return repo.findById(id);
    }

    @Override
    public Products saveProduct(Products products) {
        return repo.save(products);
    }

    @Override
    public Products updateProduct(Products products) {
        return repo.save(products);
    }

    @Override
    public void deleteProduct(Long id) {
        repo.deleteById(id);

    }
}
