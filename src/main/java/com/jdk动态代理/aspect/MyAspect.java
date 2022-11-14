package com.jdk动态代理.aspect;

public class MyAspect {
    //增强方法（通用方法）
    public  void queue(){
        System.out.println("我在排队");
    }
    public  void  send(){
        System.out.println("我来送票");
    }
}
