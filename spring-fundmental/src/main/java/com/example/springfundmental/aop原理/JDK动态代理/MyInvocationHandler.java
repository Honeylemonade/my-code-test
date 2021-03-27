package com.example.springfundmental.aop原理.JDK动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * MyInvocationHandler:
 *
 * @Author XvYanpeng
 * @Date 2020/5/6 10:35
 */
public class MyInvocationHandler implements InvocationHandler {
    //可以是任意类型的被代理对象
    private Object real;

    public MyInvocationHandler(Subject real) {
        this.real = real;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("pre增强");
        //回调被代理方法
        Object result = method.invoke(real, args);
        System.out.println("post增强");
        //返回值就是被代理方法的返回值
        return result;
    }
}
