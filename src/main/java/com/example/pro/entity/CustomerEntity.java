package com.example.pro.entity;


import com.example.pro.dto.CustomerDTO;
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

    public static CustomerEntity toEntity(CustomerDTO customerDTO) {
        CustomerEntity customerEntity = new CustomerEntity();
        customerEntity.setCustomerPhone(customerDTO.getCustomerPhone());
        customerEntity.setCustomerMobile(customerDTO.getCustomerMobile());
        customerEntity.setCustomerName(customerDTO.getCustomerName());
        customerEntity.setCustomerAddress1(customerDTO.getCustomerAddress1());
        customerEntity.setCustomerAddress2(customerDTO.getCustomerAddress2());
        customerEntity.setPostCode(customerDTO.getPostCode());
        customerEntity.setJibun(customerDTO.getJibun());
        return customerEntity;
    }

    public static CustomerEntity toUpdate(CustomerDTO customerDTO) {
        CustomerEntity customerEntity = new CustomerEntity();
        customerEntity.setId(customerDTO.getId());
        customerEntity.setCustomerPhone(customerDTO.getCustomerPhone());
        customerEntity.setCustomerMobile(customerDTO.getCustomerMobile());
        customerEntity.setCustomerName(customerDTO.getCustomerName());
        customerEntity.setCustomerAddress1(customerDTO.getCustomerAddress1());
        customerEntity.setCustomerAddress2(customerDTO.getCustomerAddress2());
        customerEntity.setJibun(customerDTO.getJibun());
        customerEntity.setPostCode(customerDTO.getPostCode());
        return customerEntity;
    }
}
