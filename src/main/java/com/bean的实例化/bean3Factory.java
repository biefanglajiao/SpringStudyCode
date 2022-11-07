package com.bean的实例化;

public class bean3Factory {
    public bean3Factory(){
        //先创工厂
        System.out.println("bean3工厂实例化中");
    }
    public bean3 creatbean3(){
        //创建bean3实例的方法
        return new bean3();
    }
    public bean3 creatbean31(){
        return new bean3("asd");
    }
}
