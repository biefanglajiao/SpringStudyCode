package com.bean的生命周期;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
@Component("user2")
//@Scope("singleton")
@Scope("prototype")
public class User {
    @Value("常兆海")
    private  String name;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    @PostConstruct
    public void aa(){
        System.out.println("bean初始化");
    }
    @PreDestroy
    public void ab(){
        System.out.println("bean注销");}

}
