package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @ClassName PaymentController
 * @Description TODO
 * @Author 我叫航航航啊
 * @Date 2020/3/13 0:41
 * @Version V2.0
 **/
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        int age = 10;
        if (result > 0) {
            return new CommonResult(200, "插入数据库成功,serverPort:" + serverPort, result);
        } else {
            return new CommonResult(404, "插入数据库失败,serverPort:" + serverPort, null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("调用支付模块数据：" + payment + "O(∩_∩)O哈哈~" + "我是智航啊");
        if (payment != null) {
            return new CommonResult(200, "查询成功,serverPort:" + serverPort, payment);
        } else {
            return new CommonResult(404, "没有对应记录，ID" + id + "serverPort:" + serverPort, null);
        }
    }
}
