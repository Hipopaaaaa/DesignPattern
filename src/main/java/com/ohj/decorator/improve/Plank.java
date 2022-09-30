package com.ohj.decorator.improve;

public class Plank extends Decorator{

    public Plank(ExpressDelivery expressDelivery) {
        super(expressDelivery);
        setDescription("木板");
        setPrice(6);
    }
}
