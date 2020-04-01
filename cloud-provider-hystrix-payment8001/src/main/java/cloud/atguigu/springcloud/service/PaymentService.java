package cloud.atguigu.springcloud.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author Zhihang
 * @version 1.0
 * @date 2020/4/1 15:02
 **/
@Service
public class PaymentService {
    /**
     * 正常访问，肯定ok
     *
     * @param id
     * @return
     */
    public String paymentInfo_OK(Integer id) {
        return "线程池：" + Thread.currentThread().getName() + "paymentInfo_OK,id:" + id + "\t" + "O(∩_∩)O哈哈~";
    }

    public String paymentFeignTimeout(Integer id) {
        int timeNumber = 3;
        try {
            TimeUnit.SECONDS.sleep(timeNumber);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池：" + Thread.currentThread().getName() + "paymentInfo_TimeOut,id:" + id + "\t" + "O(∩_∩)O哈哈~" + "耗时" + timeNumber + "秒钟";
    }
}
