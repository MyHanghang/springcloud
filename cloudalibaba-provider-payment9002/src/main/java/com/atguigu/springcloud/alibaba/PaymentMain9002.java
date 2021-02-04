package com.atguigu.springcloud.alibaba;

/*
 *******************************
 *      DATE      2021/1/20
 *      USER      我叫航航航啊
 *******************************
 */


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class PaymentMain9002{

    public static void main(String[] args){
        SpringApplication.run(PaymentMain9002.class, args);
    }
}
