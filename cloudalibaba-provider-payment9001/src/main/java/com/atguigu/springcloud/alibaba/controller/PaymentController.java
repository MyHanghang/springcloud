package com.atguigu.springcloud.alibaba.controller;

/*
 *******************************
 *      DATE      2021/1/20
 *      USER      我叫航航航啊
 *******************************
 */


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import sun.rmi.runtime.Log;

@RestController
public class PaymentController{

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/payment/nacos/{id}")
    public String getPayment(@PathVariable("id") Integer id){
        System.out.println(serverPort);
        return "nacos registry,serverPort：" + serverPort + "\t id" + id;
    }
}
