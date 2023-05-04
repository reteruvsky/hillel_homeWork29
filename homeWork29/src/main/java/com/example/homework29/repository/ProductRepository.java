package com.example.homework29.repository;

import com.example.homework29.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface ProductRepository extends CrudRepository<Product, Long> {
}
