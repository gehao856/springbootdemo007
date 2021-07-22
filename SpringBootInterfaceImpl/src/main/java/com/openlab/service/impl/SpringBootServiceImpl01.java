package com.openlab.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.openlab.service.SpringBootService;

@Service
public class SpringBootServiceImpl01 implements SpringBootService {

    @Override
    public String helloSpringBootDubbo(String name) {
        return "欢迎"+name+"学习SpringBoot整合ZooKeeper!!!";
    }
}
