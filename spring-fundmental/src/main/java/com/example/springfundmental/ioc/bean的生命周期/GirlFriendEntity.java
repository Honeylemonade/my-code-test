package com.example.springfundmental.ioc.bean的生命周期;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * GirlFriendEntity:
 *
 * @Author XvYanpeng
 * @Date 2020/5/5 9:08
 */

public class GirlFriendEntity implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    @Value("桔梗")
    private String name;

    public GirlFriendEntity() {
        System.out.println("调用GirlFriendEntity的无参数构造器方法");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("对name属性进行赋值");
        this.name = name;
    }


    @Override
    public void setBeanName(String s) {
        System.out.println("1.BeanNameAware调用setBeanName方法，将bean的name注入");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("2.BeanFactoryAware调用setBeanFactory方法将BeanFactory实例传入");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("3.ApplicationContextAware调用ApplicationContext方法的setApplicationContext注入上下文");
    }

    //自定义的初始化方法
    @PostConstruct
    public void myInit() {
        System.out.println("①加@PostConstruct注解：调用自定义的init方法");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("②InitializingBean调用afterPropertiesSet方法");
    }

    //自定义销毁方法
    @PreDestroy
    public void myDestroy() {
        System.out.println("调用@PreDestroy自定义的destroy方法");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("调用DisposableBean接口的destroy方法");
    }
}
