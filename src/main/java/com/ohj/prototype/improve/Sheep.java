package com.ohj.prototype.improve;

//让该类允许克隆
public class Sheep implements Cloneable{
    private String name;
    private int age;
    private String colour;
    public Sheep friend;


    //克隆该实例，使用默认的clone方法来完成克隆
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Sheep sheep=null;
        //克隆
        sheep=(Sheep) super.clone();
        return sheep;
    }

    public Sheep(String name, int age, String colour) {
        this.name = name;
        this.age = age;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", colour='" + colour + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
