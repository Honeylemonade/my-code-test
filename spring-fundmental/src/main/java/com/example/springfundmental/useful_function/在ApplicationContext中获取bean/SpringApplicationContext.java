package com.example.springfundmental.useful_function.在ApplicationContext中获取bean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * SpringApplicationContext:
 * 通过使用ApplicationContextAware
 *
 * @Author XvYanpeng
 * @Date 2020/7/15 11:52
 */

@Component
public class SpringApplicationContext implements ApplicationContextAware {
    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        synchronized (this.getClass()) {
            if (SpringApplicationContext.applicationContext == null) {
                SpringApplicationContext.applicationContext = applicationContext;
            }
        }
    }

    //获取applicationContext
    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    //通过name获取 Bean.
    public static Object getBean(String name) {
        return getApplicationContext().getBean(name);
    }

    //通过class获取Bean.
    public static <T> T getBean(Class<T> clazz) {
        return getApplicationContext().getBean(clazz);
    }

    //通过name,以及Clazz返回指定的Bean
    public static <T> T getBean(String name, Class<T> clazz) {
        return getApplicationContext().getBean(name, clazz);
    }
}
