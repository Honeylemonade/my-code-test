package com.example.springfundmental.aop原理.cglib动态代理;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * MyInterceptor:
 *
 * @Author XvYanpeng
 * @Date 2020/5/6 11:39
 */
public class MyInterceptor implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        //o表示被代理对象，objects是方法参数
        System.out.println("pre增强");
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println("pre增强");
        return result;
    }
}
