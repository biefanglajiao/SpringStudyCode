package com.bean的装配.基于注解的装配;

import org.springframework.stereotype.Repository;

@Repository
public class PersonDao {
    public boolean selectbyname(String name,String pwd){//sql语句
        if (name=="czh"&&pwd=="yhf"){
            return true;
        }
        else return false;
    }
}
