package com.zpc.nacousprovider;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("provider")
public class ProviderController {

    @Value("${myName}")
    private String name;

    @GetMapping("hello")
    public String test(){
        return "hello" + name;
    }

    @GetMapping("say")
    public String say(){
        return "我是生产者";
    }


}
