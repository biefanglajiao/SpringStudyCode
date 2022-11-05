package com.eg;

public class UserSeverImp implements UserService{

    private UserDaoImp userDaoImp;

    public UserDaoImp getUserDaoImp() {
        return userDaoImp;
    }

    public void setUserDaoImp(UserDaoImp userDaoImp) {
        this.userDaoImp = userDaoImp;
    }

    @Override
    public boolean login(String name, int pwd) {
        /**
         * 旧   sever调用dao层方法 ；  new dao并使用方法
         */
//        UserDao userDao=new UserDaoImp();
//        return userDao.login("czh",123);
        /**
         * 新 依赖注入
         * 直接创建userdao
         */
        return userDaoImp.login(name,pwd);

    }
}
