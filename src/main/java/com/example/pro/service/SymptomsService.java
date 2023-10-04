package com.example.pro.service;

import com.example.pro.dto.SymptomsDTO;
import com.example.pro.entity.SymptomsEntity;
import com.example.pro.repository.SymptomsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class SymptomsService {
    private final SymptomsRepository symptomsRepository;

    public List<SymptomsDTO> findByProductId(Long pid) {
        List<SymptomsEntity> symptomsEntityList = symptomsRepository.findByProductId(pid);
        List<SymptomsDTO> symptomsDTOList = new ArrayList<>();
        symptomsEntityList.forEach(entity -> {
            symptomsDTOList.add(SymptomsDTO.toDTO(entity));
        });
        return symptomsDTOList;
    }

}
