package com.ohj.adapter.objectadapter;

import com.ohj.adapter.classadapter.Voltage220V;

public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter(new Voltage220V())); //充电
    }
}
