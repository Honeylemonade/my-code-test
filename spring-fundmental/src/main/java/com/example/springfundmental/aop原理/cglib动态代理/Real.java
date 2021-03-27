package com.example.springfundmental.aop原理.cglib动态代理;

/**
 * Real:
 *
 * @Author XvYanpeng
 * @Date 2020/5/6 11:38
 */
public class Real {
    public String doSomthing() {
        System.out.println("我是被代理的对象：做了一些事情");
        return "YES";
    }
}
