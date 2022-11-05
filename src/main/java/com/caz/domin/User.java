package com.caz.domin;
//依赖注入 setter
public class User {
    private String username;
       public  void show(){
        System.out.println("欢迎"+this.username);
    }
    public void setUsername(String username) {
        this.username = username;
    }


    //进阶 一对多
    private Userinfo xinxi;


    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", xinxi=" + xinxi+
                '}';
    }

    public void setXinxi(Userinfo xinxi) {
        this.xinxi = xinxi;
    }
  //🕐如果两个想要分别 显示   关键点： tostring 方法上
}
