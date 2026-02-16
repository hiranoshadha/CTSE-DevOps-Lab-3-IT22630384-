package com.sliit.productservice.repository;

import com.sliit.productservice.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // JpaRepository provides all CRUD methods by default
    // You can add custom query methods here if needed
}
