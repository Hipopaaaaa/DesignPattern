package com.ohj.decorator;

public abstract class Drink {
    public String description; //描述
    private double price=0;

    //计算费用的抽象方法，要求子类来实现
    public abstract double cost();

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
