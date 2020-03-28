package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author Zhihang
 * @version 1.0
 * @date 2020/3/27 14:35
 **/
@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping(value = "/payment/consul")
    public String PaymentConsul() {

        return "SpringCloud with consul:" + serverPort + "\t" + UUID.randomUUID().toString();
    }
}
