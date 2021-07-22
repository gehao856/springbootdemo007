package com.openlab.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.openlab.service.SpringBootService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Reference
    SpringBootService springBootService;

    @RequestMapping("/hello")
    public String helloSpringBoot(String name){
        return springBootService.helloSpringBootDubbo(name);
    }
}
