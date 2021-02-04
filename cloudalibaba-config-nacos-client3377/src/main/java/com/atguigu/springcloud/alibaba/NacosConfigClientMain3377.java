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

/**
 * @author Shaw_Young
 * @date 2020/8/7 20:11
 */
@EnableDiscoveryClient
@SpringBootApplication
public class NacosConfigClientMain3377 {

    public static void main(String[] args)
    {
        SpringApplication.run(NacosConfigClientMain3377.class,args);
    }

}