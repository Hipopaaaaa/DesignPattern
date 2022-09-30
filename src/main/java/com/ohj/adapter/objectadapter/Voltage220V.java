package com.ohj.adapter.objectadapter;

//被适配的类
public class Voltage220V {
    //输出220V的电压
    public int output220v(){
        int src=220;
        System.out.println("电压="+src+"V");
        return src;
    }
}
