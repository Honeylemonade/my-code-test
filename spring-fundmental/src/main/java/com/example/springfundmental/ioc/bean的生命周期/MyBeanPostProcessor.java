package com.example.springfundmental.ioc.bean的生命周期;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * MyBeanPostProcessor:
 *
 * @Author XvYanpeng
 * @Date 2020/5/5 9:17
 */
@Component
public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("<通用：初始化前置>BeanPostProcessor调用postProcessBeforeInitialization");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("<通用：初始化后置>BeanPostProcessor调用postProcessAfterInitialization");
        return bean;
    }
}
