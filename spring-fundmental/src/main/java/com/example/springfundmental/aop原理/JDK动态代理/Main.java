package com.example.springfundmental.aop原理.JDK动态代理;


import java.lang.reflect.Proxy;

/**
 * Main:
 *
 * @Author XvYanpeng
 * @Date 2020/5/6 9:51
 */
public class Main {
    public static void main(String[] args) {
        Real real = new Real();
        Subject subject = (Subject) Proxy.newProxyInstance(
                real.getClass().getClassLoader(),
                real.getClass().getInterfaces(),
                new MyInvocationHandler(real));

        System.out.println(subject.doSomthing());
    }
}
