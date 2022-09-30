package com.ohj.adapter.classadapter;

//适配器类
public class VoltageAdapter extends Voltage220V implements Voltage5V{
    @Override
    public int output5v() {
        //获取到220V电压
        int src=output220v();
        //转成5V电压
        int dst=src/44;
        return dst;
    }
}
