package com.example.springfundmental.aop原理.JDK动态代理;

/**
 * Real:
 *
 * @Author XvYanpeng
 * @Date 2020/5/6 9:50
 */
public class Real implements Subject {
    @Override
    public String doSomthing() {
        System.out.println("我是被代理的对象：做了一些事情");
        return "YES";
    }
}
