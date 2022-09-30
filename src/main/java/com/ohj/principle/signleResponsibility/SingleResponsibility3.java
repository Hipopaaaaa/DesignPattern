package com.ohj.principle.signleResponsibility;

public class SingleResponsibility3 {
    public static void main(String[] args) {
        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.run("摩托车");
        vehicle2.runAir("飞机");
        vehicle2.runWater("邮轮");
    }
}
//方案三
//问题： 这种修改方法没有对原来对类做大对修改，只是增加类方法
//  没有在类这个级别上遵守单一职责原则，但是在方法级别上仍遵守单一职责原则


class Vehicle2{
    public void run(String vehicle){
        System.out.println(vehicle+" 在公路上跑");
    }

    public void runAir(String vehicle){
        System.out.println(vehicle+" 在天空上跑");
    }
    public void runWater(String vehicle){
        System.out.println(vehicle+" 在水上跑");
    }
}
