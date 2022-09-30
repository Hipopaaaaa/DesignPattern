package com.ohj.ResponsibilityChain;

//购买请求
public class PurchaseRequest {

    private int type; //请求类型

    private double price;  //金额
    private int id; //第几个请求

    public PurchaseRequest(int type, double price, int id) {
        this.type = type;
        this.price = price;
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }
}
