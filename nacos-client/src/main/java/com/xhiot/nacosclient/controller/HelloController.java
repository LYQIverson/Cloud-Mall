package com.xhiot.nacosclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * Create by Liuyq on 2021/1/5 14:43
 **/
@RestController
public class HelloController {

    @GetMapping(value = "hello")
    public String hello(){
        return "Hello nacos!";
    }
}
