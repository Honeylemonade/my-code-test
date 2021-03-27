package com.example.springfundmental.SpringAOP的动态代理;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * BuildAspect:
 *
 * @Author XvYanpeng
 * @Date 2020/7/14 21:28
 */
@Slf4j
@Aspect
@Component
public class BuildAspect {
    @Around("execution(* com.example.aop.SpringAOP的动态代理.BuildService.build*(..))")
    public Object succcessLog(ProceedingJoinPoint pjp) throws Throwable {
        String functionName = pjp.getSignature().getName();
        //pre
        log.info("开始build");
        Object retVal = pjp.proceed();
        //after
        return retVal;
    }

    @AfterThrowing(throwing = "error", pointcut = "execution(* com.example.aop.SpringAOP的动态代理.BuildService.build*(..))")
    public void throwingLog(JoinPoint point, Throwable error) {
        String functionName = point.getSignature().getName();
        log.info("build结束");
    }
}
