package com.jdk动态代理.proxy;

import com.jdk动态代理.aspect.MyAspect;
import com.jdk动态代理.target.TrainStation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Yellowmermer implements InvocationHandler {
    //创建代理方法
    private TrainStation trainStation;
    //动态代理
    public Object createProxy(TrainStation trainStation){
//        1.yellow 的自我修养 --ClassLoader loader,
        ClassLoader classLoader = Yellowmermer.class.getClassLoader();

//        2.yellow的专业修养（有啥功能） --- Class<?>[] interfaces,
        Class[] interfaces = trainStation.getClass().getInterfaces();

//        3.-- InvocationHandler 调用处理器 找到真正方法
        this.trainStation=trainStation;
        return Proxy.newProxyInstance(classLoader,interfaces,this);



    }

    /****
     *
     *接口方法的实现： 增强的具体形式
     *  */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        MyAspect myAspect = new MyAspect();

        myAspect.queue();
        Object invoke = method.invoke(trainStation, args);//实现连接点方法
        myAspect.send();
        return  invoke;

    }
}
