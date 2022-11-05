package com.eg;

public class UserDaoImp implements UserDao {

    @Override
    public boolean login(String name, int pwd) {
        if (name.equals("czh") && pwd == 123) return true;
        else return false;
    }
}
