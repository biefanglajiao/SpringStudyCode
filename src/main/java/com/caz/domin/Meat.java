package com.caz.domin;

public class Meat {
    private String type="肉肉";

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Meat{" +
                "type='" + type + '\'' +
                '}';
    }
}
