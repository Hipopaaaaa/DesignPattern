package com.ohj.decorator.improve;

public class Decorator extends ExpressDelivery{

    private ExpressDelivery expressDelivery;

    public Decorator(ExpressDelivery expressDelivery) {
        this.expressDelivery = expressDelivery;
    }

    @Override
    public double cost() {
        return super.getPrice()+expressDelivery.cost();
    }

    @Override
    public String getDescription() {
        return "物品："+expressDelivery.getDescription()+",包装："+super.getDescription();
    }

}

