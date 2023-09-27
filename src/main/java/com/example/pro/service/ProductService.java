package com.example.pro.service;

import com.example.pro.dto.ProductDTO;
import com.example.pro.entity.ProductEntity;
import com.example.pro.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public ProductDTO findByModelCodeContaining(String query) {
        ProductEntity productEntity = productRepository.findByModelCodeContaining(query);
        return ProductDTO.toDTO(productEntity);
    }
}
