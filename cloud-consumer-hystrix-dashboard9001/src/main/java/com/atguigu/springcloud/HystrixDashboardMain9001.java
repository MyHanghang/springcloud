package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author Zhihang
 * @version 1.0
 * @date 2020/4/3 16:50
 **/
@SpringBootApplication
@EnableHystrixDashboard
@EnableCircuitBreaker
public class HystrixDashboardMain9001{
    public static void main(String[] args){
        SpringApplication.
                run(HystrixDashboardMain9001.class, args);
    }
}
