package com.example.pro.controller;

import com.example.pro.dto.CustomerDTO;
import com.example.pro.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/customer")
public class CustomerController {
    private final CustomerService customerService;

    @GetMapping("/read")
    public ResponseEntity read(@RequestParam("customerPhone") String customerPhone, Model model){
        System.out.println("customerPhone = " + customerPhone);
        List<CustomerDTO> customerDTOList = customerService.findByCustomerPhone(customerPhone);
        if(customerDTOList.size()!=0){
            return new ResponseEntity<>(customerDTOList, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping(value =  "/save", consumes = "application/json")
    public ResponseEntity save(@RequestBody CustomerDTO customerDTO){
        System.out.println("customerDTO = " + customerDTO);
        customerService.save(customerDTO);
        return new ResponseEntity<>(customerDTO, HttpStatus.OK);
    }

    @GetMapping("/findById")
    public ResponseEntity findById(@RequestParam("id") Long id){
        CustomerDTO customerDTO = customerService.findById(id);
        return new ResponseEntity<>(customerDTO, HttpStatus.OK);
    }

    @PutMapping(value =  "/update", consumes = "application/json")
    public ResponseEntity update(@RequestBody CustomerDTO customerDTO){
        System.out.println("customerDTO = " + customerDTO);
        customerService.update(customerDTO);
        List<CustomerDTO> customerDTOList = customerService.findByCustomerPhone(customerDTO.getCustomerPhone());
        return new ResponseEntity<>(customerDTOList, HttpStatus.OK);
    }
}
