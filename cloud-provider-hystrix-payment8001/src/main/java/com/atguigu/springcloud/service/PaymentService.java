package com.atguigu.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName PaymentService
 * @Description TODO
 * @Author 我叫航航航啊
 * @Date 2020/4/1 21:58
 * @Version V2.0
 **/
@Service
public class PaymentService {


    public String paymentInfo_OK(Integer id) {

        return "线程池：" + Thread.currentThread().getName() + "paymentInfo_OK,id:" + id + "\t" + "O(∩_∩)O哈哈~";
    }

    @HystrixCommand(fallbackMethod = "paymentInfo_TimeoutHandler", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "5000")
    })
    public String paymentInfo_TimeOut(Integer id) {
        try {
            TimeUnit.MILLISECONDS.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池：" + Thread.currentThread().getName() + ",id:" + id + "\t" + "O(∩_∩)O哈哈~" + "耗时" + "秒钟";
    }

    public String paymentInfo_TimeoutHandler(Integer id) {
        return "线程池：" + Thread.currentThread().getName() + "系统繁忙或者运行报错，请稍后再试,id:" + id + "\t" + "o(╥﹏╥)o";
    }
}
