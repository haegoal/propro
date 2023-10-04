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
@Table(name = "symptoms_table")
public class SymptomsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50, nullable = false, unique = true)
    private String symptoms;

    @ManyToOne
    @JoinColumn(name = "pid", referencedColumnName = "id") // 외래 키 이름을 지정
    private ProductEntity product;

}