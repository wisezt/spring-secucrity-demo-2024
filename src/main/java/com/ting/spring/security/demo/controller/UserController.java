package com.ting.spring.security.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/")
    public String getHome(){
        return "Home: Hello World!";
    }


    @GetMapping("/test")
    public String getTest(){
        return "Test: Hello World!";
    }


}