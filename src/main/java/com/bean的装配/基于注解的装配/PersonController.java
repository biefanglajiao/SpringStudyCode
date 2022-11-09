package com.bean的装配.基于注解的装配;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class PersonController {

    //根据用户名密码判断登陆成功
    @Resource(name = "personService")
    public PersonService personService;
    public void islogin(String name,String pwd){
        /****
         * 前端获取数据
         */
//        name="czh";
//        pwd="yhf" ;
        if (personService.islogin(name, pwd))
            System.out.println("登录成功");
        else  System.out.println("登录shibai");

    }
}
