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

    /***
     * @param proxy the proxy instance that the method was invoked on
     *              在其上调用方法的代理实例
     * @param method 代理的方法
     * @param args 切入点的方法参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        MyAspect myAspect = new MyAspect();
        myAspect.queue();
        Object invoke = method.invoke(trainStation, args);//实现连接点方法
        myAspect.send();
        return  invoke;

    }
}
