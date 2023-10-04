package com.example.pro.repository;

import com.example.pro.entity.SymptomsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SymptomsRepository extends JpaRepository<SymptomsEntity, Long> {
    List<SymptomsEntity> findByProductId(Long pid);
}
