package com.zpc.nacouscustomer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customer")
public class CustomerController {

    @Autowired
    private feighClient feighclient;

    @Value("${myName}")
    private String name;

    @GetMapping("hi")
    public String test(){
        return "hi" + name;
    }

    @GetMapping("heihei")
    public String dosome(){
        return this.feighclient.say();
    }



}
