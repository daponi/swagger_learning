package com.bjsxt.www.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.PublicKey;

@RestController
public class MyController {

    @GetMapping
    public String getMyMethd(String argA,String argB){
        return "get";
    }

    @PostMapping("post")
    public String postMyMethd(){
        return "post";
    }

    @RequestMapping("req")
    public String requestMyMethd(String req){
        return "request";
    }
}
