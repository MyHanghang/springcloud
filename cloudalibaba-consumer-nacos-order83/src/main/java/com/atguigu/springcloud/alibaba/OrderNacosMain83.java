package com.atguigu.springcloud.alibaba;

/*
 *******************************
 *      DATE      2021/1/21
 *      USER      我叫航航航啊
 *******************************
 */


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class OrderNacosMain83{

    public static void main(String[] args){
        SpringApplication.run(OrderNacosMain83.class, args);
    }
}
