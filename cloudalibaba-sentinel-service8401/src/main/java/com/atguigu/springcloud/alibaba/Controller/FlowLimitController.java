package com.atguigu.springcloud.alibaba.Controller;

/*
 *******************************
 *      DATE      2021/2/4
 *      USER      我叫航航航啊
 *******************************
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
public class FlowLimitController{

    @GetMapping("/testA")
    public String testA(){

//        try{
//            TimeUnit.MILLISECONDS.sleep(800);
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }
        return "------testA";
    }

    @GetMapping("/testB")
    public String testB(){

        return "------testB";
    }
}
