package com.ohj.prototype;

public class Client {
    public static void main(String[] args) {
        //传统方式，克隆10只羊
        Sheep sheep = new Sheep("tom", 1, "白色");
        Sheep sheep2 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColour());
        Sheep sheep3 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColour());
        Sheep sheep4 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColour());
        Sheep sheep5 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColour());
        //...克隆10只

        System.out.println(sheep);
        System.out.println(sheep2);
        System.out.println(sheep3);
        System.out.println(sheep4);
        System.out.println(sheep5);
        //...输出10只
    }
}
