package com.ohj.command;

public class Client {

    public static void main(String[] args) {
        //使用命令设计模式，通过遥控器，对电灯对操作

        //创建电灯的对象（接收者）
        LightReceiver lightReceiver = new LightReceiver();
        //创建电灯相关的开关命令
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);


        //创建TV对象
        TvReceiver tvReceiver = new TvReceiver();
        //创建TV相关的开关命令
        TvOnCommand tvOnCommand = new TvOnCommand(tvReceiver);
        TvOffCommand tvOffCommand = new TvOffCommand(tvReceiver);

        //需要一个遥控器
        RemoteController remoteController = new RemoteController();
        //给遥控器设置命令，比如no=0是电灯的开关操作,no=1是TV的开关操作
        remoteController.setCommand(0,lightOnCommand,lightOffCommand);
        remoteController.setCommand(1,tvOnCommand,tvOffCommand);

        System.out.println("==========电灯=============");
        System.out.println("========按下'开'=======");
        remoteController.onButtonWasPushed(0);
        System.out.println("========按下'关'=======");
        remoteController.offButtonWasPushed(0);
        System.out.println("========按下'撤销'=======");
        remoteController.undoButtonWasPushed();

        System.out.println("==========TV=============");
        System.out.println("========按下'开'=======");
        remoteController.onButtonWasPushed(1);
        System.out.println("========按下'关'=======");
        remoteController.offButtonWasPushed(1);
        System.out.println("========按下'撤销'=======");
        remoteController.undoButtonWasPushed();
    }
}
