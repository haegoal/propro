package com.example.pro.controller;

import com.example.pro.dto.CustomerDTO;
import com.example.pro.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/customer")
public class CustomerController {
    private final CustomerService customerService;

    @GetMapping("/read")
    public ResponseEntity read(@RequestParam("customerPhone") String customerPhone){
        System.out.println("customerPhone = " + customerPhone);
        List<CustomerDTO> customerDTOList = customerService.findByCustomerPhone(customerPhone);
        if(customerDTOList.size()!=0){
            return new ResponseEntity<>(customerDTOList, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
