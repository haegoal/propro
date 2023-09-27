package com.example.pro.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;

@Setter(AccessLevel.PUBLIC)
@Getter
@ToString
@Entity
@Table(name = "product_table")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 10, nullable = false)
    private String modelCode;

    @Column(length = 50, nullable = false)
    private String productCode;

    @Column(length = 20, nullable = false)
    private String productName;

    @Column(length = 20, nullable = false)
    private String modelName;

//    @ColumnDefault("CURRENT_TIMESTAMP")
//    private String createdAt;
}
