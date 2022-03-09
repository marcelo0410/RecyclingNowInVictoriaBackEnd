package com.monash.recyclinginvic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@ResponseBody
public class GarbageGameController {
    @GetMapping("/hello")
    public String hello1(){
        return "Hello world!";
    }
}
