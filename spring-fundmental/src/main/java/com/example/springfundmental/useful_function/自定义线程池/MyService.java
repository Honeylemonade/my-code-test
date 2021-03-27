package com.example.springfundmental.useful_function.自定义线程池;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Main:
 *
 * @Author XvYanpeng
 * @Date 2020/7/14 21:44
 */
@Component
public class MyService {
    @Autowired
    ThreadPoolExecutor threadPoolExecutor;

    public void doSomething() {
        threadPoolExecutor.execute(() -> {
            System.out.println("执行任务");
        });
    }
}
