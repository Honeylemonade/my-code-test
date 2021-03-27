package com.example.springfundmental.ioc.bean的生命周期;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Test:
 *
 * @Author XvYanpeng
 * @Date 2020/5/5 9:18
 */
@Configuration
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Test.class);
        GirlFriendEntity girlFriendEntity = (GirlFriendEntity) context.getBean("girl");
        System.out.println(girlFriendEntity.getName());
        context.close();
    }

    @Bean
    public MyBeanPostProcessor getBean() {
        return new MyBeanPostProcessor();
    }

    @Bean
    public MyBeanFactoryProcessor getBean2() {
        return new MyBeanFactoryProcessor();
    }

    @Bean
    public MyInstantiationAwareBeanPostProcessor getBean3() {
        return new MyInstantiationAwareBeanPostProcessor();
    }

    @Bean
    public GirlFriendEntity girl() {
        GirlFriendEntity girl = new GirlFriendEntity();
        return girl;
    }
}
