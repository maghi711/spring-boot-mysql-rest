package com.maghi711.springsecurity.repository;

import com.maghi711.springsecurity.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
