package com.bean的装配.自动装配;

public class Person {
    private  String job;

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "job='" + job + '\'' +
                '}';
    }
}
