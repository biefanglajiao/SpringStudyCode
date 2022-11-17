package com.AspectJ编程.基于xml实现aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {
    //增强方法（通用方法）
    public  void queue(){
        System.out.println("我在排队");
    }
    public  void  send(){
        System.out.println("我来送票");
    }
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        queue();
        //方法： （与底层的实现 逻辑相同）
        Object proceed = proceedingJoinPoint.proceed();
        send();
        return "这是环绕通知的返回值"+proceed;
    }
}
