package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class DemoController {
    @RequestMapping(path="/hello")
    public String hello(){
        return "hello world";
    }
}
