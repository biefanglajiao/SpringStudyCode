package com.AspectJ编程.基于注解实现aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class MyAspect {
    @Pointcut("execution(* com.AspectJ编程.基于注解实现aop.target.TrainStation.*(..))")
    public void pointcut(){}
    //增强方法（通用方法）
    @Before("pointcut()")
    public  void queue(){
        System.out.println("我在排队");
    }
    @After("pointcut()")
    public  void  send(){
        System.out.println("我来送票");
    }
    @Around("pointcut()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object proceed = proceedingJoinPoint.proceed();
        return proceed;
    }

}
