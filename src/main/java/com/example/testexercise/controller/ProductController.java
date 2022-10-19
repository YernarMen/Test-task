package com.example.testexercise.controller;

import com.example.testexercise.model.Products;
import com.example.testexercise.repotsitory.ArticlesRepo;
import com.example.testexercise.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Qualifier("productsServiceImpl")
    @Autowired
    ProductsService service;

    @Autowired
    ArticlesRepo repo;

    @GetMapping("")
    public List<Products> findAllProduct() {
        return service.findAllProducts();
    }
    @GetMapping("/{id}")
    public Optional<Products> findByID(@PathVariable("id") Long id) {
        return service.findProduct(id);
    }

    @PostMapping
    public Products saveProducts(@RequestBody Products products){
        return service.saveProduct(products);
    }

    @PutMapping
    public Products updateProducts(@RequestBody Products products){
        return service.updateProduct(products);
    }

    @DeleteMapping("/{id}")
    public void deleteProducts(@PathVariable("id") Long id){
        service.deleteProduct(id);
    }

}
