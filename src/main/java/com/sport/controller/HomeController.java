package com.sport.controller;

import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;  
@RestController  
public class HomeController {  
    @RequestMapping("/hello")  
    public String hello(){
    	String test= "manish rawat";
        return test;  
    }  
}  