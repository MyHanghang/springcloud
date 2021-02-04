package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName CommonResult
 * @Description TODO
 * @Author 我叫航航航啊
 * @Date 2020/3/29 0:29
 * @Version V2.0
 **/


@Data
@NoArgsConstructor
public class CommonResult<T>{

    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code){
        this.code = code;

    }

    public CommonResult(Integer code, String message){
        this.code = code;
        this.message = message;
    }

    public CommonResult(Integer code, String message, T o){
        this.code = code;
        this.message = message;
        this.data = (T) o;
    }
}