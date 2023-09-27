package com.example.pro.dto;

import com.example.pro.entity.ProductEntity;
import lombok.Data;

@Data
public class ProductDTO {
    private Long id;
    private String modelCode;
    private String productCode;
    private String productName;
    private String modelName;
    private String createdAt;

    public static ProductDTO toDTO(ProductEntity productEntity) {
        ProductDTO productDTO = new ProductDTO();
        productDTO.setId(productEntity.getId());
        productDTO.setModelCode(productEntity.getModelCode());
        productDTO.setProductCode(productEntity.getProductCode());
        productDTO.setProductName(productEntity.getProductName());
        productDTO.setModelName(productEntity.getModelName());
//        productDTO.setCreatedAt(productEntity.getCreatedAt());
        return productDTO;
    }
}
