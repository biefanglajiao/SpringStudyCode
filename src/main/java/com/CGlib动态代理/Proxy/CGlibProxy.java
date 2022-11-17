package com.CGlib动态代理.Proxy;

import com.CGlib动态代理.aspect.MyAspect;
import com.CGlib动态代理.target.TrainStation;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CGlibProxy implements MethodInterceptor {
    public  Object craetProxy (TrainStation trainStation){
        Enhancer enhancer =new Enhancer();//1.创建一个动态类对象（它可以自动创建子类实现继承式的代理）
        enhancer.setSuperclass(trainStation.getClass());///3. 确定要增强的类，设置其父类
        enhancer.setCallback(this);//4.添加回调函数（类似拦截器 ，将切入点函数拦截下来后添加增强）
        return enhancer.create();//2.返回创建的代理类
    }

    /***
     * 拦截器拦住后 要不要添加增强
     * @param o 代理对象
     * @param method 真正访问的目标对象的方法
     * @param objects 访问时传的参
     * @param methodProxy 代理的方法
     * @return  o1 切入点方法的返回值
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        MyAspect myAspect=new MyAspect();//3.添加增强
        myAspect.queue();
        Object o1 = methodProxy.invokeSuper(o, objects);//1.以代理的方法找父类的方法
        myAspect.send();
        return o1;//2.o1为切入点方法 的返回值
    }
}
