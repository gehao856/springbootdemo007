package com.openlab.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class PayController {

    public  String pay(String out_trade_no){
        return "success";
    }
}
