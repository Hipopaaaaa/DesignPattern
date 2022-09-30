package com.ohj.prototype.improve;



public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep sheep = new Sheep("tom", 1, "白色");
        sheep.friend=new Sheep("jack",2,"黑色");
        Sheep sheep2 = (Sheep) sheep.clone(); //克隆
        Sheep sheep3 = (Sheep) sheep.clone(); //克隆
        Sheep sheep4 = (Sheep) sheep.clone(); //克隆
        Sheep sheep5 = (Sheep) sheep.clone(); //克隆


        //会发现sheep.friend.hashCode()都指向了同一个hashCode
        System.out.println(sheep+ "朋友："+sheep.friend.hashCode());
        System.out.println(sheep2+ "朋友："+sheep2.friend.hashCode());
        System.out.println(sheep3+ "朋友："+sheep3.friend.hashCode());
        System.out.println(sheep4+ "朋友："+sheep4.friend.hashCode());
        System.out.println(sheep5+ "朋友："+sheep5.friend.hashCode());

    }

}
