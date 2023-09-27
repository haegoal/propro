package com.example.pro.controller;

import com.example.pro.dto.ProductDTO;
import com.example.pro.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequiredArgsConstructor
@RequestMapping("/product")
public class ProductController {
    private final ProductService productService;

    @GetMapping("/read")
    public ResponseEntity read(@RequestParam("query") String query, @RequestParam("key") String key){
        System.out.println("key = " + key + ", query = " + query);
        if(key.equals("ModelCode")){
            ProductDTO productDTO = productService.findByModelCodeContaining(query);
            System.out.println("productDTO = " + productDTO);
            if(productDTO!=null){
                return new ResponseEntity<>(productDTO, HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(HttpStatus.CONFLICT);
    }
}
