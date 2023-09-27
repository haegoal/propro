package com.example.pro.service;

import com.example.pro.dto.CustomerDTO;
import com.example.pro.entity.CustomerEntity;
import com.example.pro.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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
}
