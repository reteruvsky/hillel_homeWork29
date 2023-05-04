package com.example.homework29.controller;

import com.example.homework29.entity.Product;
import com.example.homework29.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/get/{id}")
    public Product getProduct(@PathVariable Long id) {
        return productService.getById(id);
    }

    @GetMapping("/get/products")
    public List<Product> getAllProducts() {
        return (List<Product>) productService.getAll();
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        productService.delete(id);
    }

    @PostMapping("/create")
    public void create(@RequestBody Product product) {
        productService.create(product);
    }
}
