package com.example.test.mycontactsystem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {
    @GetMapping(value="/api/hello")
    public String hello(){
        return "안녕";
    }
}
