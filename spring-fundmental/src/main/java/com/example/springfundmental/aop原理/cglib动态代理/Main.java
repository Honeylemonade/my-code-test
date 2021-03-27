package com.example.springfundmental.aop原理.cglib动态代理;

import net.sf.cglib.proxy.Enhancer;

/**
 * Main:
 *
 * @Author XvYanpeng
 * @Date 2020/5/6 11:40
 */
public class Main {
    public static void main(String[] args) {
        //代理类对象是由Enhancer类创建的
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Real.class);
        enhancer.setCallback(new MyInterceptor());

        Real realProxy = (Real) enhancer.create();
        realProxy.doSomthing();
    }
}
