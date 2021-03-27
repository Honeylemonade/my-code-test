package com.example.springfundmental.useful_function.定时任务;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * ScheduledService:
 * 要在主类上加，@EnableScheduling注解
 *
 * @Author XvYanpeng
 * @Date 2020/7/13 17:29
 */
@Component
public class ScheduledService {
    @Scheduled(cron = "0 0 0 * * ?")
    public void scheduled() {
        System.out.println("=====>>>>>使用cron  {}" + System.currentTimeMillis());
    }

    @Scheduled(fixedRate = 5000)
    public void scheduled1() {
        System.out.println("=====>>>>>fixedRate  {}" + System.currentTimeMillis());
    }

    @Scheduled(fixedDelay = 5000)
    public void scheduled2() {
        System.out.println("=====>>>>>fixedDelay  {}" + System.currentTimeMillis());
    }
}
