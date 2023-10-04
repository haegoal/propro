package com.example.pro.controller;

import com.example.pro.dto.CustomerDTO;
import com.example.pro.dto.SymptomsDTO;
import com.example.pro.service.CustomerService;
import com.example.pro.service.SymptomsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequiredArgsConstructor
@RequestMapping("/symptoms")
public class SymptomsController {
    private final SymptomsService symptomsService;

    @GetMapping("/findByPid")
    public ResponseEntity findByPid(@RequestParam("pid") Long pid){
        List<SymptomsDTO> symptomsDTOList = symptomsService.findByProductId(pid);
        return new ResponseEntity<>(symptomsDTOList, HttpStatus.OK);
    }


}
