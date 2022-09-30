package com.ohj.principle.signleResponsibility;

public class SingleResponsibility2 {

    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("摩托车");

        AirVechicle airVechicle = new AirVechicle();
        airVechicle.run("飞机");

        WaterVechicle waterVechicle = new WaterVechicle();
        waterVechicle.run("邮轮");
    }
}

//方案二
//问题：遵守单一职责原则，但是改动太大，即将类分级，同时要修改客户端
//改进： 直接修改Vehicle类，改动的代码会比较少
class RoadVehicle{

    public void run(String vehicle){
        System.out.println(vehicle+"在公路运行");
    }
}

class AirVechicle{

    public void run(String vehicle){
        System.out.println(vehicle+"在天空运行");
    }
}

class WaterVechicle{

    public void run(String vehicle){
        System.out.println(vehicle+"在水里运行");
    }
}