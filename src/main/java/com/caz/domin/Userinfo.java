package com.caz.domin;
//依赖注入  构造方法
public class Userinfo {
    private String jieshao;
    private String yixianggongzuo;

    public Userinfo(String jieshao, String yixianggongzuo) {
        this.jieshao = jieshao;
        this.yixianggongzuo = yixianggongzuo;
    }
    public void show(){
        System.out.println(jieshao+"   and     "+yixianggongzuo);
    }


    @Override
    public String toString() {
        return "Userinfo{" +
                "jieshao='" + jieshao + '\'' +
                ", yixianggongzuo='" + yixianggongzuo + '\'' +
                '}';
    }




}
