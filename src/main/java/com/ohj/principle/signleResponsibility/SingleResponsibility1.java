package com.ohj.principle.signleResponsibility;

public class SingleResponsibility1 {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托车");
        vehicle.run("邮轮");
        vehicle.run("飞机");

    }
}

//交通工具类
//方式一
//问题：run方法中违反了单一职责原则，飞机、邮轮不可能在公路上跑
//解决方案：根据交通工具运行方法不同，分解出多个类
class Vehicle{
    public void run(String vehicle){
        System.out.println(vehicle+" 在公路上跑");
    }
}