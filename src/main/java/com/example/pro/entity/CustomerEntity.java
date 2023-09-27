package com.example.pro.entity;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Setter(AccessLevel.PRIVATE)
@Getter
@ToString
@Entity
@Table(name = "customer_table")
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50, nullable = false)
    private String customerPhone;

    @Column(length = 50)
    private String customerMobile;

    @Column(length = 10, nullable = false)
    private String customerName;

    @Column(length = 50)
    private String customerAddress1;

    @Column(length = 50)
    private String customerAddress2;

    @Column(length = 50)
    private String postCode;

    @Column(length = 50)
    private String jibun;
}
