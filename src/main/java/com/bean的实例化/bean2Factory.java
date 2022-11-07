package com.bean的实例化;

public class bean2Factory {
    //使用factory创建bean2实例
    public static bean2 creatbean2(){
        return  new bean2();
    }
    public static bean2 creatbean21(){
        return  new bean2("czh");
    }
}
