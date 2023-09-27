package com.example.pro.dto;

import com.example.pro.entity.CustomerEntity;
import com.example.pro.entity.ProductEntity;
import lombok.Data;
import lombok.Setter;

@Data
public class CustomerDTO {
    private Long id;
    private String customerPhone;
    private String customerMobile;
    private String customerName;
    private String customerAddress1;
    private String customerAddress2;
    private String postCode;
    private String jibun;

    public static CustomerDTO toDTO(CustomerEntity customerEntity) {
        CustomerDTO customerDTO = new CustomerDTO();
        customerDTO.setId(customerEntity.getId());
        customerDTO.setCustomerPhone(customerEntity.getCustomerPhone());
        customerDTO.setCustomerMobile(customerEntity.getCustomerMobile());
        customerDTO.setCustomerName(customerEntity.getCustomerName());
        customerDTO.setCustomerAddress1(customerEntity.getCustomerAddress1());
        customerDTO.setCustomerAddress2(customerEntity.getCustomerAddress2());
        customerDTO.setPostCode(customerEntity.getPostCode());
        customerDTO.setJibun(customerEntity.getJibun());
        return customerDTO;
    }
}
