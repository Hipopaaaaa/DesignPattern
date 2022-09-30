package com.ohj.decorator.improve;

public class Large extends ExpressDelivery{
    @Override
    public double cost() {
        return super.getPrice();
    }
}
