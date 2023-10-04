package com.example.pro.dto;

import com.example.pro.entity.ProductEntity;
import com.example.pro.entity.SymptomsEntity;
import lombok.Data;

@Data
public class SymptomsDTO {
    private Long id;
    private String symptoms;
    private Long pid;


    public static SymptomsDTO toDTO(SymptomsEntity symptomsEntity) {
        SymptomsDTO symptomsDTO = new SymptomsDTO();
        symptomsDTO.setId(symptomsEntity.getId());
        symptomsDTO.setSymptoms(symptomsEntity.getSymptoms());
        return symptomsDTO;
    }

}
