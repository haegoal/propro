package com.example.pro.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;

@Setter(AccessLevel.PUBLIC)
@Getter
@ToString
@Entity
@Table(name = "student_table")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20, nullable = false, unique = true)
    private String userId;

    @Column(length = 20, nullable = false)
    private String userPw;

    @Column(length = 20, nullable = false)
    private String userName;

//    @CreationTimestamp
//    private String createdAt;
//
//    @UpdateTimestamp
//    private String updatedAt;
}
