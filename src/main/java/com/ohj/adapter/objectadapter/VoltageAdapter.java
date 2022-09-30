package com.ohj.adapter.objectadapter;

import com.ohj.adapter.classadapter.Voltage220V;

//适配器类
public class VoltageAdapter  implements Voltage5V {
    private Voltage220V voltage220V; //关联关系中的聚合关系

    //通过构造器传入实例
    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5v() {
        int dst=0;
        if(voltage220V!=null){
            //获取到220V电压
            int src=voltage220V.output220v();
            //转成5V电压
            dst=src/44;
        }
        return dst;
    }
}
