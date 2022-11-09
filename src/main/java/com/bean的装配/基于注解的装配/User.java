package com.bean的装配.基于注解的装配;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
//测试1  一对一的数据获取
@Component("user")
@Scope("singleton")
public class User {


    @Value("1")
    private int id;
    @Value("zhangsan")
    private  String name;


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


}
