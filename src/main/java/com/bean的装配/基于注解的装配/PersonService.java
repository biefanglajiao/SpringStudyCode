package com.bean的装配.基于注解的装配;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PersonService {
@Autowired
//    @Resource(name="personDao")
//@Autowired等价于  @Resource(name="personDao")
    private PersonDao personDao;
    public boolean islogin(String name,String pwd){
        return personDao.selectbyname(name, pwd);
    }
}
