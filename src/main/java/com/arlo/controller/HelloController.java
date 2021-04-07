package com.arlo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @Author PCL
 * @Date 2021/4/7 14:51
 * @Version 1.0
 */
@RestController
public class HelloController {

    @GetMapping("/example")
    public String example(){
        return "Hello Spring Boot ~~";
    }
}
