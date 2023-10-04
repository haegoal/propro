package com.example.pro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home(){
        return "home";
    }


    @GetMapping("/skill")
    public String skill(){
        return "main/skill";
    }

    @GetMapping("/as")
    public String as(){
        return "main/as";
    }
}
