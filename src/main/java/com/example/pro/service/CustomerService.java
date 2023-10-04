package com.example.pro.service;

import com.example.pro.dto.CustomerDTO;
import com.example.pro.entity.CustomerEntity;
import com.example.pro.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@RequiredArgsConstructor
@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public List<CustomerDTO> findByCustomerPhone(String customerPhone) {
        List<CustomerEntity> customerEntityList = customerRepository.findByCustomerPhone(customerPhone);
        List<CustomerDTO> customerDTOList = new ArrayList<>();
        customerEntityList.forEach(entity -> {
            customerDTOList.add(CustomerDTO.toDTO(entity));
        });
        return customerDTOList;
    }

    public Long save(CustomerDTO customerDTO) {
        CustomerEntity customerEntity= CustomerEntity.toEntity(customerDTO);
        Long savedId = customerRepository.save(customerEntity).getId();
        return savedId;
    }

    public CustomerDTO findById(Long id) {
        CustomerEntity customerEntity= customerRepository.findById(id).orElseThrow(()-> new NoSuchElementException());
        return CustomerDTO.toDTO(customerEntity);
    }

    public void update(CustomerDTO customerDTO) {
        CustomerEntity customerEntity= CustomerEntity.toUpdate(customerDTO);
        customerRepository.save(customerEntity);
    }
}
