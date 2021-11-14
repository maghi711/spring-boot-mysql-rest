package com.maghi711.springsecurity.controller;

import com.maghi711.springsecurity.entity.Product;
import com.maghi711.springsecurity.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {


    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/products")
    public List<Product> greet() {
        return productRepository.findAll();
    }

    @GetMapping("/products/{id}")
    public Product getProduct(@PathVariable("id") long id) {
        return productRepository.findById(id).get();
    }

    @PostMapping("/products")
    public Product createProduct(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @PutMapping("/products")
    public Product updateProduct(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable("id") long id) {
        productRepository.deleteById(id);
    }
}
