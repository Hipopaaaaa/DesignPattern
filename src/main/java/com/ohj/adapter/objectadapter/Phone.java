package com.ohj.adapter.objectadapter;

public class Phone {
    //充电
    public void charging(Voltage5V voltage5V){
        if(voltage5V.output5v()==5){
            System.out.println("电压为5V，可以充电～～");
        }else {
            System.out.println("电压不是5V，无法充电～～");
        }
    }
}
