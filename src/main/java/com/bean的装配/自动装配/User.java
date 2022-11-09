package com.bean的装配.自动装配;

public class User {
    private String name;
    private String id;
    private Person person;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", person=" + person +
                '}';
    }
}
