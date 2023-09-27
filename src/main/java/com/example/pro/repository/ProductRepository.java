package com.example.pro.repository;

import com.example.pro.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
    ProductEntity findByModelCodeContaining(String query);

    ProductEntity findByProductCodeContaining(String query);

    ProductEntity findByProductNameContaining(String query);

    ProductEntity findByModelNameContaining(String query);
}
