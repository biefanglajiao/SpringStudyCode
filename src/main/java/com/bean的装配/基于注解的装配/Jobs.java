package com.bean的装配.基于注解的装配;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
//一对多的数据获取
@Component    //括号里不写就是默认类的首小写的对应名
public class Jobs {
    @Value("打工")
    private  String job;
    @Resource  //相当于ref
    private User user;

    @Override
    public String toString() {
        return "Jobs{" +
                "job='" + job + '\'' +
                ", user=" + user +
                '}';
    }
}
