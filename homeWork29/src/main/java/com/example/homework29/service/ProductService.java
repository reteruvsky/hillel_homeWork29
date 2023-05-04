package com.example.homework29.service;

import com.example.homework29.entity.Product;
import com.example.homework29.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product getById(Long id) {
        return productRepository.findById(id).get();
    }

    public List<Product> getAll() {
        return (List<Product>) productRepository.findAll();
    }

    public void delete(Long id) {
        productRepository.deleteById(id);
    }

    public void create(Product product) {
        productRepository.save(product);
    }
}
