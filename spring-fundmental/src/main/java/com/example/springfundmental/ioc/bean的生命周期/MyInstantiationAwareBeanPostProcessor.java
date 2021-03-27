package com.example.springfundmental.ioc.bean的生命周期;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * MyInstantiationAwareBeanPostProcessor:
 *
 * @Author XvYanpeng
 * @Date 2020/7/5 11:43
 */
@Component
public class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {
    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        System.out.println("<通用：实例化前置>InstantiationAwareBeanPostProcessor调用postProcessBeforeInstantiation");
        return InstantiationAwareBeanPostProcessor.super.postProcessBeforeInstantiation(beanClass, beanName);
    }

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        System.out.println("<通用：实例化后置>InstantiationAwareBeanPostProcessor调用postProcessAfterInstantiation");
        return true;
    }

    @Override
    public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
        System.out.println("<通用>InstantiationAwareBeanPostProcessor调用postProcessProperties");
        return pvs;
    }
}
