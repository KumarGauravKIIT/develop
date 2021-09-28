package com.mac.microservices.controller;


import com.mac.microservices.config.LimitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mac.microservices.model.Limit;

import javax.security.auth.login.Configuration;

@RestController
public class LimitController {

    @Autowired
    LimitConfiguration limConfig;

    @GetMapping("/limit")
    public Limit retriveLimit(){
        return new Limit(limConfig.getMinimum(), limConfig.getMaximum());
//         return new Limit(1, 1000);
    }

}
