package com.openlab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HubGitController {

    public String sysHelloGitHub(){
        return "github";
    }

}
