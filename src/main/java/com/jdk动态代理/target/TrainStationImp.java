package com.jdk动态代理.target;

public class TrainStationImp implements TrainStation{

    @Override
    public void sale() {
//        连接点方法
        System.out.println("售票员窗口买票");
    }
}
