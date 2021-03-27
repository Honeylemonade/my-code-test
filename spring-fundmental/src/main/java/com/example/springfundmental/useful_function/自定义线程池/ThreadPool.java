package com.example.springfundmental.useful_function.自定义线程池;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * ThreadPool:
 *
 * @Author XvYanpeng
 * @Date 2020/7/11 14:48
 */

@Configuration
public class ThreadPool {
    @Bean(name = "threadPoolExecutor")
    public ThreadPoolExecutor myThreadPool() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10,
                100,
                10000L,
                TimeUnit.MILLISECONDS,
                new SynchronousQueue<>());
        return threadPoolExecutor;
    }
}
