package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author Zhihang
 * @version 1.0
 * @date 2020/4/2 17:19
 **/
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackService fall paymentInfo_OK,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-----PaymentFallbackService fall paymentInfo_TimeOut,o(╥﹏╥)o";
    }
}
