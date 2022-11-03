package com.caz.domin;

public class Potato {
    //javabean对象 创建好要改xml
    private String type="土豆";

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Potato{" +
                "type='" + type + '\'' +
                '}';
    }
}
