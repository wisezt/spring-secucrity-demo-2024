package com.ting.spring.security.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class UserController {

    @GetMapping("/")
    public String getHome(Principal principal){
        return "Home: Hello World! " + principal.getName();
    }

    @GetMapping("/user")
    public String geUser(ModelMap model, Principal principal){

        return "Hello User! " + principal.getName();
    }

    @GetMapping("/admin")
    public String getAdmin(Principal principal){
        return "Hello Admin! " + principal.getName();
    }


    @GetMapping("/test")
    public String getTest(){
        return "Test: Hello World!";
    }



}
