package com.openlab.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PayController {

    public  String pay(String out_trade_no){
        return "success";
    }

    public void  demo001(String name){
        System.out.println("geao");
    }
}
