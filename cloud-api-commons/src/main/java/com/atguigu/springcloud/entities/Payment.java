package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ClassName Payment
 * @Description TODO
 * @Author 我叫航航航啊
 * @Date 2020/3/29 0:33
 * @Version V2.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {


    private Long id;

    private String serial;


}
